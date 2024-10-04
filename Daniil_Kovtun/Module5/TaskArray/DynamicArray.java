package Module5.TaskArray;

import java.util.Arrays;

public class DynamicArray<T> {
    private T[] dynamicArray = (T[]) new Object[0];

    public void add(T el) {
        dynamicArray = Arrays.copyOf(dynamicArray, dynamicArray.length + 1);
        dynamicArray[dynamicArray.length - 1] = el;
    }

    public void remove(int index) {
        T[] newDynamicArray = (T[]) new Object[dynamicArray.length - 1];
        for (int i = 0, j = 0; i < dynamicArray.length; i++) {
            if (i != index) {
                newDynamicArray[j++] = dynamicArray[i];
            }
        }
        dynamicArray = newDynamicArray;
    }

    public T get(int index) throws ArrayIndexOutOfBoundsException{
        if (index >= size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (dynamicArray[index] != null) {
            return dynamicArray[index];
        } else {
            throw new NullPointerException();
        }
    }
    public void print() {
        for (Object o: dynamicArray) {
            System.out.println(o);
        }
    }
    public int size() {
        int count = 0;
        for (T el: dynamicArray) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        DynamicArray<Integer> array = new DynamicArray<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.remove(1);
    array.print();
        /*for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }*/
    }
}