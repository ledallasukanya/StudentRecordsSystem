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