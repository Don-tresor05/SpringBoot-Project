package com.springboot.SpringBootProject.dto;

public class UserDTO {
    private String name;
    private String email;

    public UserDTO(){}

    public UserDTO(String name, String email){
        this.name = name;
        this.email = email;
    }

    

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

}
