package com.ecews.outreachquestionnaire.service;

import com.ecews.outreachquestionnaire.dto.*;

public interface OutreachQuestionnaireService {
    Long create(CreateFormDTO clientNumber);
    Long  updateInvestigations(Long id, InvestigationDTO dto);
    Long updateClinicalReview(long id, ClinicalReviewDTO dto);
    Long  updateVitals(Long id, VitalsDTO dto);
    Long updateMedicalHistory(Long id, MedicalHistoryDTO dto);
    Long updateBiodata(Long id, BiodataDTO dto);
    OutreachQuestionnaireDTO  findById(Long id);
    OutreachQuestionnaireDTO  findByClientNumber(String  ClientNumber);

}
