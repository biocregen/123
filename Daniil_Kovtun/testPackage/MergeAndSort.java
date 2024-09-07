package testPackage;

public class MergeAndSort {
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
    public static void mergeAndSort(int[] firstArray, int[] secondArray) {
        int count = firstArray.length + secondArray.length;
        int[] resultArray = new int[count];
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
        }
        int j = 0;
        for (int i = firstArray.length; i < count; i++) {
            if (j < secondArray.length) {
                resultArray[i] = secondArray[j];
                j++;
            }
        }
        int a = 0;
        for (int m = resultArray.length - 1; m >= 1; m--) {
            for (int i = 0; i < m; i++) {
                if (resultArray[i] > resultArray[i + 1]) {
                    a = resultArray[i];
                    resultArray[i] = resultArray[i + 1];
                    resultArray[i + 1] = a;
                }
            }
        }
        printArray(resultArray);
    }
    public static void main(String[] args) {
        int [] nums1 = {9, 7, 8, 9, 10};
        int [] nums2 = {4, 2, 5, 4, 5};
        mergeAndSort(nums1, nums2);
    }
}
