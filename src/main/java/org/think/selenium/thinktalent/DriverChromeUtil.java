package org.think.selenium.thinktalent;

public class DriverChromeUtil {

    public static ChromeOptions getChromeOptions() {
        return ChromeUtility.getChromeOptions("64", "D:\\Think Talent\\Selenium HUB\\GoogleChromePortable.exe");
    }

    public static WebDriver getDriver() {
        return DriverUtility.getRemoteChromeDriver("http://192.168.2.112/wd/hub", getChromeOptions());

    }


}
