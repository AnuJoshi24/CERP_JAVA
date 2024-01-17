package com.anupama.cerp.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class ApiResponse {
    private LocalDateTime timestamp;
    private String message;

    public ApiResponse(String message) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }
}
