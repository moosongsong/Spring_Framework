package com.company.entity;

public class LectureTest implements Test{
    private int kor;
    private int eng;
    private int math;

    public LectureTest (){

    }

    public LectureTest(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int tot() {
        return kor+eng+math;
    }

    public double avg() {
        return ((double)tot()/3);
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "LectureTest{" + "kor=" + kor + ", eng=" + eng + ", math=" + math + '}';
    }
}
