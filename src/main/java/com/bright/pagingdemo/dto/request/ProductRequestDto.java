package com.bright.pagingdemo.dto.request;

import java.math.BigDecimal;

public record ProductRequestDto(
        String name,
        String category,
        BigDecimal price
) {
}
