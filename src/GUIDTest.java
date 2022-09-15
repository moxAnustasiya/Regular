import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GUIDTest {

    @Test
    public void isGUID1()
    {
        Assert.assertEquals(true, GUID.IsGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void isGUID2()
    {
        Assert.assertEquals(true, GUID.IsGUID("{3297F0F2-35D3-4231-919D-1CFCF4035975}"));
    }
    @Test
    public void isGUID3()
    {
        Assert.assertEquals(true, GUID.IsGUID("{69aa3ba5-d51E-465E-8447-ECAA1939739A}"));
    }
    @Test
    public void isGUID4()
    {
        Assert.assertEquals(true, GUID.IsGUID("F4AB02B7-9D55-483D-9081-CC4E3851E851"));
    }
    @Test
    public void isGUID5()
    {
        Assert.assertEquals(true, GUID.IsGUID("a4Ad02B7-9D55-483D-9081-CC4e3851f851"));
    }
    @Test
    public void isGUID6()
    {
        Assert.assertEquals(true, GUID.IsGUID("abcdef56-1234-5678-9000-0987654321ba"));
    }
    @Test
    public void isGUID7()
    {
        Assert.assertEquals(false, GUID.IsGUID("{e02fd0e400fd090Aca300d00a0038ba0{"));
    }
    @Test
    public void isGUID8()
    {
        Assert.assertEquals(false, GUID.IsGUID("(h4Ad02B7-9D55-483D-k081-CC4e3851f851)"));
    }
    @Test
    public void isGUID9()
    {
        Assert.assertEquals(false, GUID.IsGUID("a4Ad02B7.9D55.483D.a081.CC4e3851f851"));
    }
    @Test
    public void isGUID10()
    {
        Assert.assertEquals(false, GUID.IsGUID("2B7-9D55-483D-k081-851f851"));
    }
    @Test
    public void isGUID11()
    {
        Assert.assertEquals(false, GUID.IsGUID("2B7aBc50-9D55-483D-k081-aB56f851f851-"));
    }
    @Test
    public void isGUID12()
    {
        Assert.assertEquals(false, GUID.IsGUID("2B7aBc50-483D-k081-aB56f851f851"));
    }
}