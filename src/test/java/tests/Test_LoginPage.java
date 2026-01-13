package tests;

import base.BaseTestThreadManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Test_LoginPage extends BaseTestThreadManager {

    LoginPage login;

    @Test(groups = "sanity")
    public void verifyLoginTestInvalid(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithInvalidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test(groups = "regression")
    public void verifyLoginTestValid(){
        login = new LoginPage();
        String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actUrl = login.verifyLoginWithValidDetails();

        Assert.assertEquals(actUrl, expUrl);

    }

    @Test(groups = "sanity")
    public void loginTest1(){

           Assert.assertTrue(true);

    }

    @Test(groups = "sanity")
    public void loginTest2(){

        Assert.assertTrue(true);

    }

    @Test(groups = "regression")
    public void loginTest3(){
        Assert.assertTrue(false);

    }
}
