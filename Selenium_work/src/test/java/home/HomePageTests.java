package home;

import core.CoreTestIntegration;
import core.Listener;
import actions.PageImplementation;
import actions.VerifyCartImplementation;
import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Test
@Epic("Epic 1")
@Listeners(Listener.class)

public class HomePageTests extends CoreTestIntegration {
    PageImplementation pl;
    VerifyCartImplementation vci;
    @Test
    @Description("Creating objects before class")
    public void initimpl()
    {
        pl=new PageImplementation(data);
        vci=new VerifyCartImplementation(data);
    }
    @Test(dependsOnMethods = "initimpl")
    @Description("testing the function")
    @Severity(SeverityLevel.NORMAL)
    @Story("STORY 1")
    @Feature("Feature 1")
    @Owner("RASHI RAJAN")

    public void testing_the_function()
    {
        logStep("clicking part");
        pl.click_data();
    }
    @Test(priority = 2)
    public void testing_choose()
    {
        logStep("choosing part");
        pl.choose_data();
        pl.sleep(2);
    }
    @Test(priority = 3)
    public void testing_email()
    {
        logStep("email test");
        pl.choose_email_id("abc@gmail.com");
        pl.sleep(2);
    }
    @Test(priority = 4)
    public void testing_message()
    {
        logStep("message test");
        pl.choose_message_send("skirts");
        pl.sleep(2);
    }
    @Test(priority = 5)
    public void testing_submit()
    {
        logStep("test submit");
        pl.choose_submit();
        pl.sleep(2);
    }
    @Test(priority = 6)
    public void testing_click()
    {
        logStep("checking the error function");
        pl.choose_click_select();
        pl.sleep(2);
    }
    @Test(priority = 7)
    public void testing_choose_error()
    {
        logStep("choosing part");
        pl.choose_data();
        pl.sleep(2);
    }
    @Test(priority = 8)
    public void testing_email_error()
    {
        logStep("error email check");
        pl.choose_email_error("xyz");
        pl.sleep(2);
    }
    @Test(priority = 9)
    public void testing_err_submit()
    {
        logStep("test submit error");
        pl.choose_submit();
        pl.sleep(2);
    }
    @Test(priority = 10)
    public void testing_application()
    {
        logStep("test application");
        pl.go_back();
        pl.sleep(2);
    }
    @Test(priority = 11)
    public void testing_dress()
    {
        logStep("test dress");
        pl.dresses_select();
        pl.sleep(2);
    }
    @Test(priority = 12)
    public void testing_casual()
    {
        logStep("test casual dress");
        pl.casual_dress_select();
        pl.sleep(2);
    }
    @Test(priority = 13)
    public void testing_quick_view()
    {
        logStep("test quick view");
        vci.dress_data();
        vci.sleep(5);
    }
    @Test(priority = 14)
    public void testing_cart()
    {
        logStep("test cart");
        vci.cart();
        vci.sleep(5);
    }
    @Test(priority = 15)
    public void testing_go_cart()
    {
        logStep("test go cart");
        vci.checkout_proceed();
        vci.sleep(5);
    }
    @Test(priority = 16)
    public void testing_name()
    {
        logStep("name test");
        vci.verify_name();
        vci.sleep(5);
    }
    @Test(priority = 17)
    public void testing_price()
    {
        logStep("price test");
        vci.verify_price();
        vci.sleep(5);
    }
}
