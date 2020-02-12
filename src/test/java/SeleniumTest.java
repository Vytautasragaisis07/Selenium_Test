import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
    @BeforeTest
    public void setup() {
        Selenium.setup();
    }

    @Test
    public void createRecordTest() {
        Selenium.createRecord("Antanas", "Baranauskas", "Silelis");
    }
    @Test
    public void badRecordTest() {
        Selenium.badRecord("<h1>", "<h2>", "<h3>");
    }
    @Test
    public void deleteRecordTest() {
        Selenium.deleteRecord("145");
    }
    @Test
    public void updateRecordTest() {
        Selenium.updateRecord("146", "Antanas", "Baranauskas", "Silelis");
    }
    @Test
    public void badUpdateRecordTest() {
        Selenium.badUpdate("147","<div>","<h1>","<p>");
    }



    @AfterTest
    public void close() {
        //Selenium.close();
    }

}


//String searchResultCount = browser.findElement(By.className("sb_count")).getText();
//        String searchCount = searchResultCount.replaceAll("[ ,A-Za-z]+", "");
//
//        int count = Integer.parseInt(searchCount);
//
//        String message = "Rašytojas nelabai  populiarus internetinėse platybėse";
//        if (count >= 50000) {
//        message = searchResultCount + "\n" + "Džiaugiamės, jog  jaunimas dar neužmiršo Anykščių šilelio.";
//        }
//
//        System.out.println(message);
