package com.company;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        // ======= 1 =======
        // BookService bookService = new DefaultBookService("spring", 25000);
        BookService bookService = new DefaultBookServiceProxy("spring", 25000);
        bookService.print();

        // ======= 2 =======
        BookService bookService1 = (BookService)Proxy.newProxyInstance(
                DefaultBookService.class.getClassLoader(),
                new Class[]{BookService.class},
                new InvocationHandler() {
                    final BookService bookService = new DefaultBookService("spring", 26000);
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("전처리 작업을 수행");
                        Object obj = method.invoke(bookService, args);
                        System.out.println("후처리 작업을 수행");
                        return obj;
            }
        });
        bookService1.print();
        bookService1.newPrint();
    }
}
