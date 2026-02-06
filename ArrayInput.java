import java.util.Scanner;

public class ArrayInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Take array input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
