package ru.job4j.checkstyle;

public class Broken {
    final int sizeOfEmpty = 10;

    public String surname;

    public static final String NEWVALUE = "";

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }

    String name;

    Broken() {
    }

}