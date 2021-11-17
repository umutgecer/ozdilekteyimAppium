package com.ozdilekteyim.odev.pages;

import com.ozdilekteyim.odev.BaseTest;
import com.ozdilekteyim.odev.selector.Selector;
import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class ProdcutDetail extends BaseTest {

    @Step("Sayfayı Aşağı Kaydır")
    public void scrollDown() throws InterruptedException {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        Thread.sleep(1000);
        logger.info("Sayfa Aşağı Kaydırılıyor");
    }

    @Step("Sayfayı Aşağı İkinci Kez Kaydır")
    public void secondScrollDown() {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        logger.info("Sayfa Aşağı Kaydırıylıyor...");
    }

    @Step("<Key> Rastgele Ürün Seç")
    public void findAllProducts(String Key) {
        List<MobileElement> productList = appiumDriver.findElementsByXPath(Key);
        int size = productList.size();
        Random rnd = new Random();
        int randNum = rnd.nextInt(size);
        productList.get(randNum).click();
    }

    @Step("Ürün Detay Sayfasını Kontrol Et")
    public void checkProductDetail() throws InterruptedException {
        Thread.sleep(1000);
        String checkText = appiumDriver.findElement(Selector.CHECK_PRODUCT_DETAILS).getText();
        Assert.assertEquals("Renk:", checkText);
        logger.info("Ürün Detay Sayfasi Kontrolü");
    }

    @Step("Favorilere Ekle")
    public void addFav() throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(Selector.ADD_FAV).click();
        logger.info("Favorilere Ekleniyor...");
    }

    @Step("<Key> Beden Seç")
    public void clickElementByxpath(String Key) {
        appiumDriver.findElement(By.xpath(Key)).click();
        Logger.info("Beden seçiliyor...");
    }

    @Step("Sepete Ekle")
    public void addToCard() throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(Selector.ADD_CARD).click();
        logger.info("Sepete Ekleniyor...");
    }


}
