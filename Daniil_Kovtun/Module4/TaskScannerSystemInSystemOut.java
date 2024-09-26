package Module4;
import java.util.Locale;
import java.util.Scanner;
public class TaskScannerSystemInSystemOut {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        scanner1.useLocale(Locale.US);
        while (scanner1.hasNext()) {
            if (scanner1.hasNextDouble()) {
                sum += scanner1.nextDouble();
            } else {
                scanner1.next();
            }
        }
        System.out.println((String.format("%.6f", sum)));
    }
}
