package Module5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class TaskSystem {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner("1 2 3 4 5 6 7 8 9 10");
        Deque <Integer> deque = new ArrayDeque();
        Deque <Integer> dequeDelete = new ArrayDeque();
        while (scanner.hasNext()) {
            deque.add(scanner.nextInt());
        }
        Iterator iterator = deque.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            if (i % 2 == 0) {
                dequeDelete.add((Integer) iterator.next());
            } else {
                iterator.next();
            }
            i++;
        }
        deque.removeAll(dequeDelete);
        System.out.println(deque);
        Iterator reverseIterator = deque.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.print(reverseIterator.next() + " ");
        }
    }
}
