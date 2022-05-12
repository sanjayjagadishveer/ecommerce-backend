package com.dlithe.ecommerce.serviceImpl;


import com.dlithe.ecommerce.dto.*;
import com.dlithe.ecommerce.entity.MainProduct;
import com.dlithe.ecommerce.entity.Products;
import com.dlithe.ecommerce.repository.MainProductDAO;
import com.dlithe.ecommerce.repository.ProductsDAO;
import com.dlithe.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductsDAO productsDAO;

    @Autowired
    MainProductDAO mainProductDAO;


    @Override
    public ResponseEntity<BaseResponse> getProductDetails(int productId) throws IOException {
        BaseResponse baseResponse = new BaseResponse();
        ProductDatailsResponseDTO productDatailsResponseDTO=new ProductDatailsResponseDTO();
        List<Products> products=productsDAO.findByProductId(productId);
        List<ProductDetails> productDetailsList=new ArrayList<>();
//        Products product=products.get();
        for(Products product:products) {

            ProductDetails productDetails = new ProductDetails();
            productDetails.setName(product.getProductName());
            productDetails.setPrice(product.getPrice());
            productDetails.setProductId(product.getProductId());
            productDetails.setDescription(product.getProductDescription());
            productDetails.setProductImage(product.getImage());

//            File file = new File("product-images/" + product.getImage());
//            Resource fileSystemResource = new FileSystemResource(file);
//            productDetails.setProductImage(fileSystemResource.getFile());
            productDetailsList.add(productDetails);
//        productDetails.setProductReview(productReview);
        }
        productDatailsResponseDTO.setProductDetails(productDetailsList);
        baseResponse.setMessage("Product Fetched Successfully");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(productDatailsResponseDTO);

        return new ResponseEntity<>(baseResponse, HttpStatus.OK );
    }

    @Override
    public ResponseEntity<BaseResponse> getMainProduct() {

        BaseResponse baseResponse = new BaseResponse();
        ProductListResponse productListResponse=new ProductListResponse();
        List<MainProduct> mainProductList =mainProductDAO.mainProductList();
        List<ProductResponse> productResponses = new ArrayList<>();
        for(MainProduct mainProduct :mainProductList){
            ProductResponse productResponse =  new ProductResponse();
            productResponse.setId(mainProduct.getId());
            productResponse.setMainProductImage(mainProduct.getImage());
            productResponse.setMainProductName(mainProduct.getProductName());

            productResponses.add(productResponse);
        }
        productListResponse.setProductResponses(productResponses);
        baseResponse.setMessage("main product Fetched");
        baseResponse.setHttpStatus(HttpStatus.OK);
        baseResponse.setHttpStatusCode(HttpStatus.OK.value());
        baseResponse.setResponse(productListResponse);
        return new ResponseEntity<>(baseResponse, HttpStatus.OK);
    }






//    public ProductDetails getProductDetails(int productId) throws IOException {
//
//        Optional<Products> products=productsDAO.findById(productId);
//        Products product=products.get();
//
//        ProductDetails productDetails =new ProductDetails();
//        productDetails.setName(product.getProductName());
//        productDetails.setPrice(product.getPrice());
//        productDetails.setDescription(product.getProductDescription());
//
//        ProductReview productReview=new ProductReview();
//        productReview.setReview("that is good quality and smoothness ");
//        productReview.setName("nik");
//        productReview.setRating("4.5");
//
//        File file = new File("product-images/" + product.getImage());
//        Resource fileSystemResource = new FileSystemResource(file);
//        productDetails.setProductImage(fileSystemResource.getFile());
//        productDetails.setProductReview(productReview);
//
//
//        return productDetails;
//    }
}
