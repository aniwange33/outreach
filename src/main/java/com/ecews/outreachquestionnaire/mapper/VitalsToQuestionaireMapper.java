package com.ecews.outreachquestionnaire.mapper;

import com.ecews.outreachquestionnaire.dto.VitalsDTO;
import com.ecews.outreachquestionnaire.model.OutreachQuestionnaire;
import org.springframework.stereotype.Component;

@Component
public class VitalsToQuestionaireMapper {

    public void apply(OutreachQuestionnaire questionnaire, VitalsDTO dto) {         // VITAL SIGNS
        questionnaire.setTemperature(dto.getTemperature());
        questionnaire.setSystolicBp(dto.getSystolicBp());
        questionnaire.setDiastolicBp(dto.getDiastolicBp());
        questionnaire.setPulseRate(dto.getPulseRate());
        questionnaire.setWeight(dto.getWeight());
        questionnaire.setHeight(dto.getHeight());
        questionnaire.setRespiratoryRate(dto.getRespiratoryRate());
    }
}
