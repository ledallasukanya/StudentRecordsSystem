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