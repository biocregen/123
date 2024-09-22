package javacore_kovtun;

public class Main {
    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    public static void changeArray(int[] arr) {
        arr[0] = 10;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array);
        changeArray(array);
        printArray(array);

    }
}
