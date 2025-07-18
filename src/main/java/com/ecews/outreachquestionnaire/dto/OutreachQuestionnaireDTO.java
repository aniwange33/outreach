package com.ecews.outreachquestionnaire.dto;

import java.time.LocalDateTime;

public class OutreachQuestionnaireDTO {

    private Long id;

    private String clientNumber;

    // BIODATA
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String tribe;
    private String religion;
    private String occupation;
    private String education;
    private String maritalStatus;

    // MEDICAL HISTORY
    private Boolean hasHypertension;
    private Boolean hasDiabetes;
    private Boolean hasAsthma;
    private Boolean hasSickleCell;
    private Boolean currentlySmoking;

    // ANTHROPOMETRY
    private Double weight;
    private Double height;

    // VITAL SIGNS
    private Double temperature;
    private Integer systolicBp;
    private Integer diastolicBp;
    private Integer pulseRate;
    private Integer respiratoryRate;

    // INVESTIGATION RESULTS
    private Double fastingBloodSugar;
    private String bloodSugarType; // "fasting" or "random"
    private String malariaResult;
    private String hepatitisBResult;
    private String hepatitisCResult;
    private String rvsResult;

    // Complaints & Clinical Info
    private String complaints;
    private String examinationFindings;
    private String diagnosis;
    private String treatment;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters (or use Lombok if preferred)
}
