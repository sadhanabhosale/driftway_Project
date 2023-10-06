package org.example.step_defination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page_action.PlaceOrder_Actions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class PlaceOrder_Steps {
    WebDriver driver;
    PlaceOrder_Actions placeOrder_actions;

    public PlaceOrder_Steps(Common_Steps commonSteps, PlaceOrder_Actions placeOrder_actions) {
        this.driver = commonSteps.getDriver();
        this.placeOrder_actions = placeOrder_actions;
    }


    @Given("I open application url")
    public void i_open_application_url() {
        driver.get("https://driftdev2.wpengine.com/customize-your-gift/");

    }

    @Given("Navigate to homepage")
    public void navigate_to_homepage() {

    }

    @Given("I change country")
    public void i_change_country()throws InterruptedException, IOException {
        placeOrder_actions.selectCountry();
        placeOrder_actions.selectShippingCountry();
    }

    @When("I select coffee type")
    public void i_select_coffee_type()throws InterruptedException, IOException{
        placeOrder_actions.selectCoffeeType();
    }



    @When("I choose future deliveries")
    public void i_choose_future_deliveries()throws InterruptedException {
        placeOrder_actions.selectFutureDelivery();
    }

    @When("I select how often")
    public void i_select_how_often()throws InterruptedException {
        placeOrder_actions.selectHowOften();
    }
    @When("I select how long")
    public void i_select_how_long()throws InterruptedException,IOException {
        placeOrder_actions.selectHowLong();

    }
    @When("I click on next button")
    public void i_click_on_next_button() throws InterruptedException, IOException {
        placeOrder_actions.clickHomeNextButton();
    }

    @When("I click add button of aeropress coffee maker")
    public void i_click_add_button_of_aeropress_coffee_maker()throws InterruptedException, IOException {
        placeOrder_actions.clickOnAdd();

    }
    @When("I click on next button of gear page")
    public void i_click_on_next_button_of_gear_page()throws InterruptedException,IOException {
        placeOrder_actions.clickGearPageNextButton();

    }
    @Then("I redirect on delivery page")
    public void i_redirect_on_delivery_page() {

    }

    @When("I select delivery option")
    public void i_select_delivery_option() throws InterruptedException, IOException{
        placeOrder_actions.selectDeliveryOption();

    }
    @When("Fill delivery details")
    public void fill_delivery_details()throws InterruptedException, IOException {
        placeOrder_actions.firstName();
        placeOrder_actions.enterLastName();
        placeOrder_actions.enterEmail();
        placeOrder_actions.enterAddress1();
        placeOrder_actions.enterAddress2();
        placeOrder_actions.enterCity();
        placeOrder_actions.selectState();
        placeOrder_actions.enterPostalCode();
        placeOrder_actions.selectCheckBox();
        placeOrder_actions.enterPhoneNumber();
        placeOrder_actions.enterGiftRecipient();
        placeOrder_actions.enterGiftMessage();
        placeOrder_actions.enterRecipientEmail();
        placeOrder_actions.selectCheckBox2();

    }
    @When("Click on next button of delivery page")
    public void click_on_next_button_of_delivery_page()throws InterruptedException,IOException {
        placeOrder_actions.clickNextButtonOfDelivery();
    }

    @Then("I select timing")
    public void i_select_timing() throws InterruptedException,IOException{
        placeOrder_actions.selectTiming();

    }
    @Then("click on next button of timing page")
    public void click_on_next_button_of_timing_page()throws InterruptedException, IOException {
        placeOrder_actions.clickOnNextButtonOfTiming();
    }
    @Then("I click on next button of review page")
    public void i_click_on_next_button_of_review_page()throws InterruptedException, IOException {
       placeOrder_actions.clickOnNextButtonOfReview();
    }

    @Then("I enter valid password in password field of account page")
    public void i_enter_valid_password_in_password_field_of_account_page()throws InterruptedException {
     placeOrder_actions.enterPassword();
    }
    @Then("I click on sign up button")
    public void i_click_on_sign_up_button()throws InterruptedException,IOException {
        placeOrder_actions.clickOnSignUp();

    }
    @Then("I change country flag")
    public void i_change_country_flag()throws InterruptedException {
        placeOrder_actions.changeFlag();
    }
    @When("I click on newsletter checkbox")
    public void i_click_on_newsletter_checkbox() throws InterruptedException{
        placeOrder_actions.clickOnSmsCheckBox();

    }
    @When("I click on billing check box")
    public void i_click_on_billing_check_box()throws InterruptedException {
        placeOrder_actions.clickBillingCheckbox();
    }
    @When("I fill all payment details")
    public void i_fill_all_payment_details()throws InterruptedException, IOException {
        placeOrder_actions.clickCreditButton();
        placeOrder_actions.enterCardNumber();
        placeOrder_actions.enterExpiryDate();
        placeOrder_actions.enterCardCode();
    }


    @When("Click on place order button")
    public void click_on_place_order_button() throws InterruptedException,IOException{
        placeOrder_actions.clickOnPlaceOrderButton();

    }



}
