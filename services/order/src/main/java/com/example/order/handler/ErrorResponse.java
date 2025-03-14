package com.example.order.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String,String> errors
) {
}
