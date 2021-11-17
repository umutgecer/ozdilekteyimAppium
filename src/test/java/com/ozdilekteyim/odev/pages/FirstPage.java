package com.ozdilekteyim.odev.pages;

import com.ozdilekteyim.odev.BaseTest;
import com.ozdilekteyim.odev.selector.Selector;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;


public class FirstPage extends BaseTest {
    @Step("Uygulamanın Çalıştığını Kontrol Et")
    public void checkOpen() throws InterruptedException {
        Thread.sleep(3000);
        String checkText = appiumDriver.findElement(Selector.CHECK_APPLICATION_WORK).getText();
        Assert.assertEquals("TESLİMAT BÖLGESİ SEÇ", checkText);
        logger.info("Uygulamanın Açıldığı Kontrol Ediliyor");
    }

    @Step("Alış Verişe Başla Butonuna Bas")
    public void clickStartShopping() throws InterruptedException {
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.CLICK_START_SHOPPING).click();
        logger.info("Alışverişe Başla Butonuna Tıklanıyor...");
    }

    @Step("Alışveriş Sayfasının Açıldığını Kontrol Et")
    public void checkMainPageText() throws InterruptedException {
        Thread.sleep(2000);
        String checkText = appiumDriver.findElement(Selector.CHECK_MAIN_PAGE).getText();
        Assert.assertEquals("Market", checkText);
        logger.info("Alisveris Sayfasinin Acildigi Kontrol Ediliyor ...");
    }
}
