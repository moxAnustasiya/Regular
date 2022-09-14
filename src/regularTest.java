import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class regularTest
{
    public static regular IP = new regular();;
    @Test
    public void isIP1()
    {
        Assert.assertEquals(true, IP.IsIP("192.168.1.1"));
    }
}