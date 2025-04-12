package com.bright.pagingdemo.exception;

import com.bright.pagingdemo.exception.product.ProductNotFoundException;
import com.bright.pagingdemo.model.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ApiError> handleProductNotFoundException(ProductNotFoundException e, HttpServletRequest request) {
        ApiError apiError = new ApiError(
                e.getMessage(),
                request.getRequestURI(),
                HttpStatus.BAD_REQUEST.value(),
                Instant.now()
        );
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<ApiError> handleDataIntegrityViolationException(DataIntegrityViolationException e, HttpServletRequest request) {
        ApiError apiError = new ApiError(
                e.getMessage(),
                request.getRequestURI(),
                HttpStatus.CONFLICT.value(),
                Instant.now()
        );
        return new ResponseEntity<>(apiError, HttpStatus.CONFLICT);
    }
}
