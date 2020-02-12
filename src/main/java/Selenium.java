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

    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "webDrivers/chromedriver.exe");

        browser = new ChromeDriver();
        browser.get("http://algirdaskuslys.000webhostapp.com/selenium/filmai.php?fbclid=IwAR3DpeNm5Ki-ZdVhAXuz9IrW4xoxy-cwWhcC4oIVU9Zf9Y3b5h6MBM3IFv8");
    }

    //public static void close() { browser.close(); }

    public static void createRecord(String keyword) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        nameField.sendKeys(keyword);
        genreField.sendKeys(keyword);
        directorField.sendKeys(keyword);
        directorField.sendKeys(Keys.ENTER);
    }

    public static void badRecord(String keyword) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        nameField.sendKeys(keyword);
        genreField.sendKeys(keyword);
        directorField.sendKeys(keyword);
        directorField.sendKeys(Keys.ENTER);
        WebElement messageField = browser.findElement(By.name("msg-bad"));
    }
    public static void deleteRecord(String keyword) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement deleteBtn = browser.findElement(By.name("delete"));
        idField.sendKeys(keyword);
        deleteBtn.sendKeys(Keys.ENTER);
        idField.sendKeys(Keys.ENTER);
        WebElement messageField = browser.findElement(By.name("msg-good"));
    }
    public static void updateRecord(String keyword1, String keyword2, String keyword3) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        WebElement genreField = browser.findElement(By.name("zanras"));
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        WebElement updateBtn = browser.findElement(By.name("update"));
        nameField.sendKeys(keyword1);
        genreField.sendKeys(keyword2);
        directorField.sendKeys(keyword3);
        updateBtn.sendKeys(Keys.ENTER);
        WebElement messageField = browser.findElement(By.name("msg-good"));
    }
    public static void Record(String keyword) {
        WebElement idField = browser.findElement(By.name("id"));
        WebElement deleteBtn = browser.findElement(By.name("delete"));
        idField.sendKeys(keyword);
        deleteBtn.sendKeys(Keys.ENTER);
        idField.sendKeys(Keys.ENTER);
        WebElement messageField = browser.findElement(By.name("msg-good"));
    }

    public static void main(String[] args) {

        System.out.println("Selenium + Maven + TestNG");
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
