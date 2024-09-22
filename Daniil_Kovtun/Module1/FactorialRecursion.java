package Module1;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRecursion {
    public static BigInteger factorialRecursion(int value) {
        if (value == 0 || value == 1) {
            return BigInteger.valueOf(1);
        } else {
                return BigInteger.valueOf(value).multiply(factorialRecursion(value-1));
            }
        }
    public static void main(String[] args) {
        System.out.println("Введите переменную: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(factorialRecursion(value));
    }
}
