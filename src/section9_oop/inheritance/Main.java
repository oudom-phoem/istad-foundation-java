package section9_oop.inheritance;

sealed class Person permits Teacher, Student {
    protected int id;
    protected String name;
}

non-sealed class Teacher extends Person {};
non-sealed class Student extends Person {};

public class Main {
    public static void main(String[] args) {
        Person teacher = new Teacher();
        Person student = new Student();
        teacher.id = 1;
        teacher.name = "Sokpheng";
        student.id = 2;
        student.name = "Samnom";
        System.out.println(teacher.id);
        System.out.println(student.id);
    }
}
