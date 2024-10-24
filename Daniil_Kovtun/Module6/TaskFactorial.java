package Module6;
import java.math.BigInteger;
import java.util.stream.IntStream;
public class TaskFactorial {


        public static BigInteger factorial(int value) {
            return BigInteger.valueOf(IntStream.rangeClosed(1, value).reduce(1, (acc, x) -> acc * x));
        }

        public static void main(String[] args) {
            System.out.println(factorial(3));
        }

}
