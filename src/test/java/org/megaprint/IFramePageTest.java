package org.megaprint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Baurz on 4/27/2017.
 */
public class IFramePageTest {

    WebDriver driver;

    @BeforeClass
    public void init(){
        driver=new FirefoxDriver();
    }

    @Test
    public void test1(){
        driver.get("https://fantasycricket.dream11.com/in/");
        int framecount=driver.findElements(By.tagName("iframe")).size();
        System.out.println("IFrames="+framecount);
        driver.findElement(By.xpath("//*[@id='m_frmRegister']/div[6]/p")).click();
    }
    @AfterMethod
    public void after() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }

}
