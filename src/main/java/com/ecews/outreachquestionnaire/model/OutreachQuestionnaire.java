package com.ecews.outreachquestionnaire.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "outreach_questionnaire")
@Getter
@Setter
public class OutreachQuestionnaire  extends Auditable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Version
    private Integer version;

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
    private String malariaResult;  // "positive" or "negative"
    private String hepatitisBResult;
    private String hepatitisCResult;
    private String rvsResult;

    // Complaints & Clinical Info
    @Column(length = 4000)
    private String complaints;

    @Column(length = 4000)
    private String examinationFindings;

    @Column(length = 2000)
    private String diagnosis;

    @Column(length = 8000)
    private String treatment;



    // Constructors, Getters, Setters
}
