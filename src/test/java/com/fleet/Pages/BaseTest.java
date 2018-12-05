package com.fleet.Pages;

import com.fleet.Base.BaseUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends BaseUtils {

    private BaseUtils base;

    public BaseTest(BaseUtils base) {
        this.base = base;
    }

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Drivers\\chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void teardown(){
        base.driver.quit();
    }
}
