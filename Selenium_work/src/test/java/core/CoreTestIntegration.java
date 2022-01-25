package core;
import mystore.Data;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class CoreTestIntegration {
    protected WebDriver data;
    protected static final String URL="http://automationpractice.com/";
    @BeforeClass
    public void openBrowser()
    {
        data=new Data().getData();
        data.manage().window().maximize();
        data.get(URL);

    }
    protected static void logStep(String step)
    {
        Logger.step(step);
    }
    @AfterClass
    public void close()
    {
        data.quit();
    }
}
