package org.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static java.lang.Thread.*;
import static org.example.Costants.*;

public class TestClass extends BaseClass {
    public static double firstAmount;
    public static double secondAmount;


    public static void login() {
        Methods.hoverElement(HOVER_LOGIN_BUTTON);
        Methods.waitClicableClick(LOGIN_BUTTON);
        Methods.waitVisibilitySendKey(USER_NAME_TEXT, USER_NAME);
        Methods.waitVisibilitySendKey(PASS_WORD_TEXT, PASS_WORD);
        Methods.waitClicableSubmit(SUBMIT_BUTTON);
        Assert.assertEquals(Methods.findElement(MY_ACCOUNT).isDisplayed(), true);
        logger.info("Login işlemi başarılı!");


    }


    public static void searchAndSelectProduct() {
        Methods.waitVisibilitySendKey(SEARCH_BAR,SEARCH_WORD);
        Methods.waitVisibilityClick(SEARCH_BUTTON);
        Methods.waitVisibilityClick(NEXT_PAGE);
        Assert.assertEquals(Methods.findElement(CURRENT).getText(), "2");
        List<WebElement> links = driver.findElements(ITEM_LIST);
        System.out.println("boyutu : " + links.size());
        Random productSize = new Random();
        int randomNumber = productSize.nextInt(links.size());
        System.out.println("Random üretilen Sayı:" + randomNumber);
        Methods.waitClicableClick(By.xpath("//li[@product-index='" + randomNumber + "']"));


    }


    public static void addBasket() {

        firstAmount = Methods.priceConvertDouble(FIRST_AMOUNT);
        Methods.waitClicableClick(KAPAT_SESSION);
        Methods.waitClicableClick(ADD_BASKET);


    }

    public static void goBasket() {

        Methods.waitClicableClick(BASKET_TITLE);
        secondAmount = Methods.priceConvertDouble(By.cssSelector("div[class='total-price']"));

    }

    public static void checkItemAndPrice() {
        Methods.waitClicableClick(AMOUNT);
        Methods.waitClicableClick(OPTION_VALUE);
        Methods.waitClicableClick(AMOUNT);
        Methods.waitClicableClick(UPDATE_BUTTON);


    }

    public static void checkPriceControl() {
        System.out.println(firstAmount+"ilk değer");
        System.out.println(secondAmount+"ikinci değer");

        if (firstAmount == secondAmount) {
            logger.info("Ürün fiyatı ve sepet fiyatı aynı!");

        } else {
            logger.info("Ürün fiyatı ve sepetteki ürün fiyatı eşleşmiyor! :(");
        }


    }


}
