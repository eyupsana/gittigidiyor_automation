package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Methods extends BaseClass {

    public static WebDriverWait wait = new WebDriverWait(driver, 30);

    public static void hoverElement(By by) {
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(by);
        action.moveToElement(we).build().perform();
        logger.info(by+"elemente hover olundu!");
    }

    public static WebElement findElement(By by) {
        return driver.findElement(by);


    }
    public static void waitVisibilityClick(By by) {
        WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        we.click();
        logger.info(by+"görüldü ve elemente tıklandı!");
    }

    public static void waitClicableClick(By by) {
        WebElement we =wait.until(ExpectedConditions.elementToBeClickable(by));
        we.click();
        logger.info(by+"görüldü ve elemente tıklandı!");

    }

    public static void waitVisibilitySendKey(By by, String key) {
        WebElement we= wait.until(ExpectedConditions.elementToBeClickable(by));
        we.sendKeys(key);
        logger.info(by+"'lı element görüldü ve elemente "+key+" değeri girildi!");

    }

    public static void waitClicableSubmit(By by) {
        WebElement we= wait.until(ExpectedConditions.elementToBeClickable(by));
        we.submit();
        logger.info(by+"görüldü ve elemente submit olundu!");
    }
    public static double priceConvertDouble(By priceText)
    {

        String[] elementStringList = findElement(priceText).getText().trim().split(" ");
        String elementString = elementStringList[0].replaceAll(",", "");
        return Double.parseDouble(elementString);

    }




}