package com.example.hellopavan.service;
// interface(no logic)
import com.example.hellopavan.dto.UserResponse;
import com.example.hellopavan.entity.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

    User updateUser(Long id, User user);

    void deleteUser(Long id);

    UserResponse toResponse(User user);

    User getCurrentUser(String username);

}
