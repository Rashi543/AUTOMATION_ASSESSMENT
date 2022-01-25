package actions;

import pages.HomePage;
import pages.nextPart;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class PageImplementation extends CoreActions {
        public PageImplementation(WebDriver data)
        {
            super(data);
        }
        @Step("Click contact us")
        public void click_data()
        {
            click(HomePage.CLICK_CONTACT);
        }
        @Step("select one")
        public void choose_data()
        {
            choose(HomePage.HEADING_SELECT);
        }
        @Step("email selection")
        public void choose_email_id(String text)
        {
            send_values(HomePage.EMAIL_SELECT,text);
        }
        @Step("message sending")
        public void choose_message_send(String text)
        {
            send_values(HomePage.MESSAGE_SELECT,text);
        }
        @Step("submitting")
        public void choose_submit()
        {
            click(HomePage.SUBMIT_SELECT);
        }
        @Step("Again selecting")
        public void choose_click_select()
        {
            click(nextPart.CLICK_CONTACT_PART);
        }
        @Step("email check")
        public void choose_email_error(String text)
        {
            send_values(nextPart.EMAIL_CLICK,text);
        }
        @Step("GO Back")
        public void go_back()
        {
            click(nextPart.GO_BACK);
        }
        @Step("Dress selection")
        public void dresses_select()
        {
            click(nextPart.DRESSES);
        }
        public void casual_dress_select()
        {
            click(nextPart.CASUAL);
        }
}
