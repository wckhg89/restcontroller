package com.zumgu.repository;

import com.zumgu.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 강홍구 on 2016-12-10.
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
