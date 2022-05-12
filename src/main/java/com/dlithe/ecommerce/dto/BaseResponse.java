package com.dlithe.ecommerce.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BaseResponse {
    private String message;
    private HttpStatus httpStatus;
    private int httpStatusCode;
    private Object response;
}
