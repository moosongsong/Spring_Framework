package org.example.annotationProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ScoreBoard {
    @Autowired(required = false)
    @Qualifier("lectureTest")
    private LectureTest test;

//    @Autowired
//    @Qualifier("secondTest")
//    private LectureTest test2;
//
//    public ScoreBoard(@Qualifier("lectureTest") LectureTest test, @Qualifier("secondTest") LectureTest test2){
//        this.test = test;
//    }
//    public ScoreBoard(LectureTest test){
//        this.test = test;
//    }
//
//    @Autowired
//    @Qualifier("lectureTest")
//    public void setTest(LectureTest test) {
//        this.test = test;
//    }

    public void print(){
        try{
            System.out.println("kor:"+ test.getKor()+", eng:"+ test.getEng()+", math:"+ test.getMath());
        }catch (Exception e){
            System.out.println("주입 실패");
        }
        
    }
}
