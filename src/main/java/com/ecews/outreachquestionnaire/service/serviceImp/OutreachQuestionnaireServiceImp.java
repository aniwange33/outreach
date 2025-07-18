package com.ecews.outreachquestionnaire.service.serviceImp;

import com.ecews.outreachquestionnaire.dto.*;
import com.ecews.outreachquestionnaire.mapper.BiodataToQuestionnaireMapper;
import com.ecews.outreachquestionnaire.mapper.VitalsToQuestionaireMapper;
import com.ecews.outreachquestionnaire.model.OutreachQuestionnaire;
import com.ecews.outreachquestionnaire.repository.OutreachQuestionnaireRepository;
import com.ecews.outreachquestionnaire.service.OutreachQuestionnaireService;
import lombok.RequiredArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OutreachQuestionnaireServiceImp implements OutreachQuestionnaireService {

    private final OutreachQuestionnaireRepository outreachQuestionnaireRepository;
    private final BiodataToQuestionnaireMapper biodataToQuestionnaireMapper;
    private final VitalsToQuestionaireMapper vitalsToQuestionaireMapper;

    @Override
    @Transactional
    public Long create(CreateFormDTO dto) {
        boolean existsByClientNumber = outreachQuestionnaireRepository.existsByClientNumber(dto.getClientNumber());
        if (existsByClientNumber)
            throw new IllegalArgumentException("Client number " + dto.getClientNumber() + " already exists");
        OutreachQuestionnaire questionnaire = new OutreachQuestionnaire();
        questionnaire.setClientNumber(dto.getClientNumber());
        return outreachQuestionnaireRepository.save(questionnaire).getId();
    }

    @Override
    @Transactional
    public Long updateBiodata(Long id, BiodataDTO dto) {
        OutreachQuestionnaire questionnaire = getOutreachQuestionnaire(id);
        biodataToQuestionnaireMapper.apply(questionnaire, dto);
        return questionnaire.getId();
    }

    @Override
    @Transactional
    public Long updateVitals(Long id, VitalsDTO dto) {
        OutreachQuestionnaire questionnaire = getOutreachQuestionnaire(id);
        vitalsToQuestionaireMapper.apply(questionnaire, dto);
        return questionnaire.getId();
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
    public Long updateMedicalHistory(Long id, MedicalHistoryDTO dto) {
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

    private OutreachQuestionnaire getOutreachQuestionnaire(Long id) {
        return outreachQuestionnaireRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with  id " + id));
    }
}
