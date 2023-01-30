package com.micronisa.testapidemo;

import lombok.Data;

@Data
public class ApiResponse {
    private String status;
    private String statuscode;
    private String message;
}
