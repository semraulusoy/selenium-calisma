package day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chromedriver.driver", "src/drivers/chromedriver 3");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //2-Add Element butonuna basin

        driver.findElement(By.xpath("//*[text()='Add Element']")).click();
        Thread.sleep(5000);
        //3-Delete butonunun gorunur oldugunu test edin

        WebElement deleteButonu = driver.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteButonu.isDisplayed()) {
            System.out.println("DeleteButton testi PASSED");
        } else {
            System.out.println("DeleteButton Testi FAILED");}

            //4- Delete butonuna basin
        deleteButonu.click();
        Thread.sleep(5000);

            //5-"Add/Remove Elements" yazisinin gorunur oldugunu test edin

            WebElement addRemoveButonu = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));

            if (addRemoveButonu.isDisplayed()) {
                System.out.println("Add/remove button testi PASSED");
            } else {
                System.out.println("Add/remove button testi FAILED");
            }


            Thread.sleep(5000);
            driver.close();

        }


    }
