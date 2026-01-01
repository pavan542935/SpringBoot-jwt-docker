package com.example.hellopavan.dto;
// dto - data transfer object (dto is just a java object which shows the data , it will not map it to the data base  )

public class UserDto {
    private Long id;
    private String name;
    private String email;

    public UserDto(){

    }

    public UserDto(Long id,String name,String email){
        this.id = id;
        this.name = name;
        this.email =email;
    }

    // getters and setters

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id =id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
}
