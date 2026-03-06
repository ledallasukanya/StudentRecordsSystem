public class StudentArray {

    Student students[];
    int size;

    public StudentArray(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public void insert(Student s) {

        students[size] = s;
        size++;
    }

    public void display() {

        for(int i = 0; i < size; i++) {
            students[i].display();
        }
    }

    public Student[] getStudents() {
        return students;
    }

    public int getSize() {
        return size;
    }
}