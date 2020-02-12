import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {
    static WebDriver browser;

    private static final int SECONDS = 2;

    public static void setup(){
        System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php?fbclid=IwAR3DpeNm5Ki-ZdVhAXuz9IrW4xoxy-cwWhcC4oIVU9Zf9Y3b5h6MBM3IFv8");
    }

    //public static void close() { browser.close(); }

    public static void searchByKeyword(String keyword) {
        WebElement searchField = browser.findElement(By.id("sb_form_q"));
        searchField.sendKeys(keyword);
        searchField.sendKeys(Keys.ENTER);
    }

    public static void main(String[] args) {

        System.out.println("Selenium Maven TestNG");
    }

    private static void waitForElementById(WebDriver browser, String id) {
        WebDriverWait webDriverWait = new WebDriverWait(browser, SECONDS);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
    }

    public static void searchById(String movieId) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement searchBtn = browser.findElement(By.name("search"));

        idField.sendKeys(movieId);
        searchBtn.sendKeys(Keys.ENTER);
    }



//    WebElement nameField = browser.findElement(By.name("pavadinimas"));
//    WebElement genreField = browser.findElement(By.name("zanras"));
//    WebElement directorField = browser.findElement(By.name("rezisierius"));
//
//    WebElement insertBtn = browser.findElement(By.name("insert"));
//    WebElement updateBtn = browser.findElement(By.name("update"));
//    WebElement deleteBtn = browser.findElement(By.name("delete"));
}
