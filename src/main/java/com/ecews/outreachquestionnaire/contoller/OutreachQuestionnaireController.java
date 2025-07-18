package com.ecews.outreachquestionnaire.contoller;

import com.ecews.outreachquestionnaire.dto.CreateFormDTO;
import com.ecews.outreachquestionnaire.service.OutreachQuestionnaireService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
