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
public class ProductResponse {
    private int id;
    private String mainProductName;
    private String mainProductImage;
}
