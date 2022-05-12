package com.dlithe.ecommerce.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


import java.io.File;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProductDetails {

    private String productImage;
    private String name;
    private String description;
    private String price;
    private String productId;

//private ProductReview productReview;

}
