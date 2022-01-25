package actions;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.nextPart;
import org.testng.Assert;

public class VerifyCartImplementation extends CoreActions{
    public VerifyCartImplementation(WebDriver data)
    {
        super(data);
    }
    @Step("name")
    public void dress_data()
    {
        waitForVisibility(nextPart.QUICK_VIEW);
        nextPart.product_name_data=receive_text(nextPart.PRODUCT_NAME);
        nextPart.product_price_data=receive_text(nextPart.PRODUCT_PRICE);
        System.out.println(nextPart.product_price_data);
        click(nextPart.QUICK_VIEW);
    }
    @Step("add to cart")
    public void cart()
    {
        waitForVisibility(nextPart.ADD_TO_CART);
        click(nextPart.ADD_TO_CART);
    }
    @Step("CHECKOUT PROCEDURE")
    public void checkout_proceed()
    {
        waitForVisibility(nextPart.CHECK_OUT);
        click(nextPart.CHECK_OUT);
    }
    @Step("verify product's name")
    public void verify_name()
    {
        Assert.assertTrue(match_the_data(nextPart.product_name_data,nextPart.CART_PRODUCT_NAME));
        System.out.println("validated the name");
    }
    @Step("verify product price")
    public void verify_price()
    {
        Assert.assertTrue(match_the_data(nextPart.product_price_data,nextPart.CART_PRODUCT_PRICE));
        System.out.println("validated the price");
    }
}
