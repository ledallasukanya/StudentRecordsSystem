1. Setup in VS Code
Step 1: Install Extensions
Install these in VS Code:
•	Extension Pack for Java (by Microsoft)
________________________________________
Step 2: Create Project Folder
Create a folder
StudentRecordsSystem
Open it in VS Code
File → Open Folder → StudentRecordsSystem
________________________________________
2. Create Java Files
Inside the folder create these files:
Student.java
StudentArray.java
SearchSort.java
AdmissionQueue.java
StudentHash.java
Main.java
In VS Code:
Right Click → New File
________________________________________
3. Student Class
File: Student.java
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
________________________________________
4. Student Records using Array (ADT)
File: StudentArray.java
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
Concept used: ADT using arrays (CO2)
________________________________________
5. Searching and Sorting Algorithms
File: SearchSort.java
public class SearchSort {

    // Linear Search
    public static void linearSearch(Student arr[], int size, int id) {

        for(int i=0;i<size;i++) {

            if(arr[i].id == id) {
                System.out.println("Student Found:");
                arr[i].display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    // Bubble Sort by marks
    public static void bubbleSort(Student arr[], int size) {

        for(int i=0;i<size-1;i++) {

            for(int j=0;j<size-i-1;j++) {

                if(arr[j].marks > arr[j+1].marks) {

                    Student temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        System.out.println("Sorted by Marks");
    }
}
Concept used:
•	Linear Search
•	Sorting
(CO1)
________________________________________
6. Admissions Queue
File: AdmissionQueue.java
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
Concept used:
•	Queue
•	LinkedList implementation
(CO3)
________________________________________
7. Hash Table for Fast Lookup
File: StudentHash.java
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
Concept used:
•	Hashing
•	Java Map
(CO4)
________________________________________
8. Main Program (Menu Driven)
File: Main.java
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        StudentArray records = new StudentArray(100);
        AdmissionQueue queue = new AdmissionQueue();
        StudentHash hash = new StudentHash();

        int choice;

        do {

            System.out.println("\n1 Add Student");
            System.out.println("2 Display Students");
            System.out.println("3 Search Student");
            System.out.println("4 Sort Students by Marks");
            System.out.println("5 Add to Admission Queue");
            System.out.println("6 Process Admission");
            System.out.println("7 Hash Search");
            System.out.println("0 Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:

                    System.out.println("Enter ID Name Marks Department");

                    int id = sc.nextInt();
                    String name = sc.next();
                    double marks = sc.nextDouble();
                    String dept = sc.next();

                    Student s = new Student(id,name,marks,dept);

                    records.insert(s);
                    hash.addStudent(s);

                    break;

                case 2:

                    records.display();
                    break;

                case 3:

                    System.out.println("Enter ID to search");

                    int sid = sc.nextInt();

                    SearchSort.linearSearch(records.getStudents(),records.getSize(),sid);

                    break;

                case 4:

                    SearchSort.bubbleSort(records.getStudents(),records.getSize());

                    records.display();

                    break;

                case 5:

                    System.out.println("Enter student ID to add to queue");

                    int qid = sc.nextInt();

                    Student arr[] = records.getStudents();
                    int size = records.getSize();

                    for(int i=0;i<size;i++) {

                        if(arr[i].id == qid) {
                            queue.addStudent(arr[i]);
                        }
                    }

                    break;

                case 6:

                    queue.processAdmission();
                    break;

                case 7:

                    System.out.println("Enter ID for Hash Search");

                    int hid = sc.nextInt();

                    hash.searchStudent(hid);

                    break;

            }

        } while(choice != 0);

    }
}
________________________________________
9. Compile and Run in VS Code
Open terminal in VS Code.
Compile
javac *.java
Run
java Main
________________________________________
10. Example Output
1 Add Student
2 Display Students
3 Search Student
4 Sort Students
5 Add to Admission Queue
6 Process Admission
7 Hash Search

Enter choice: 1

Enter ID Name Marks Department
1 Ravi 85 CSE


11. Where Each CO is Used
Component	Concept	CO
Search student	Linear Search	CO1
Sort students	Bubble Sort	CO1
Student storage	Array ADT	CO2
Admission queue	Queue	CO3
Java LinkedList queue	Queue implementation	CO3
HashMap student lookup	Hash table	CO4
Collections framework	Queue + Map	CO4

