package Module1;
import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
        public static BigInteger factorial(int value) {
            BigInteger result = BigInteger.valueOf(1);
            if (value == 0) {
                result = BigInteger.valueOf(1);
            } else {
                for (int i = 1; i <= value; i++ ) {
                    result = result.multiply(BigInteger.valueOf(i));
                }
            }
        return result;
        }
        public static void main(String[] args) {
            System.out.println("Введите переменную: ");
            Scanner scanner = new Scanner(System.in);
            int value = scanner.nextInt();
            System.out.println(factorial(value));
        }
}
