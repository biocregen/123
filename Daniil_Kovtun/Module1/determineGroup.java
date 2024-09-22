package Module1;

import java.util.Scanner;

public class determineGroup {
    public int determinegroup(int age) {
        if (age >= 7 && age <= 13) {
            return 1;
        } else if (age >= 14 && age <= 17) {
            return 2;
        } else if (age >= 18 && age <= 65) {
            return 3;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите возраст: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        determineGroup vozrast = new determineGroup();
        System.out.println(vozrast.determinegroup(age));
    }
}
