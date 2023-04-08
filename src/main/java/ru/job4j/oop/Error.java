package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public void printInfo() {
        System.out.println(this.active);
        System.out.println(this.message);
        System.out.println(this.status);
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error mist = new Error(true, 5, "Massage");
        Error bug = new Error(false, 31, "Clean");
        Error bad = new Error(false, 541, "Value");
        error.printInfo();
        mist.printInfo();
        bug.printInfo();
        bad.printInfo();
    }
}
