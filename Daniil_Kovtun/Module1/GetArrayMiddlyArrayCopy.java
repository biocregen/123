package Module1;

import java.util.Arrays;

public class GetArrayMiddlyArrayCopy {
    public static void getArrayMiddleArrayCopy(int[] numbers) {
        if (numbers.length == 0) {
            System.out.println("[]");
        }
        else if (numbers.length % 2 == 0) {
            int[] r1 = new int [2];
            System.arraycopy(numbers, numbers.length / 2 - 1, r1, 0, 2);
            System.out.println(Arrays.toString(r1));
        }
        else if (numbers.length % 2 == 1) {
            int[] r2 = new int[1];
            System.arraycopy(numbers, numbers.length / 2, r2, 0, 1);
            System.out.println(Arrays.toString(r2));
        }
    }
    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4};
        getArrayMiddleArrayCopy(nums);
    }
}
