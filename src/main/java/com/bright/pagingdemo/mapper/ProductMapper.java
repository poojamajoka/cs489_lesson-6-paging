package com.bright.pagingdemo.mapper;

import com.bright.pagingdemo.dto.request.ProductRequestDto;
import com.bright.pagingdemo.dto.response.ProductResponseDto;
import com.bright.pagingdemo.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    Product productRequestDtoToProduct(ProductRequestDto productRequestDto);

    ProductResponseDto productToProductResponseDto(Product product);

    List<ProductResponseDto> productsToProductResponseDtos(List<Product> product);
}
