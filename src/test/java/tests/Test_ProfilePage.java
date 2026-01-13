package tests;

import base.BaseTestThreadManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Test_ProfilePage extends BaseTestThreadManager {

    LoginPage login;

    @Test
    public void verifyLoginTestInvalid1(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithInvalidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestValid1(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithValidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestInvalid2(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithInvalidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestValid2(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithValidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestInvalid3(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithInvalidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestValid3(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithValidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestInvalid4(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithInvalidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestValid4(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithValidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestInvalid5(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithInvalidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test
    public void verifyLoginTestValid5(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithValidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }
}

