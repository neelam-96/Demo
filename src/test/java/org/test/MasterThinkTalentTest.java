package org.test;

import org.think.selenium.thinktalent.DriverChromeUtil;

public class MasterThinkTalentTest {

    private static final String VIDEO_URL = null;
    private WebDriver driver;




    @BeforeMethod
    public void setUp() throws Exception {
        driver  = DriverChromeUtil.getDriver();



    }


    @Test(enabled = true)
    public void AdminTest() throws Exception {
        new ThinkTalentTest(driver).thinktalenttest();

    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() throws Exception {
        //driver.quit();
        driver.close();
    }

}




}
