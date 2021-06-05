package org.example;

import org.junit.Test;

public class MainClass extends TestClass {
    @Test
    public void testRun() {
        login();
        searchAndSelectProduct();
        addBasket();
        goBasket();
        checkPriceControl();
        checkItemAndPrice();


    }
}
