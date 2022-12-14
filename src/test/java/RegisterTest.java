import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {


    public static void main(String[] args) throws InterruptedException {

        //Adăugați în clasa RegisterTest un test(o noua metoda) în care să automatizați pașii necesari pentru înregistrarea
        // cu succes a unui utilizator nou (deschideți homepage-ul, apăsați pe Account, apăsați pe Register, completați toate
        // câmpurile de pe pagina Register - atenție ca email-ul să fie unic, bifați opțiunea pentru primirea newsleterr-ului).
        // Folosiți identificatori diferiți pentru câmpurile de pe pagina Register (id, name, className).
        // Pe viitor, după învățarea altor identificatori, veți reveni pentru a apăsa și butonul Register.
        // Apelati metoda aceasta in metoda main din clasa pentru a rula testul.


        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Elena");
        driver.findElement(By.id("middlename")).sendKeys("Olanda");
        driver.findElement(By.id("lastname")).sendKeys("Macanache");
        driver.findElement(By.id("email_address")).sendKeys("elena1@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Elena1234");
        driver.findElement(By.id("confirmation")).sendKeys("Elena1234");
        driver.findElement(By.cssSelector("#is_subscribed")).click();

        Thread.sleep(3000);

        driver.close();

    }
}
