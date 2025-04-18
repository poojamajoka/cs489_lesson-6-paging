package com.bright.pagingdemo.service;


import com.bright.pagingdemo.dto.request.ProductRequestDto;
import com.bright.pagingdemo.dto.response.ProductResponseDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    ProductResponseDto createProduct(ProductRequestDto dto);

    Page<ProductResponseDto> searchProducts(int page, int pageSize, String sortDirection, String sortBy);

    Page<ProductResponseDto> searchProductByCategory(String category,int page, int pageSize,
                                                     String sortDirection, String sortBy);
}
