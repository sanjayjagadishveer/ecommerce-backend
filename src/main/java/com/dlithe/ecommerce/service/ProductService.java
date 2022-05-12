package com.dlithe.ecommerce.service;

import com.dlithe.ecommerce.dto.BaseResponse;
import com.dlithe.ecommerce.dto.ProductDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public interface ProductService {

    ResponseEntity<BaseResponse> getProductDetails(int productId) throws IOException;

    ResponseEntity<BaseResponse> getMainProduct();


//    ResponseEntity<BaseResponse> getMainProduct();
}
