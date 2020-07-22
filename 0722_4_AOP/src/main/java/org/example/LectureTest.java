package org.example;

public class LectureTest implements Test {
    private int kor;
    private int eng;
    private int math;

    public LectureTest() {
        this(0,0,0);
    }

    public LectureTest(int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
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
    public int tot() {
        System.out.println("Call tot()");
        return (kor + eng + math);
    }

    @Override
    public double avg() {
        System.out.println("Call avg()");
        return ( tot() / 3 );
    }

    @Override
    public void print() {
//        Object object = null;
//        System.out.println(object);
        System.out.println("------------------------------------------");
        System.out.println("Korean : "+kor);
        System.out.println("English : "+eng);
        System.out.println("Math : "+math);
        System.out.println("Total : "+tot());
        System.out.println("Avg : "+avg());
        System.out.println("------------------------------------------");
    }
}
