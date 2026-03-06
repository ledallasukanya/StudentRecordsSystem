public class Student {

    int id;
    String name;
    double marks;
    String department;

    public Student(int id, String name, double marks, String department) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.department = department;
    }

    public void display() {
        System.out.println(id + " " + name + " " + marks + " " + department);
    }
}