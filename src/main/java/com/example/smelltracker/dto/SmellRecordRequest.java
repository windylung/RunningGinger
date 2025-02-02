package com.example.smelltracker.dto;

import lombok.Data;

@Data
public class SmellRecordRequest {
    private Long humidity;
    private Long temperature;
    private Long smell;
}
