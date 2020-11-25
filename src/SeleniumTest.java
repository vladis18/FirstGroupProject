import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\pishi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.google.com");//get ---Will wait for the page to fully load
        System.out.println(chromeDriver.getCurrentUrl());//get --- will not keep the history in your browser
        System.out.println(chromeDriver.getTitle());
        chromeDriver.navigate().to("http://facebook.com"); //navigate will keep the history and can  move
        //back and forward and let your refresh
        chromeDriver.navigate().back();
        Thread.sleep(1000);
        chromeDriver.navigate().forward();
        Thread.sleep(1000);
        chromeDriver.navigate().refresh();
        //chromeDriver.close(); // close will close your current tab
        chromeDriver.quit();// will close the whole browser
    }

}
