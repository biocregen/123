package Module1;

public class PrintArray {
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
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        printArray(nums);
    }
}
