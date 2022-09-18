import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URL
{
    private static String regexURL = "^((http(s)?)?:\\/\\/)?([0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z]\\.)+[a-z]{2,}(:\\d+)?((\\/[0-9a-zA-Z][0-9a-zA-Z-]{0,63}[0-9a-zA-Z])+)?\\/?((\\/[a-zA-Z])*\\?(\\w+=\\w+)(&\\w+=\\w+)*)?(#\\w+)?$";
    public static boolean IsURL(String url)
    {
        Pattern pattern = Pattern.compile(regexURL);
        Matcher matcher = pattern.matcher(url);
        return matcher.matches();
    }
}
