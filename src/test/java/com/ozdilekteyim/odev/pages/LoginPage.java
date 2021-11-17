package com.ozdilekteyim.odev.pages;

import com.ozdilekteyim.odev.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

import static com.ozdilekteyim.odev.selector.Selector.*;
import static com.ozdilekteyim.odev.selector.Selector.PASSWORD;

public class LoginPage extends BaseTest {
    @Step("Giriş Yap Sayfası Kontrol Et")
    public void checkLoginPage() throws InterruptedException {
        Thread.sleep(1000);
        String checkText = appiumDriver.findElement(CHECK_LOGIN_PAGE).getText();
        Assert.assertEquals("Giriş Yap", checkText);
        logger.info("Giriş Yap Sayfası Kontrol Ediliyor...");
    }

    @Step("Giriş Yap Sayfası Kontrol Et")
    public void writeLoginBoxes() {
        appiumDriver.findElement(EMAIL_BOX).sendKeys(EMAIL);
        appiumDriver.findElement(PASSWORD_BOX).sendKeys(PASSWORD);
        logger.info("Mail ve Şifre Giriliyor...");
    }

    @Step("Bir Önceki Sayfaya Git")
    public void backToPage() {
        appiumDriver.findElement(BACK_TO_PAGE).click();
        logger.info("Bir Önceki Sayfaya Gidiliyor");
    }
}
