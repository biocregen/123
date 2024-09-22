package Module1;

import java.util.Arrays;

public class MergeAndSortArrays {
    public static int[] mergeAndSortArrays (int[] firstArray, int[] secondArray) {
        int[] r = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, r, 0, firstArray.length);
        System.arraycopy(secondArray, 0, r, firstArray.length, secondArray.length);
        Arrays.sort(r);
        return r;
    }
}
