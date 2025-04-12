package com.bright.pagingdemo.exception;

import java.time.Instant;

public record ApiError(
        String message,
        String path,
        Integer httpStatusCode,
        Instant instant
) {
}
