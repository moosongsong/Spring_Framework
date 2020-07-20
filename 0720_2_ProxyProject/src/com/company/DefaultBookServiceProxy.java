package com.company;

public class DefaultBookServiceProxy extends DefaultBookService {

    public DefaultBookServiceProxy(String title, int price) {
        super(title, price);
    }

    @Override
    public void print() {
        System.out.println("전처리 작업을 수행");
        super.print();
        System.out.println("후처리 작업을 수행");
    }


}
