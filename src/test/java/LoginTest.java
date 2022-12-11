import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public void loginWithValidData() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();

        driver.findElement(By.id("email")).sendKeys("siminciuc2022@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Qwertyuiop1290!@#");
        driver.findElement(By.id("send2")).click();
        WebElement welcomeTextElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));

        String expectedText = "Hello, Ileana Maria!";
        String actualText = welcomeTextElement.getText();

        if (actualText.equals(expectedText)){
            System.out.println("S-a logat cu succes!");
        }else
            System.out.println("Nu s-a logat!");

        Thread.sleep(3000);

        driver.close();
    }
    }

