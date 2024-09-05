package testPackage;
import java.util.Scanner;
public class IsWeekend {
    public static boolean isWeekend (String weekday) {
        switch (weekday) {
            case ("Sunday") :
            case ("Saturday") :
                return true;
            default:
                return false;
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String weekend = scanner.nextLine();
            System.out.println(isWeekend(weekend));

        }
}
