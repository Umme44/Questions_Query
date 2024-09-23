package org.example.questions_query.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class AnswerRepository extends JpaRepository {
    List<Answer> findByQuestionId(Long questionId);
}
