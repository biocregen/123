package testPackage;

import java.sql.SQLOutput;

public class PrintOddNumbers {
    public static void printOddNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        int j = 0;
        for (int value: arr) {
            if (value % 2 != 0) {
                j++;
                if (j == count) {
                    System.out.print(value);
                } else {
                    System.out.print(value + ",");
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, -25, 5, -25555, 8};
        printOddNumbers(arr);
    }
}
