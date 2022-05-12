package com.dlithe.ecommerce.service;

import com.dlithe.ecommerce.dto.AdminLoginRequest;
import com.dlithe.ecommerce.dto.AdminRegisterRequest;
import com.dlithe.ecommerce.dto.BaseResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface AdminService {
    ResponseEntity<BaseResponse> adminRegistration(AdminRegisterRequest adminRegisterRequest);

    ResponseEntity<BaseResponse> adminLogin(AdminLoginRequest adminLoginRequest);
}
