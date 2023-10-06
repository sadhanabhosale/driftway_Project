package org.example.page_action;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.example.page_elements.PlaceOrder_Elements;
import org.example.step_defination.Common_Steps;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class PlaceOrder_Actions {
    WebDriver driver;
    PlaceOrder_Elements placeOrderElements;



    public PlaceOrder_Actions(Common_Steps commonSteps, PlaceOrder_Elements placeOrder_elements) {
        this.driver = commonSteps.getDriver();
        this.placeOrderElements = placeOrder_elements;
    }

    public void selectCountry() throws InterruptedException, IOException {
        placeOrderElements.changeCountry.click();
        Thread.sleep(1000);

    }

    public void selectShippingCountry() {
        Select countryDropDown = new Select(placeOrderElements.shippingCountry);
        countryDropDown.selectByValue("IN");

    }

    public void selectCoffeeType() throws InterruptedException, IOException {
        placeOrderElements.cancelButton.click();
        Thread.sleep(2000);

         placeOrderElements.coffeeType.click();
         Thread.sleep(3000);

        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(3000);

        body.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);

        body.sendKeys(Keys.PAGE_UP);



    }

    public void selectFutureDelivery()throws InterruptedException {

         placeOrderElements.futureDeliveries.click();
         Thread.sleep(2000);

         WebElement body = driver.findElement(By.tagName("body"));
         body.sendKeys(Keys.PAGE_DOWN);
         Thread.sleep(3000);

    }

    public void selectHowOften() throws InterruptedException{

        placeOrderElements.howOften.click();
        Thread.sleep(4000);
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);
        body.sendKeys(Keys.PAGE_UP);



    }
    public void selectHowLong() throws InterruptedException, IOException {
        placeOrderElements.howLong.click();
        Thread.sleep(2000);
        File ScreenShot1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot1,new File("./screenshot/giftPage.png"));

    }
    public void clickHomeNextButton() throws InterruptedException, IOException {
        placeOrderElements.nextButton1.click();
        Thread.sleep(3000);


    }

    public void clickOnAdd() throws InterruptedException, IOException {

        placeOrderElements.addButton.click();
        Thread.sleep(1000);

    }

    public void clickGearPageNextButton() throws InterruptedException, IOException {
        placeOrderElements.gearNextButton.click();
        Thread.sleep(2000);
        File ScreenShot2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ScreenShot2,new File("./screenshot/gearPage.png"));

    }

    public void selectDeliveryOption() throws InterruptedException, IOException {
        placeOrderElements.deliveryOptions.click();
        Thread.sleep(2000);

    }

    public void firstName()throws InterruptedException{
        placeOrderElements.firstName.sendKeys("Sadhana");
        Thread.sleep(2000);
    }
    public void enterLastName()throws InterruptedException{
        placeOrderElements.lastName.sendKeys("Bhosale");
        Thread.sleep(2000);

    }

    public  void enterEmail()throws InterruptedException{
        placeOrderElements.email.sendKeys("nkwdyja21@gmail.com");
        Thread.sleep(2000);

    }
    public void enterAddress1()throws InterruptedException{
        placeOrderElements.address1.sendKeys("At Post Latur, Dist Latur");
        Thread.sleep(2000);
    }
    public void enterAddress2()throws InterruptedException{
        placeOrderElements.address2.sendKeys("State Maharashtra, India");
        Thread.sleep(2000);

    }
    public void enterCity()throws InterruptedException{
        placeOrderElements.city.sendKeys("Latur");
        Thread.sleep(2000);

    }
    public void selectState()throws InterruptedException{
        Select stateDropDown=new Select(placeOrderElements.state);
        stateDropDown.selectByValue("MH");
        Thread.sleep(2000);
    }

    public void enterPostalCode()throws InterruptedException{
        placeOrderElements.postalCode.sendKeys("413512");
        Thread.sleep(2000);
    }

   public void selectCheckBox()throws InterruptedException{
        placeOrderElements.checkBox.click();
        Thread.sleep(1000);
   }
   public void enterPhoneNumber() throws InterruptedException{
        placeOrderElements.phoneNumber.sendKeys("9011595767");
        Thread.sleep(2000);
   }
   public void enterGiftRecipient()throws InterruptedException{
        placeOrderElements.giftRecipient.sendKeys("Codingkart It Services (India) PVT LTD Indore,MP 452001");
        Thread.sleep(2000);
   }

   public void enterGiftMessage()throws InterruptedException{
        placeOrderElements.giftMessage.sendKeys("Good Luck On All Your New Adventures...!!");
        Thread.sleep(2000);
   }
   public void enterRecipientEmail()throws InterruptedException{
        placeOrderElements.recipientEmail.sendKeys("codingkart123@gmail.com");
        Thread.sleep(2000);
   }

   public void selectCheckBox2() throws InterruptedException, IOException {
        placeOrderElements.checkBox2.click();
        Thread.sleep(2000);
   }
   public void clickNextButtonOfDelivery() throws InterruptedException, IOException {
        placeOrderElements.nextButtonDelivery.click();
        Thread.sleep(2000);
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);


   }
   public void selectTiming() throws InterruptedException, IOException {
        placeOrderElements.timing.click();
        Thread.sleep(2000);

   }
   public void clickOnNextButtonOfTiming() throws InterruptedException, IOException {
        placeOrderElements.nextButtonOfTiming.click();
        Thread.sleep(2000);
   }
   public void clickOnNextButtonOfReview() throws InterruptedException, IOException {
        placeOrderElements.nextButtonReview.click();
        Thread.sleep(2000);
   }
   public void enterPassword() throws InterruptedException{
        placeOrderElements.password.sendKeys("SadhanaBhosale@123");
        Thread.sleep(2000);
   }
   public void clickOnSignUp() throws InterruptedException, IOException {
        placeOrderElements.signUpButton.click();
        Thread.sleep(20000);

   }
   public void clickOnSmsCheckBox()throws InterruptedException{
        placeOrderElements.sms.click();
        Thread.sleep(5000);
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(2000);

   }
   public void changeFlag()throws InterruptedException{
        placeOrderElements.flag.click();
        Thread.sleep(2000);
        placeOrderElements.india.click();

   }
   public void clickBillingCheckbox() throws InterruptedException {

        placeOrderElements.billingCheckBox.click();
        Thread.sleep(10000);
        WebElement body = driver.findElement(By.tagName("body"));
        body.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(1000);


   }
   public void clickCreditButton()throws InterruptedException{
        placeOrderElements.creditButton.click();
        Thread.sleep(2000);

   }

   public void enterCardNumber()throws InterruptedException{
       driver.switchTo().defaultContent();
       placeOrderElements.iframe.sendKeys("4242424242424242");
       Thread.sleep(2000);
   }
   public void enterExpiryDate()throws InterruptedException{
        driver.switchTo().defaultContent();
        placeOrderElements.iframe2.sendKeys("12,34");
        Thread.sleep(2000);

   }
   public void enterCardCode() throws InterruptedException, IOException {
        driver.switchTo().defaultContent();
        placeOrderElements.iframe3.sendKeys("564");
        Thread.sleep(2000);

   }


    public void clickOnPlaceOrderButton() throws InterruptedException, IOException {
        placeOrderElements.placeOrderButton.click();
        Thread.sleep(1000);


    }



}