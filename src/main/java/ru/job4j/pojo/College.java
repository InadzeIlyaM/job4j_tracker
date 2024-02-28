package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ilia Inadze");
        student.setGroup("MO-06-4");
        student.setDataOfAdmission("22.08.2006");
        System.out.println(student.getFullName() + " learning in the group " + student.getGroup() + " since " + student.getDataOfAdmission());
    }
}
