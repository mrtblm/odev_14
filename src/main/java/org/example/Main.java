import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String url ="https://demoqa.com/elements";
        System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        //2- https://demoqa.com/webtables adresine gidin, "ADD" düğmesini tıklayarak yeni bir kayıt ekleyin
        // eklenen kaydı düzenleyin
        WebElement web = driver.findElement(By.cssSelector("div[class='element-group']>div>ul>li[id='item-3']"));
        web.click();
        WebElement add = driver.findElement(By.cssSelector("button#addNewRecordButton"));
        add.click();
        WebElement firstName = driver.findElement(By.cssSelector("div.col-md-6>input#firstName"));
        firstName.sendKeys("Murat");
        WebElement lastName = driver.findElement(By.cssSelector("div.col-md-6>input#lastName"));
        lastName.sendKeys("BİLİM");
        WebElement userEmail = driver.findElement(By.cssSelector("div.col-sm-12>input#userEmail"));
        userEmail.sendKeys("muratbilim@msn.com");
        WebElement age = driver.findElement(By.cssSelector("div.col-sm-12>input#age"));
        age.sendKeys("36");
        WebElement salary = driver.findElement(By.cssSelector("div.col-sm-12>input#salary"));
        salary.sendKeys("40000");
        WebElement department = driver.findElement(By.cssSelector("div.col-md-6>input#department"));
        department.sendKeys("IT Uzmanı");
        WebElement submit = driver.findElement(By.cssSelector("div>button#submit"));
        submit.click();
        Thread.sleep(500);
        WebElement edit = driver.findElement(By.cssSelector("div.action-buttons>span#edit-record-3"));
        edit.click();
        WebElement userEmailEdit = driver.findElement(By.cssSelector("div.col-sm-12>input#userEmail"));
        userEmailEdit.sendKeys("bilim.murat@gmail.com");
        WebElement salaryEdit = driver.findElement(By.cssSelector("div.col-sm-12>input#salary"));
        salaryEdit.sendKeys("45000");
        WebElement submitClick = driver.findElement(By.cssSelector("div>button#submit"));
        submitClick.click();
        Thread.sleep(100);

        //1- https://demoqa.com/elements adresine gidin, "Buttons" seçeneğini tıklayın, "Click Me" düğmesini
        //tıklayın ve görünen mesajı okuyun
        WebElement elementButtons = driver.findElement(By.cssSelector("li#item-4")); //Buttons'a tıklama
        elementButtons.click();
        WebElement elementButtons2 = driver.findElement(By.cssSelector("div[class='col-12 mt-4 col-md-6']>div>:nth-child(4)"));
        elementButtons2.sendKeys(Keys.ENTER);
        WebElement clickText = driver.findElement(By.cssSelector("p#dynamicClickMessage"));
        clickText.getText();
        Thread.sleep(1000);


    }
}