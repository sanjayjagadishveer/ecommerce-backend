package com.dlithe.ecommerce.dto;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

@ToString
public class AdminRegisterRequest {

    private String fullName;

    private String email;
    private String phoneNumber;
    private String password;
    private  String confirmPassword;
}

