import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Password {
    private static String regexPASSWORD = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])\\w{8,}$";
    public static boolean IsPASSWORD(String pass)
    {
        Pattern pattern = Pattern.compile(regexPASSWORD);
        Matcher matcher = pattern.matcher(pass);
        return matcher.matches();
    }
}
