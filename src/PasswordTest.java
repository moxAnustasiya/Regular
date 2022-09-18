import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordTest {

    @Test
    public void isPASSWORD1()
    {
        Assert.assertEquals(true, Password.IsPASSWORD("Example4"));
    }
    @Test
    public void isPASSWORD2()
    {
        Assert.assertEquals(true, Password.IsPASSWORD("My5Password"));
    }
    @Test
    public void isPASSWORD3()
    {
        Assert.assertEquals(true, Password.IsPASSWORD("Hello_Word2022"));
    }
    @Test
    public void isPASSWORD4()
    {
        Assert.assertEquals(true, Password.IsPASSWORD("It_is_good_password567"));
    }
    @Test
    public void isPASSWORD5()
    {
        Assert.assertEquals(true, Password.IsPASSWORD("I_20ve_Y0u"));
    }
    @Test
    public void isPASSWORD6()
    {
        Assert.assertEquals(true, Password.IsPASSWORD("1_am_HAPPY"));
    }
    @Test
    public void isPASSWORD7()
    {
        Assert.assertEquals(false, Password.IsPASSWORD("Yd7"));
    }
    @Test
    public void isPASSWORD8()
    {
        Assert.assertEquals(false, Password.IsPASSWORD("YYYIIiio_"));
    }
    @Test
    public void isPASSWORD9()
    {
        Assert.assertEquals(false, Password.IsPASSWORD("nastyalove456"));
    }
    @Test
    public void isPASSWORD10()
    {
        Assert.assertEquals(false, Password.IsPASSWORD("NASTYALOVE456"));
    }
    @Test
    public void isPASSWORD11()
    {
        Assert.assertEquals(false, Password.IsPASSWORD("nastya"));
    }
    @Test
    public void isPASSWORD12()
    {
        Assert.assertEquals(false, Password.IsPASSWORD("07062002"));
    }

}