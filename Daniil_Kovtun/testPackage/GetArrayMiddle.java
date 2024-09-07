package testPackage;

public class GetArrayMiddle {
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
     public static void getArrayMiddle(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("[]");
        }
        else if (numbers.length % 2 == 0) {
            int [] resultArray = new int [2];
            resultArray[0] = numbers[numbers.length / 2 - 1];
            resultArray[1] = numbers[numbers.length / 2];
            printArray(resultArray);
        }
        else if (numbers.length % 2 == 1) {
            int [] resultArray = new int [1];
            resultArray[0] = numbers[numbers.length / 2];
            printArray(resultArray);
        }
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};
        getArrayMiddle(nums);
    }
}
