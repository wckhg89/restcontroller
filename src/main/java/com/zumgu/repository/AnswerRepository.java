package com.zumgu.repository;

import com.zumgu.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 강홍구 on 2016-12-10.
 */
@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
