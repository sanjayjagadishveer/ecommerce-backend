//package com.dlithe.ecommerce.controller;
//
//import com.dlithe.ecommerce.dto.AdminRegisterRequest;
//import com.dlithe.ecommerce.dto.BaseResponse;
//import com.dlithe.ecommerce.dto.OrderDetailsRequest;
//import com.dlithe.ecommerce.service.OrderService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Slf4j
//@CrossOrigin(origins = "*")
//public class OrderController {
//
//    @Autowired
//    private OrderService orderService;
//
//    @PostMapping("place-order")
//    public ResponseEntity<BaseResponse> placeOrder(@RequestBody OrderDetailsRequest orderDetailsRequest) {
//        if (orderDetailsRequest == null) {
//            BaseResponse baseResponse = new BaseResponse();
//            baseResponse.setMessage("Not yet Order");
//            baseResponse.setHttpStatus(HttpStatus.BAD_REQUEST);
//            baseResponse.setHttpStatusCode(HttpStatus.BAD_REQUEST.value());
//
//        }
//
//        return orderService.placeOrder(orderDetailsRequest);
//    }
//
//
//}
