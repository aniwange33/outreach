package com.ecews.outreachquestionnaire.repository;

import com.ecews.outreachquestionnaire.model.OutreachQuestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  OutreachQuestionnaireRepository  extends  JpaRepository<OutreachQuestionnaire, Long> {

    Optional<OutreachQuestionnaire> findByClientNumber(String clientNumber);
    boolean existsByClientNumber(String clientNumber);

}
