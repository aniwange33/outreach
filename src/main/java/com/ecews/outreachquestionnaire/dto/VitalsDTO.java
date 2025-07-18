package com.ecews.outreachquestionnaire.dto;

import lombok.Data;

@Data
public class VitalsDTO {
    private Double weight;
    private Double height;
    private Double temperature;
    private Integer systolicBp;
    private Integer diastolicBp;
    private Integer pulseRate;
    private Integer respiratoryRate;
}