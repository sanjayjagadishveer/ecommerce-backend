package com.dlithe.ecommerce.controller;

import com.dlithe.ecommerce.dto.AdminLoginRequest;
import com.dlithe.ecommerce.dto.BaseResponse;
import com.dlithe.ecommerce.dto.ProductDetails;
import com.dlithe.ecommerce.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.IOException;

@RestController

@Slf4j
@CrossOrigin(origins ="*")
public class ProductController {

     @Autowired
    private ProductService productService;


    @GetMapping("get-product-details/{productId}")
    public ResponseEntity<BaseResponse> fetchProductDetails(@PathVariable int productId) throws IOException {
        if(productId  == 0 || String.valueOf(productId)==null){
            BaseResponse baseResponse = new BaseResponse();
            baseResponse.setMessage("not found");
            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
            return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
        }


        return productService.getProductDetails(productId);
    }

    @GetMapping("get-main-product")
    public  ResponseEntity<BaseResponse>  getMainProductList(){

        return productService.getMainProduct();
    }















    //
//    @GetMapping("get-product-List/{productId}")
//    private ProductListRequest fetchTheProductList(@PathVariable int productId){
//
//        return productService.getProductList(productId);
//    }










//    @GetMapping("get-product-detail/{productId}")
//
//    public ResponseEntity<BaseResponse> getProductList(@PathVariable int productId){
//
//        if(productId  == 0 || String.valueOf(productId)==null){
//            BaseResponse baseResponse = new BaseResponse();
//            baseResponse.setMessage("not found");
//            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
//            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
//            return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
//        }
//
//
//        return productService.getProductDetails(productId);
//    }




//    public ResponseEntity<BaseResponse> adminLogin(@RequestBody AdminLoginRequest adminLoginRequest){
//        if(adminLoginRequest  == null){
//            BaseResponse baseResponse = new BaseResponse();
//            baseResponse.setMessage("not found");
//            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
//            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
//            return new ResponseEntity<>(baseResponse, HttpStatus.BAD_REQUEST);
//        }
//        return adminService.adminLogin(adminLoginRequest);
//    }
//
//    @GetMapping("get-product-details")
//    public ResponseEntity<BaseResponse> getProductDetail(@RequestBody  ) {




}
