package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreActions {
    protected final WebDriver data;
    protected final WebDriverWait waiter;
    protected CoreActions(WebDriver data)
    {
        this.data=data;
        this.waiter=new WebDriverWait(data,10);
    }
    protected boolean waitForVisibility(By element) {
        boolean isVisible = true;
        try {
            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException te) {
            isVisible = false;
        }
        return isVisible;
    }
    protected void click(By element)
    {
        data.findElement(element).click();
    }
    /*protected void click(WebElement element)
    {
        element.click();
    }*/
    protected void choose(By element)
    {
        WebElement e1=data.findElement(element);
        Select dropdown = new Select(e1);
        dropdown.selectByIndex(1);

        System.out.println("selecting");
    }
    protected void send_values(By element,String value)
    {
        data.findElement(element).sendKeys(value);
    }


    protected String receive_text(By element)
    {
        return data.findElement(element).getText();
    }
    protected boolean match_the_data(String text_data,By element)
    {
        String text_catch=receive_text(element);
        System.out.println(text_catch);
        if(text_catch.equals(text_data))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void sleep(double sec)
    {
        try {
            Thread.sleep((long)(sec * 1000));
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}
