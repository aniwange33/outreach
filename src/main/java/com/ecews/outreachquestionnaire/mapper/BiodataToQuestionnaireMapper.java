package com.ecews.outreachquestionnaire.mapper;

import com.ecews.outreachquestionnaire.dto.BiodataDTO;
import com.ecews.outreachquestionnaire.model.OutreachQuestionnaire;
import org.springframework.stereotype.Component;


@Component
public class BiodataToQuestionnaireMapper {

    public void  apply(OutreachQuestionnaire questionnaire, BiodataDTO dto) {
        questionnaire.setName(dto.getName());
        questionnaire.setAge(dto.getAge());
        questionnaire.setSex(dto.getSex());
        questionnaire.setAddress(dto.getAddress());
        questionnaire.setTribe(dto.getTribe());
        questionnaire.setReligion(dto.getReligion());
        questionnaire.setOccupation(dto.getOccupation());
        questionnaire.setEducation(dto.getEducation());
        questionnaire.setMaritalStatus(dto.getMaritalStatus());
    }

}