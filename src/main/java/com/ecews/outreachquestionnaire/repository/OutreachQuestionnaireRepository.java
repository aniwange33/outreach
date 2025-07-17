package com.ecews.outreachquestionnaire.repository;

import com.ecews.outreachquestionnaire.model.OutreachQuestionnaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  OutreachQuestionnaireRepository  extends  JpaRepository<OutreachQuestionnaire, Integer> {

}
