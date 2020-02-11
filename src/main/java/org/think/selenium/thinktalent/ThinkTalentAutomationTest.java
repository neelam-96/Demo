package org.think.selenium.thinktalent;

public class ThinkTalentAutomationTest {



    private WebDriver driver;

    public ThinkTalentAutomationTest(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();

    }

    public void processTest() throws InterruptedException {

        new ThinkTalentTest(driver).thinktalenttest();


    }


    public static void main(String[] args) {

        try {


            WebDriver driver = DriverChromeUtil.getDriver();

            ThinkTalentAutomationTest automationTest = new ThinkTalentAutomationTest(driver);
            automationTest.processTest();
            //driver.quit();
            Thread.sleep(3000);
            driver.close();


        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

}
