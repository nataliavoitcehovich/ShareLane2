package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {
    //1. Open browser, site https://www.sharelane.com/cgi-bin/register.py
    //2. Enter value in ZIP code field
    //3. Click "Continue" button

    @Test
    public void fillZipcodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("222222");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();

        driver.quit();
    }

    @Test
    public void fillSignUpFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.name("first_name")).sendKeys("Nat");
        driver.findElement(By.name("last_name")).sendKeys("Voitcehovich");
        driver.findElement(By.name("email")).sendKeys("nat@yandex.ru");
        driver.findElement(By.name("password1")).sendKeys("123456");
        driver.findElement(By.name("password2")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        //driver.quit();

    }

    @Test
    public void fillSignUpEmptyFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        //driver.quit();

    }

    @Test
    public void fillSignUpFieldNameTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.name("first_name")).sendKeys("1");
        driver.findElement(By.name("last_name")).sendKeys("Voitcehovich");
        driver.findElement(By.name("email")).sendKeys("nat@yandex.ru");
        driver.findElement(By.name("password1")).sendKeys("123456");
        driver.findElement(By.name("password2")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        //driver.quit();

    }

    @Test
    public void fillSignUpFieldTestLastName() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.name("first_name")).sendKeys("Nat");
        driver.findElement(By.name("last_name")).sendKeys("1");
        driver.findElement(By.name("email")).sendKeys("nat@yandex.ru");
        driver.findElement(By.name("password1")).sendKeys("123456");
        driver.findElement(By.name("password2")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        //driver.quit();

    }

    @Test
    public void fillSignUpFieldEmailTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.name("first_name")).sendKeys("Nat");
        driver.findElement(By.name("last_name")).sendKeys("Voitcehovich");
        driver.findElement(By.name("email")).sendKeys("yandex.ru");
        driver.findElement(By.name("password1")).sendKeys("123456");
        driver.findElement(By.name("password2")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        //driver.quit();

    }

    @Test
    public void fillSignUpFieldPswrdTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py?page=1&zip_code=222222");
        driver.findElement(By.name("first_name")).sendKeys("Nat");
        driver.findElement(By.name("last_name")).sendKeys("Voitcehovich");
        driver.findElement(By.name("email")).sendKeys("nat@yandex.ru");
        driver.findElement(By.name("password1")).sendKeys("");
        driver.findElement(By.name("password2")).sendKeys("");
        driver.findElement(By.xpath("//*[@value='Register']")).click();

        //driver.quit();

    }
}
