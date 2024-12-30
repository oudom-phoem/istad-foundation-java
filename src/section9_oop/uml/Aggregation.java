package section9_oop.uml;

class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}

class Department {
    private String name;
    private Teacher[] teachers;
    private int count;

    public Department(String name, int size) {
        this.name = name;
        this.teachers = new Teacher[size]; // Fixed-size array
        this.count = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (count < teachers.length) {teachers[count++] = teacher;} else {
            System.out.println("No more space for teachers in " + name + " department.");
        }
    }

    public void getTeachers() {
        System.out.println("Teachers in the " + name + " department:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + teachers[i].getName() + " (" + teachers[i].getSubject() + ")");
        }
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice", "Math");
        Teacher t2 = new Teacher("Bob", "Science");

        Department dept = new Department("Science", 2);
        dept.addTeacher(t1);
        dept.addTeacher(t2);
        dept.getTeachers();
        t1.teach();
    }
}
