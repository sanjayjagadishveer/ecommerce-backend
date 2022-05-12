package com.dlithe.ecommerce.controller;

import com.dlithe.ecommerce.dto.AdminLoginRequest;
import com.dlithe.ecommerce.dto.AdminRegisterRequest;
import com.dlithe.ecommerce.dto.BaseResponse;
import com.dlithe.ecommerce.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@CrossOrigin(origins = "*")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("register")
    public ResponseEntity<BaseResponse> adminRegistration(@RequestBody AdminRegisterRequest adminRegisterRequest) {
        if (adminRegisterRequest == null) {
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("customer detail should be register or not");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());

        }

        return adminService.adminRegistration(adminRegisterRequest);
    }




    @PostMapping("login")
    public ResponseEntity<BaseResponse> adminLogin(@RequestBody AdminLoginRequest adminLoginRequest){
        if(adminLoginRequest  == null){
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("customer details should not be null");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
        }
        return adminService.adminLogin(adminLoginRequest);
    }


}
