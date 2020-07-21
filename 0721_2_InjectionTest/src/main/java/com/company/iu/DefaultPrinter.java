package com.company.iu;

import com.company.entity.Test;

public class DefaultPrinter implements Printer {
    private Test test;

    public DefaultPrinter(){

    }
    public DefaultPrinter(Test test) {
        this.test = test;
    }

    public void print() {
        System.out.printf("total : %d, avg : %f\n", test.tot(), test.avg());
    }

    public void setTest(Test test) {
        this.test = test;
    }

}
