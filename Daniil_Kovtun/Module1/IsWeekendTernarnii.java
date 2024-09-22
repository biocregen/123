package Module1;

import java.util.Scanner;

public class IsWeekendTernarnii {
    public static String isWeekendtern (String weekday) {
        return ((weekday.equals("Sunday")) || (weekday.equals("Saturday"))) ? "Ура, выходной!" : "Надо еще поработать";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        String weekend = scanner.nextLine();
        //String weekend = "Sunday";
        System.out.println(isWeekendtern(weekend));

    }
}
