import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regular
{
    private static String regexIP = "^(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\." + "((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){2}"  + "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$";
    public static boolean IsIP(String IP)
    {
        Pattern pattern = Pattern.compile(regexIP);
        Matcher matcher = pattern.matcher(IP);
        return matcher.matches();
    }
}
