import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class URLTest {

    @Test
    public void isURL1()
    {
        Assert.assertEquals(true, URL.IsURL("http://example.com?product=1234&utm_source=google"));
    }
    @Test
    public void isURL2()
    {
        Assert.assertEquals(true, URL.IsURL("example.com"));
    }
    @Test
    public void isURL3()
    {
        Assert.assertEquals(true, URL.IsURL("http://example.com"));
    }
    @Test
    public void isURL4()
    {
        Assert.assertEquals(true, URL.IsURL("https://redirect.ru/"));
    }
    @Test
    public void isURL5()
    {
        Assert.assertEquals(true, URL.IsURL("www.example.net"));
    }
    @Test
    public void isURL6()
    {
        Assert.assertEquals(true, URL.IsURL("http://www.example.com:80/path/to/myfile?key1=value1&key2=value2#SomewhereInTheDocument"));
    }
    @Test
    public void isURL7()
    {
        Assert.assertEquals(false, URL.IsURL("htp://example.com"));
    }
    @Test
    public void isURL8()
    {
        Assert.assertEquals(false, URL.IsURL("http://a.com"));
    }
    @Test
    public void isURL9()
    {
        Assert.assertEquals(false, URL.IsURL("Just Text"));
    }
    @Test
    public void isURL10()
    {
        Assert.assertEquals(false, URL.IsURL("http://www.exa_mple.com:80/path/to/myfile?key1==value1&key2==value2#SomewhereInTheDocument"));
    }
    @Test
    public void isURL11()
    {
        Assert.assertEquals(false, URL.IsURL("https://-www.example-.com"));
    }
    @Test
    public void isURL12()
    {
        Assert.assertEquals(false, URL.IsURL("https://www.exa_mp_le.com"));
    }
}