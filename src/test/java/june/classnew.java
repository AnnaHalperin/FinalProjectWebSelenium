package june;

import org.testng.annotations.*;

public class classnew
{
    @Test
    public void test01()
    {
        System.out.println("test 01");
    }
    @BeforeClass
    public void StartSession()
    {
        System.out.println("Before Class");
    }
    @Test
    public void test02()
    {
        System.out.println("test 02");
    }

    @AfterClass
    public void closeSession()
    {
        System.out.println("After Class");

    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("before Method");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("after Method");
    }


}
