import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created with IntelliJ IDEA
 * Created By Kinsey
 * Date: 2019/5/1
 * Time: 9:40
 */
public class MySeleniumTest {
    public static void main (String[] args) throws InterruptedException {
        //驱动文件路径
        String path = "E:\\ideaSDK\\selenium\\src\\main\\resources\\chromedriver.exe";
        //
        System.setProperty("webdriver.chrome.driver",path);
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.xvideos.com");
        Thread.sleep(10000L);
    }
}
