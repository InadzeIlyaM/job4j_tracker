package ru.job4j.checkstyle;

public class Broken {
    private final int sizeOfEmpty = 10;
    private static final String NEWVALUE = "";
    private String surname;
    private String name;

    public Broken() {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c) {
        int d = a + b + c;
        System.out.println(d);
    }
}