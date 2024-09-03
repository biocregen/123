package testPackage;
import java.util.Scanner;
public class Zadacha_radius {
    public static double calcCircleRadius(double area) {
        return Math.sqrt(area/Math.PI);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите площадь круга");
        double s = in.nextDouble();
        System.out.println(calcCircleRadius(s));
    }
}



