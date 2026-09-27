import java.util.Scanner;

public class FindMinMaxinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize largest and smallest with the first element
        int largest = arr[0];
        int smallest = arr[0];

        // Traverse the array to find min and max
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Print results
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        sc.close();
    }
}
