package com.ecews.outreachquestionnaire.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NonNull;

@Data
public class BiodataDTO {
    @NotBlank
    private String name;
    @NonNull
    private Integer age;
    @NotBlank
    private String sex;
    @NotBlank
    private String address;
    private String tribe;
    private String religion;
    private String occupation;
    private String education;
    private String maritalStatus;
}