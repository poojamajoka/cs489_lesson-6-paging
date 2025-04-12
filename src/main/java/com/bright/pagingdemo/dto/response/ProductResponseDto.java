package com.bright.pagingdemo.dto.response;

import java.math.BigDecimal;

public record ProductResponseDto(
        Long id,
        String name,
        String category,
        BigDecimal price
) {
}
