package org.example.step_defination;

import com.google.common.collect.ImmutableList;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.ImmutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.time.Duration;
import java.util.Arrays;

public class Common_Steps {
    public static WebDriver driver;
    String excludeSwitches;
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setup(){

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.addArguments("--remote-allow-origins=*");

        // WebDriverManager.chromedriver().setup();
        driver =new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }

}


