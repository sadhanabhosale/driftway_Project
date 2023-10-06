package org.example.page_elements;

import org.example.step_defination.Common_Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder_Elements {
 WebDriver driver;

 public PlaceOrder_Elements(Common_Steps commonSteps) {
  this.driver = commonSteps.getDriver();
  PageFactory.initElements(driver, this);
 }

 @FindBy(linkText = "Change")
 public WebElement changeCountry;

 @FindBy(xpath = "//select[@class='form-select']")
 public WebElement shippingCountry;
 @FindBy(xpath = "//button[@class='close']")
 public WebElement cancelButton;

 @FindBy(xpath = "//a[@id='ngcChooseCoffeewhole-bean']")
 public WebElement coffeeType;

 @FindBy(xpath = "//span[@class='ngcFooPriceText']")
 public WebElement handlePrize;

 @FindBy(xpath = "//*[@id=\"coffee-ngC\"]/div[1]/div[2]/div[3]/div[1]/div[1]")
 public WebElement futureDeliveries;

//     @FindBy(className = "ngcFooPriceText")
//    public WebElement booleanInvisible;

 @FindBy(xpath = "//*[@id=\"coffee-ngC\"]/div[1]/div[2]/div[4]/div/div[2]")
 public WebElement howOften;

 @FindBy(xpath = "//*[@id=\"coffee-ngC\"]/div[1]/div[2]/div[5]/div/div[3]")
 public WebElement howLong;

// @FindBy(xpath = "//div[@class='content-ngC active']")
// public WebElement newGiftPage;

 @FindBy(xpath = "//a[@class='button ngcStepAction']")
 public WebElement nextButton1;

 @FindBy(linkText = "ADD")
 public WebElement addButton;

 @FindBy(xpath = "//a[@data-ngc-step-id='2']")
 public WebElement gearNextButton;

// @FindBy(xpath = "//div[@class='site-inner']")
// public WebElement gearPage;

 @FindBy(linkText = "Send the first box to me")
 public WebElement deliveryOptions;

 @FindBy(xpath = "//*[@id='sendToMeForm']/div[1]/div/div[1]/input")
 public WebElement firstName;

 @FindBy(xpath = "//*[@id='sendToMeForm']/div[1]/div/div[2]/input")
 public WebElement lastName;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[1]/div/div[3]/input")
 public WebElement email;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[1]/div/div[4]/input")
 public WebElement address1;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[1]/div/div[5]/input")
 public WebElement address2;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[1]/div/div[6]/input")
 public WebElement city;

 @FindBy(id = "form_2_state")
 public WebElement state;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[1]/div/div[8]/input")
 public WebElement postalCode;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[1]/div/div[8]/input")
 public WebElement checkBox;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[1]/div/div[11]/input")
 public WebElement phoneNumber;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[2]/div/div[1]/input")
 public WebElement giftRecipient;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[2]/div/div[2]/textarea")
 public WebElement giftMessage;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[2]/div/div[3]/input")
 public WebElement recipientEmail;

 @FindBy(xpath = "//form[contains(@id,'sendToMeForm')]/div[2]/div/p[2]/label")
 public WebElement checkBox2;

 @FindBy(xpath = "//div[contains(@class,'ngcStepFooter active')]/div[1]/a")
 public WebElement nextButtonDelivery;

 @FindBy(xpath = "//*[@id=\"ngcTimingCalendar\"]/div/table/tbody/tr[5]/td[6]")
 public WebElement timing;

 @FindBy(xpath = "//div[contains(@class,'ngcStepFooter active')]/div[1]/a")
 public WebElement nextButtonOfTiming;

 @FindBy(xpath = "//div[contains(@class,'ngcStepFooter active')]/div[1]/a")
 public WebElement nextButtonReview;

 @FindBy(xpath = "//input[contains(@id,'reg_password')]")
 public WebElement password;

 @FindBy(xpath = "//form[contains(@id,'register')]/p[3]")
 public WebElement signUpButton;

 @FindBy(xpath ="//div[@class='iti__selected-flag']")
  public WebElement flag;

 @FindBy(id = "iti-0__item-in")
 public WebElement india;

 @FindBy(xpath = "//input[@id='add_subscriber_for_sms']")
 public WebElement sms;

 @FindBy(xpath = "//*[@id='customer_details']/div[3]/div[1]/label")
 public WebElement billingCheckBox;

 @FindBy(xpath = "//li[@class='wc_payment_method payment_method_stripe']")
 public WebElement creditButton;


 @FindBy(xpath = "//*[@id='stripe-card-element']/div/iframe")
 public WebElement iframe;

 @FindBy(xpath = "//*[@id='stripe-exp-element']/div/iframe")
 public WebElement iframe2;

 @FindBy(xpath = "//*[@id='stripe-cvc-element']/div/iframe")
 public WebElement iframe3;

 @FindBy(xpath = "//a[@id='custom_place_order']")
 public WebElement placeOrderButton;


}