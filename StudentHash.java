import java.util.HashMap;

public class StudentHash {

    HashMap<Integer, Student> map = new HashMap<>();

    public void addStudent(Student s) {

        map.put(s.id, s);
    }

    public void searchStudent(int id) {

        Student s = map.get(id);

        if(s != null) {
            System.out.println("Student Found:");
            s.display();
        }
        else {
            System.out.println("Student not found");
        }
    }
}