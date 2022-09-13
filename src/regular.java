import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regular
{
    private static String regexIP = "^(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\." + "((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){2}"  + "(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])$";
    private static String IP = "";
    public regular(String address)
    {
        IP = address;
    }
    public static boolean IsIP(String textIp)
    {
        Pattern pattern = Pattern.compile(regexIP);
        Matcher matcher = pattern.matcher(textIp);
        return matcher.matches();
    }
    //public static void main(String[] args)
    //{
       // Scanner in = new Scanner(System.in);
      //  String adress = in.nextLine();
       // if(IsIP(adress)) System.out.print("Является IP адрессом");
       // else System.out.print("Не является IP адрессом");
   // }
}
