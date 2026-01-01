package com.example.hellopavan.controller;

import com.example.hellopavan.dto.ApiResponse;
import com.example.hellopavan.entity.User;
import com.example.hellopavan.repository.UserRepository;
import com.example.hellopavan.security.JwtUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthController(UserRepository userRepository,
                          PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<Map<String, String>>> login(
            @RequestBody Map<String, String> request
    ) {
        String username = request.get("username");
        String password = request.get("password");

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = JwtUtil.generateToken(
                user.getUsername(),
                user.getRole()
        );


        return ResponseEntity.ok(
                new ApiResponse<>(true, "Login successful",
                        Map.of("token", token))
        );
    }
    @PostMapping("/register")
    public ResponseEntity<ApiResponse<String>> register(
            @RequestBody User user
    ) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        // default role
        user.setRole("USER");

        userRepository.save(user);

        return ResponseEntity.ok(
                new ApiResponse<>(true, "User registered successfully", null)
        );
    }







}
