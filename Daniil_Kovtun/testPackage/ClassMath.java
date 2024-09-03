package testPackage;
import java.util.Scanner;
public class ClassMath {
    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.001;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        double a = in.nextDouble();
        System.out.println("Введите b");
        double b = in.nextDouble();
        System.out.println("Введите c");
        double c = in.nextDouble();
        System.out.println(doubleExpression(a, b, c));
    }
}


