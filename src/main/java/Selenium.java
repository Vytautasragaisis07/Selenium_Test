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

    public static void createRecord(String keyword, String keyword2, String keyword3) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword3);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();
    }

    public static void badRecord(String keyword, String keyword2, String keyword3) {
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword2);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword3);
        WebElement sendfield = browser.findElement(By.name("insert"));
        sendfield.click();
        WebElement getInfo = browser.findElement(By.className("msg-bad"));
    }
    public static void deleteRecord(String keyword) {
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement deletefield = browser.findElement(By.name("delete"));
        deletefield.click();
        WebElement getInfo = browser.findElement(By.className("msg-good"));
    }
    public static void updateRecord(String keyword1, String keyword2, String keyword3) {
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword4);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();
        WebElement getInfo = browser.findElement(By.className("msg-good"));
    }
    public static void badUpdate(String keyword,String keyword2,String keyword3,String keyword4){
        WebElement idField = browser.findElement(By.name("id"));
        idField.sendKeys(keyword);
        WebElement nameField = browser.findElement(By.name("pavadinimas"));
        nameField.sendKeys(keyword2);
        WebElement genreField = browser.findElement(By.name("zanras"));
        genreField.sendKeys(keyword3);
        WebElement directorField = browser.findElement(By.name("rezisierius"));
        directorField.sendKeys(keyword4);
        WebElement updatefield = browser.findElement(By.name("update"));
        updatefield.click();
        WebElement getInfo = browser.findElement(By.className("msg-bad"));

    }

    public static void main(String args[]) {
        System.out.println("TestNG pirmas bandymas");
        setup();
        addRecord("Antanas","Baranauskas","Silelis");
        badRecord("<h1>","<h2>","<h3>");
        deleteRecord("145");
        updateRecord("146","Antanas","Baranauskas","Silelis");
        badUpdate("147","<div>","<h1>","<p>");
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
