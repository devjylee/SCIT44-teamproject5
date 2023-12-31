package com.scit.lms.service;

import com.scit.lms.domain.AllOfTest;
import com.scit.lms.domain.PrimaryRatio;
import com.scit.lms.domain.Test;
import com.scit.lms.domain.TestpaperList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface TestService {

    // 테스트 목록 조회
    ArrayList<Test> testListAll();

    // 테스트 등록
    int insertTest(Test test);

    // 테스트 정보 조회
    Test selectTest(int testid);

    int deleteTest(int testid);

    int updateTest(Test test);

    // 학생이 낸 시험지
    int submitTest(TestpaperList testpaperList);

    //시험 하나의 제출된 답변들 목록으로 이동
    List<TestpaperList> testList(int testid);

    //testid　가져오기
    int getTestid(int asnum);

    // 제출된 답변 총점 계산
    void updateTotalpoints(int asnum);


    ArrayList<PrimaryRatio> selectCategory();

    int updateCategory(PrimaryRatio primaryRatio);

    // 선택한 답변 정보 가져오기
    TestpaperList getTestpaperList(int asnum);

    // 제출된 응답 확인 상태 변경
    void completeCheck(int asnum);

    // 정답지 번호 가져오기
    int getAsnum(String answernum);

    // 학생이 본인 성적 확인
    ArrayList<Test> selectTestByStudent(String username);

    ArrayList<AllOfTest> submitTestList(String memberid);

    TestpaperList checkDuplicateSubmission(TestpaperList testpaperList);

    ArrayList<PrimaryRatio> secondaryCategory(int primaryId);

    // 테스트 카테고리에 따라 보여줄 요소 변함
    ArrayList<TestpaperList> getTestpaperListByCategoryId(Map<String, String> map);

    // 키워드로 시험 찾기
    ArrayList<TestpaperList> searchByKeyword(Map<String, String> map);
}
