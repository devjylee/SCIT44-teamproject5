package com.scit.lms.dao;

import com.scit.lms.domain.Option;
import com.scit.lms.domain.Question;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

@Mapper
public interface QuestionDAO {
    // 문제 등록
    int insertQuestion(Question question);

    // 문제의 보기 및 정답 등록
    void submitOptions(List<Option> options);

    // 문제 테이블의 정답 갱신
    void updateAnswer();

    // 시험지 문제 전체 조회
    ArrayList<Question> selectQuestions(int testnum);

    // 문제에 해당하는 보기 조회
    ArrayList<Option> selectOptions(long qid);

    // 문제 하나 조회
    Question selectOneQuestion(int qid);
}
