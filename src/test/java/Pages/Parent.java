package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    public void click(WebElement element) {
        WaitUntilClickable(element);

        element.click();
    }

    public void verifyText(WebElement element, String message) {
        WaitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(message.toLowerCase()));
        System.out.println("siyah secildi");
    }

    public void sendKeys(WebElement element, String message) {
        WaitUntilVisible(element);
        element.clear();
        element.sendKeys(message);
    }

    public void moveTo(WebElement element) {
        WaitUntilVisible(element);
        Actions a=new Actions(GWD.getDriver());
        a.moveToElement(element).perform();
    }

    public void moveToClick(WebElement element) {
        WaitUntilVisible(element);
        Actions a=new Actions(GWD.getDriver());
        a.moveToElement(element).click().perform();
    }


    public void WaitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));

    }
    public void WaitUntilClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


}

