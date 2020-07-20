package com.company;

public class DefaultBookService implements BookService {
    private String title;
    private int price;

    public DefaultBookService(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "DefaultBookService{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("DefaultBookService{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}');
    }

    @Override
    public void newPrint() {
        System.out.println("title='" + title + '\'' + ", price='" + price + '\'' + '}');
    }
}
