public class ArrayBasics {

    public static void main(String[] args) {

        // 1. Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // 2. Print array elements using a loop
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 3. Access a specific element
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);
    }
}
