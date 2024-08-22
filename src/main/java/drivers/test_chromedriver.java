package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_chromedriver {
    public static void main(String[] args) {
        // Chromedriver'ın yolunu belirtin
        System.setProperty("webdriver.chrome.driver", "C:\\rd-automation-lesson\\src\\main\\java\\drivers\\chromedriver.exe");

        // WebDriver nesnesini oluşturun
        ///sdgffd
        WebDriver driver = new ChromeDriver();

        // WebDriver ile istediğiniz işlemleri gerçekleştirin
        driver.get("https://www.google.com");

        // Test sonunda tarayıcıyı kapatın
        driver.quit();
    }
}
