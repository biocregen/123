package Module1;

public class GetSubArrayBetween {
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
    public static void getSubArrayBetween(int[] numbers, int start, int end) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                count++;
            }
        }
        int [] arrayBetween = new int [count];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                arrayBetween[j] = numbers[i];
                j++;
            }
        }
        printArray(arrayBetween);
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        int start = 2;
        int end = 4;
        getSubArrayBetween(nums, start, end);
    }
}
