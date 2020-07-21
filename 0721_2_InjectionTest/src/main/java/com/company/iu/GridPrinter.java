package com.company.iu;

import com.company.entity.Test;

public class GridPrinter implements Printer {
    private Test test;
    public GridPrinter(){

    }
    public GridPrinter(Test test) {
        this.test = test;
    }

    public void print() {
        System.out.println("total : "+ test.tot());
        System.out.println("avg : "+test.avg());
    }

    public void setTest(Test test) {
        this.test = test;
    }
}
