//package com.dlithe.ecommerce.serviceImpl;
//
//import com.dlithe.ecommerce.dto.BaseResponse;
//import com.dlithe.ecommerce.dto.OrderDetailsRequest;
//import com.dlithe.ecommerce.entity.Admin;
//import com.dlithe.ecommerce.repository.OrderDAO;
//import com.dlithe.ecommerce.service.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class OrderServiceImpl implements OrderService {
//
//    @Autowired
//    private OrderDAO orderDAO;
//
//
//    @Override
//    public ResponseEntity<BaseResponse> placeOrder(OrderDetailsRequest orderDetailsRequest) {
//
////        Optional<Admin> admin = Optional.ofNullable(orderDAO.order(orderDetailsRequest.getProductName(),orderDetailsRequest.get);
////        BaseResponse baseResponse = new BaseResponse();
////        if (!admin.isPresent()) {
////            baseResponse.setMessage("User Not Found");
////            baseResponse.setHttpStatus(HttpStatus.NOT_FOUND);
////            baseResponse.setHttpStatusCode(HttpStatus.NOT_FOUND.value());
////            return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.NOT_FOUND);
////        }
////        baseResponse.setMessage("Successfully Login");
////        baseResponse.setHttpStatus(HttpStatus.OK);
////        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
////        baseResponse.setResponse(admin);
////        return new ResponseEntity<BaseResponse>(baseResponse, HttpStatus.OK);
////
//       return null;
//    }
//
//}
