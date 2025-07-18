package com.ecews.outreachquestionnaire.contoller;

import com.ecews.outreachquestionnaire.dto.*;
import com.ecews.outreachquestionnaire.service.OutreachQuestionnaireService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/questionnaire")
@RequiredArgsConstructor
public class OutreachQuestionnaireController {
    private final OutreachQuestionnaireService outreachQuestionnaireService;

    @PostMapping("")
    public ResponseEntity<Long> create(@Valid @RequestBody CreateFormDTO dto) {
        Long id = outreachQuestionnaireService.create(dto);
        URI location = URI.create("/api/questionnaire/" + id);
        return ResponseEntity
                .created(location)
                .body(id);
    }

    @PutMapping("/{id}/biodata")
    public ResponseEntity<Void> updateBiodata(@PathVariable Long id, @Valid @RequestBody BiodataDTO dto) {
        outreachQuestionnaireService.updateBiodata(id, dto);
        return ResponseEntity.noContent().build();
    }


    @PutMapping("/{id}/vitals")
    public ResponseEntity<Void> updateVitals(@PathVariable Long id, @Valid @RequestBody VitalsDTO dto) {
        outreachQuestionnaireService.updateVitals(id, dto);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/medical-history")
    public ResponseEntity<Void> updateMedicalHistory(@PathVariable Long id, @Valid @RequestBody MedicalHistoryDTO dto) {
        outreachQuestionnaireService.updateMedicalHistory(id, dto);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/investigations")
    public ResponseEntity<Void> updateInvestigations(@PathVariable Long id, @Valid @RequestBody InvestigationDTO dto) {
        outreachQuestionnaireService.updateInvestigations(id, dto);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/clinical-review")
    public ResponseEntity<Void> updateClinicalReview(@PathVariable Long id, @Valid @RequestBody ClinicalReviewDTO dto) {
        outreachQuestionnaireService.updateClinicalReview(id, dto);
        return ResponseEntity.noContent().build();
    }


}
