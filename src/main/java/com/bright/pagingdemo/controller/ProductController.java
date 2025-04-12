package com.bright.pagingdemo.controller;

import com.bright.pagingdemo.dto.request.ProductRequestDto;
import com.bright.pagingdemo.dto.response.ProductResponseDto;
import com.bright.pagingdemo.model.Product;
import com.bright.pagingdemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDto> createSSD(@RequestBody ProductRequestDto productRequestDto) {
        ProductResponseDto productResponseDto = productService.createProduct(productRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponseDto);
    }


}
