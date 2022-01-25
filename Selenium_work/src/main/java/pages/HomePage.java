package pages;

import org.openqa.selenium.By;

public class HomePage {
    public static final By CLICK_CONTACT=By.xpath("//a[@title='Contact Us']");
    public static final By HEADING_SELECT=By.xpath("//select[@id='id_contact']");
    public static final By EMAIL_SELECT=By.id("email");
    public static final By MESSAGE_SELECT=By.id("message");
    public static final By SUBMIT_SELECT=By.id("submitMessage");
}
