import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GUID
{
    private static String regexGUID = "^(\\{)?(?i)[a-f\\d]{8}-([a-f\\d]{4}-){3}[a-f\\d]{12}(\\})?$";
    public static boolean IsGUID(String guid)
    {
        Pattern pattern = Pattern.compile(regexGUID);
        Matcher matcher = pattern.matcher(guid);
        return matcher.matches();
    }
}
