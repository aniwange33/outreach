package com.ecews.outreachquestionnaire.service.serviceImp;

import com.ecews.outreachquestionnaire.dto.*;
import com.ecews.outreachquestionnaire.model.OutreachQuestionnaire;
import com.ecews.outreachquestionnaire.repository.OutreachQuestionnaireRepository;
import com.ecews.outreachquestionnaire.service.OutreachQuestionnaireService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OutreachQuestionnaireServiceImp implements OutreachQuestionnaireService {

    private final OutreachQuestionnaireRepository outreachQuestionnaireRepository;

    @Override
    @Transactional
    public Long create(CreateFormDTO dto) {
        boolean existsByClientNumber = outreachQuestionnaireRepository.existsByClientNumber(dto.getClientNumber());
        if (existsByClientNumber) throw new IllegalArgumentException("Client number "+dto.getClientNumber() + " already exists");
        OutreachQuestionnaire questionnaire = new OutreachQuestionnaire();
        questionnaire.setClientNumber(dto.getClientNumber());
        return outreachQuestionnaireRepository.save(questionnaire).getId();
    }

    @Override
    public Long updateInvestigations(Long id, InvestigationDTO dto) {
        return 0L;
    }

    @Override
    public Long updateClinicalReview(long id, ClinicalReviewDTO dto) {
        return 0L;
    }

    @Override
    public Long updateVitals(Long id, VitalsDTO dto) {
        return 0L;
    }

    @Override
    public Long updateMedicalHistory(Long id, MedicalHistoryDTO dto) {
        return 0L;
    }

    @Override
    public Long updateBiodata(Long id, BiodataDTO dto) {
        return 0L;
    }

    @Override
    public OutreachQuestionnaireDTO findById(Long id) {
        return null;
    }

    @Override
    public OutreachQuestionnaireDTO findByClientNumber(String ClientNumber) {
        return null;
    }
}
