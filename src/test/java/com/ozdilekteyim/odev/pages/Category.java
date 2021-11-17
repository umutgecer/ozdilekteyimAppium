package com.ozdilekteyim.odev.pages;

import com.ozdilekteyim.odev.BaseTest;
import com.ozdilekteyim.odev.selector.Selector;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class Category extends BaseTest {

    @Step("Kategoriler Sayfasını Aç")
    public void openCategoryPage() throws InterruptedException {
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.OPEN_CATEGORY_PAGE).click();
        logger.info("Kategoriler Sayfası Açılıyor...");
    }

    @Step("Kategoriler Sayfasının Açıldığını Kontrol Et")
    public void checkCategoryPage() throws InterruptedException {
        Thread.sleep(2000);
        String checkText = appiumDriver.findElement(Selector.CHECK_CATEGORY_PAGE).getText();
        Assert.assertEquals("Kategoriler", checkText);
        logger.info("Kategoriler Sayfasinin Acildigi Dogrulaniyor...");
    }t

    @Step("Kategorilerden Kadın'ı Seç")
    public void clickKadin() throws InterruptedException {
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.CLICK_KADIN).click();
        logger.info("Kategorilerden 'Kadin' Seciliyor...");
    }

    @Step("Pantolon Kategorisini Seç")
    public void clickPantolon() throws InterruptedException {
        Thread.sleep(2000);
        appiumDriver.findElement(Selector.CLICK_PANTS).click();
        logger.info("Pantolon Kategorisi Seciliyor....");
    }
}
