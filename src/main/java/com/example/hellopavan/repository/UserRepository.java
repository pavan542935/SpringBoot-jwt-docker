package com.example.hellopavan.repository;

import com.example.hellopavan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {


    Optional<User> findByUsername(String username);

}


/*
 this is created internally in this userRepository which we cant see its spring boot work
class UserRepositoryImpl {
    save(User user) { ... }
    findAll() { ... }
    findById(Long id) { ... }
    deleteById()
}
*/
