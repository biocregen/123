package testPackage;

public class InverseArray {
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
    public static void inverseArray (int[] numbers) {
        int[] resultArray = new int[numbers.length];
        int j = 0;
        if (numbers.length == 0) {
            System.out.println("[]");
        } else {
            for (int i = numbers.length - 1; i >= 0; i--) {
                resultArray[j] = numbers[i];
                j++;
            }
        printArray(resultArray);
        }
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5};
        inverseArray(nums);
    }
}
