package com.example.hellopavan.entity;
// this entity where the user input and the database is maped together and send to the dto to display the data
import jakarta.persistence.*;

//Entity is used when you call:
//userRepository.save(user);

@Entity//This class represents a database table  (spring will create a table)
@Table(name = "users")
public class User {

    @Id   //     “This field is the PRIMARY KEY”
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //Database will auto-generate ID”(you should not send id manually any more)
    private Long id;

    @Column(unique = true,nullable = false)
    private String name;
    @Column(unique = true,nullable = false)
    private String email;

    @Column(unique = true,nullable = false)
    private String username;
    private String password;
    private String role;



    public User() {
    }

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String  role) {
        this.role = role;
    }



}
