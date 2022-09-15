import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUID
{
    private static String regexGUID = "^[a-fA-F\\d]{8}-([a-fA-F\\d]{4}-){3}[a-fA-F\\d]{12}$";
    public static boolean IsGUID(String guid)
    {
        Pattern pattern = Pattern.compile(regexGUID);
        Matcher matcher = pattern.matcher(guid);
        return matcher.matches();
    }
}
