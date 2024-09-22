package Module1;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class IsGmailOrOutlook {
    public static boolean isGmailOrOutlook(String email) {
        Pattern pattern1 = Pattern.compile("[a-zA-Z]*\\d*\\b@gmail.com");
        Pattern pattern2 = Pattern.compile("[a-zA-Z]*\\d*\\b@outlook.com");
        Matcher matcher1 = pattern1.matcher(email);
        Matcher matcher2 = pattern2.matcher(email);
        boolean a = matcher1.matches();
        boolean b = matcher2.matches();
        if (a == true || b == true) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        String str = "vsvsvsv@outlook.com";
        System.out.println(isGmailOrOutlook(str));
    }
}
