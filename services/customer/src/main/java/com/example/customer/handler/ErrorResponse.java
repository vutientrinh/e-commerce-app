package com.example.customer.handler;

import java.util.Map;

public record ErrorResponse(
        Map<String,String> errors
) {
}
