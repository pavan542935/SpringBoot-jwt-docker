package com.example.hellopavan.controller;

import com.example.hellopavan.dto.ApiResponse;
import com.example.hellopavan.dto.UserResponse;
import com.example.hellopavan.entity.User;
import com.example.hellopavan.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<UserResponse>> createUser(@RequestBody User user) {
        User savedUser = userService.createUser(user);

        ApiResponse<UserResponse> apiResponse =
                new ApiResponse<>(true, "User created successfully",
                        userService.toResponse(savedUser));

        return ResponseEntity.status(HttpStatus.CREATED).body(apiResponse);
    }


    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }


    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<UserResponse>> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        UserResponse response = userService.toResponse(user);

        ApiResponse<UserResponse> apiResponse = new ApiResponse<>(true, "User fetched successfully", response);

        return ResponseEntity.ok(apiResponse);
    }

    @PutMapping("/{id}")
    public User updateUser(
            @PathVariable Long id,
            @RequestBody User userDto
    ) {
        return userService.updateUser(id, userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/me")
    public ResponseEntity<ApiResponse<UserResponse>> getLoggedInUser() {

        String username = SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName();

        User user = userService.getCurrentUser(username);

        return ResponseEntity.ok(
                new ApiResponse<>(
                        true,
                        "Logged-in user fetched successfully",
                        userService.toResponse(user)
                )
        );
    }


}

