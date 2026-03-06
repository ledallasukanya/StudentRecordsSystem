import java.util.LinkedList;
import java.util.Queue;

public class AdmissionQueue {

    Queue<Student> queue = new LinkedList<>();

    public void addStudent(Student s) {

        queue.add(s);
        System.out.println("Student added to admission queue");
    }

    public void processAdmission() {

        if(queue.isEmpty()) {
            System.out.println("No students in queue");
        }
        else {
            Student s = queue.poll();
            System.out.println("Processing admission for:");
            s.display();
        }
    }

    public void displayQueue() {

        for(Student s : queue) {
            s.display();
        }
    }
}