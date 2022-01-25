package pages;

import org.openqa.selenium.By;

public class nextPart {
    public static final By CLICK_CONTACT_PART=By.xpath("//a[@title='Contact Us']");
    public static final By EMAIL_CLICK=By.id("email");
    public static final By GO_BACK=By.xpath("//a[@title='My Store']");
    public static final By DRESSES=By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a");
    public static final By CASUAL=By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a");
    public static final By QUICK_VIEW=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
    public static final By ADD_TO_CART= By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    public static final By CHECK_OUT=By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
    public static final By PRODUCT_PRICE=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[2]/span");
    public static final By PRODUCT_NAME=By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a");
    public static final By CART_PRODUCT_NAME=By.xpath("//*[@id=\"product_3_13_0_0\"]/td[2]/p/a");
    public static final By CART_PRODUCT_PRICE=By.xpath("//*[@id=\"product_price_3_13_0\"]/span");
    public static String product_price_data;
    public static String product_name_data;
}
