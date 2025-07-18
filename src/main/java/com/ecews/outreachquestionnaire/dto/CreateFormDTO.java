package com.ecews.outreachquestionnaire.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class CreateFormDTO {
    @NotBlank
    private String clientNumber;

}
