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
    @Test
    public void isIP2()
    {
        Assert.assertEquals(true, IP.IsIP("255.255.255.255"));
    }
    @Test
    public void isIP3()
    {
        Assert.assertEquals(true, IP.IsIP("0.0.0.0"));
    }
    @Test
    public void isIP4()
    {
        Assert.assertEquals(true, IP.IsIP("8.8.8.8"));
    }
    @Test
    public void isIP5()
    {
        Assert.assertEquals(true, IP.IsIP("23.68.61.91"));
    }
    @Test
    public void isIP6()
    {
        Assert.assertEquals(true, IP.IsIP("192.67.0.1"));
    }
    @Test
    public void isIP7()
    {
        Assert.assertEquals(false, IP.IsIP("567.168.1.1"));
    }
    @Test
    public void isIP8()
    {
        Assert.assertEquals(false, IP.IsIP("192/168.1.1"));
    }
    @Test
    public void isIP9()
    {
        Assert.assertEquals(false, IP.IsIP("07.78.0.0"));
    }
    @Test
    public void isIP10()
    {
        Assert.assertEquals(false, IP.IsIP("a56.168.1.1"));
    }
    @Test
    public void isIP11()
    {
        Assert.assertEquals(false, IP.IsIP("1927.168.1.10"));
    }
    @Test
    public void isIP12()
    {
        Assert.assertEquals(false, IP.IsIP("fff.ddd.kkk.lll"));
    }
}