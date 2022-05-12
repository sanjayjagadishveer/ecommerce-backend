package com.dlithe.ecommerce.serviceImpl;

import com.dlithe.ecommerce.dto.AdminLoginRequest;
import com.dlithe.ecommerce.dto.AdminRegisterRequest;
import com.dlithe.ecommerce.dto.BaseResponse;
import com.dlithe.ecommerce.entity.Admin;
import com.dlithe.ecommerce.repository.AdminDAO;
import com.dlithe.ecommerce.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDAO adminDAO;

    @Override
    public ResponseEntity<BaseResponse> adminRegistration(AdminRegisterRequest adminRegisterRequest) {
        BaseResponse baseResponse = new BaseResponse();
        Admin login = new Admin();
        login.setFullName(adminRegisterRequest.getFullName());
        login.setEmail(adminRegisterRequest.getEmail());
        login.setPhoneNumber(adminRegisterRequest.getPhoneNumber());
        login.setPassword(adminRegisterRequest.getPassword());
        login.setConfirmPassword(adminRegisterRequest.getConfirmPassword());

        adminDAO.save(login);

        baseResponse.setMessage(" Register successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<BaseResponse> adminLogin(AdminLoginRequest adminLoginRequest) {
        Optional<Admin> admin = Optional.ofNullable(adminDAO.login(adminLoginRequest.getEmail(), adminLoginRequest.getPassword()));
        BaseResponse baseResponse = new BaseResponse();
        if (!admin.isPresent()) {
            baseResponse.setMessage("User Not Found");
            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.NOT_FOUND);
        }
        baseResponse.setMessage("Successfully Login");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(admin);
        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK);
    }


}
