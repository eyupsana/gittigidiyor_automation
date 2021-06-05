package org.example;

import org.openqa.selenium.By;

public class Costants {
    public static final String BASE_URL = "http://www.gittigidiyor.com";
    public static final By HOVER_LOGIN_BUTTON = By.xpath("//div[@data-cy='header-user-menu']");
    public static final By LOGIN_BUTTON = By.xpath("//a[@data-cy='header-login-button']");
    public static final By USER_NAME_TEXT = By.id("L-UserNameField");
    public static final String USER_NAME = "eyuptest34@gmail.com";
    public static final By PASS_WORD_TEXT = By.id("L-PasswordField");
    public static final String PASS_WORD = "test1234";
    public static final By SUBMIT_BUTTON = By.xpath("//input[@id='gg-login-enter']");
    public static final By MY_ACCOUNT = By.xpath("//div[@title='Hesabım']");
    public static final By SEARCH_BAR = By.cssSelector("input[name='k']");
    public static final String SEARCH_WORD = "Bilgisayar";
    public static final By SEARCH_BUTTON = By.xpath("//button[@data-cy='search-find-button']");
    public static final By NEXT_PAGE = By.cssSelector("li[class='next-link']");
    public static final By CURRENT = By.cssSelector("a[class='current']");
    public static final By ITEM_LIST = By.className("srp-item-list");
    public static final By FIRST_AMOUNT = By.xpath("//div[@id='sp-price-container']//div[2]");
    public static final By KAPAT_SESSION = By.xpath("//span[text()='Kapat']");
    public static final By ADD_BASKET = By.cssSelector("button[id='add-to-basket']");
    public static final By BASKET_TITLE = By.cssSelector("span[class='basket-title']");
    public static final By AMOUNT = By.xpath("//select[@class='amount']");
    public static final By OPTION_VALUE=By.cssSelector("option[value='2']");
    public static final By UPDATE_BUTTON=By.xpath("//div[contains(@class,'update-buttons-container')]//div[@class='row']//a//i/following-sibling::span[text()='Sil']");


}
