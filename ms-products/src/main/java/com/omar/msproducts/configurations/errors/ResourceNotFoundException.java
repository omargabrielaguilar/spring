package com.omar.msproducts.configurations.errors;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Setter
@Getter
public class ResourceNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private final String message;
    private final HttpStatus httpStatus = HttpStatus.NOT_FOUND;

    public ResourceNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
