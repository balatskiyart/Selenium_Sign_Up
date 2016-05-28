package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestSignUp {
    public static void main(String[] args) throws InterruptedException {
        String text_case_id_01 = "TC-001.01";
        String text_case_id_02 = "TC-001.02";
        String text_case_id_03 = "TC-001.03";
        String text_case_id_04 = "TC-001.04";
        String text_case_id_05 = "TC-001.05";
        String text_case_id_06 = "TC-001.06";
        String text_case_id_07 = "TC-001.07";
        String text_case_id_08 = "TC-001.08";
        String text_case_id_09 = "TC-001.09";
        String text_case_id_10 = "TC-001.10";
        String text_case_id_11 = "TC-001.11";
        String text_case_id_12 = "TC-001.12";
        String text_case_id_13 = "TC-001.13";
        String text_case_id_14 = "TC-001.14";
        String text_case_id_15 = "TC-001.15";
        String text_case_id_16 = "TC-001.16";
        String text_case_id_17 = "TC-001.17";
        String text_case_id_18 = "TC-001.18";
        String text_case_id_19 = "TC-001.19";
        String text_case_id_20 = "TC-001.20";
        String text_case_id_21 = "TC-001.21";
        String text_case_id_22 = "TC-001.22";
        String text_case_id_23 = "TC-001.23";
        String text_case_id_24 = "TC-001.24";
        String text_case_id_25 = "TC-001.25";
        String text_case_id_26 = "TC-001.26";
        String text_case_id_27 = "TC-001.27";
        String text_case_id_28 = "TC-001.28";
        String text_case_id_29 = "TC-001.29";
        String text_case_id_30 = "TC-001.30";
        String text_case_id_31 = "TC-001.31";

        String url = "http://learn2test.net/qa/apps/sign_up/v1/";
        String title_sign_up_expected = "Welcome to Sign Up v1";
        String title_submit_expected = "Confirmation";

        String title_facebook_expected = "Facebook - Log In or Sign Up";
        String error_fname_empty_expected = "Please enter First Name";
        String fname = "Artem";
        String lname = "Balatskiy";
        String email = "balatskiyart@outlook.com";
        String phone = "916-225-9188";

        // ======================================================================================================
        //
        // F A Q
        //
        // ======================================================================================================
        // String link =
        // driver.findElement(By.linkText(linkText)).getAttribute("href")
        // This will give you the link the element is pointing to.

        // ======================================================================================================
        // WebDriver driver = new HtmlUnitDriver();
        WebDriver driver = new FirefoxDriver();
        // ((HtmlUnitDriver) driver).setJavascriptEnabled(true);

        // ======================================================================================================
        // TC-001.01
        // Sign Up page html title is: "Welcome to Sign Up"

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title_sign_up_actual = driver.getTitle();

        if (title_sign_up_expected.equals(title_sign_up_actual)) {
            System.out.println("Test Case ID: \t\t" + text_case_id_01 + " - PASSED");
            System.out.println("Title Expected/Actual: \t" + title_sign_up_expected + "/" + title_sign_up_actual);
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_01 + " - FAILED");
            System.out.println("Title Expected/Actual: \t" + title_sign_up_expected + "/" + title_sign_up_actual);
            System.out.println("=======================================");
        }

        // ======================================================================================================
        // TC-001.02
        // Sign Up page application title is: "Sign Up"

        driver.findElement(By.id("id_img_facebook")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        ArrayList<String> allTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(allTabs.get(1));
        String title_facebook_actual = driver.getTitle();
        driver.close();
        driver.switchTo().window(allTabs.get(0));

        if (title_facebook_expected.equals(title_facebook_actual)) {
            System.out.println("Test Case ID: \t\t" + text_case_id_02 + " - PASSED");
            System.out.println("Title Expected/Actual: \t" + title_facebook_expected + "/" + title_facebook_actual);
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_02 + " - FAILED");
            System.out.println("Title Expected/Actual: \t" + title_facebook_expected + "/" + title_facebook_actual);
            System.out.println("=======================================");
        }

        // TC-001.03
        // Page contains dynamic text (quote)

        driver.findElement(By.id("id_quotes")).getText();
        String quote = driver.findElement(By.id("id_quotes")).getText();
        if (quote != null && quote.length() < 103 && quote.length() > 36) {
            System.out.println("Test Case ID: \t\t" + text_case_id_03 + " - PASSED");
            System.out.println("Quote length: " + quote.length());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_03 + " - FAILED");
            System.out.println("Quote length: " + quote.length());
            System.out.println("=======================================");
        }

        // TC-001.04
        // Page contains 4 text fields ("First Name", "Last Name", "Email
        // Address", "Phone")

        driver.findElement(By.id("id_submit_button")).click();
        String error_fname_empty_actual = driver.findElement(By.id("ErrorLine")).getText();

        if (error_fname_empty_expected.equals(error_fname_empty_actual)) {
            System.out.println("Test Case ID: \t\t" + text_case_id_04 + " - PASSED");
            System.out
                    .println("Error Expected/Actual: \t" + error_fname_empty_expected + "/" + error_fname_empty_actual);
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_04 + " - FAILED");
            System.out
                    .println("Error Expected/Actual: \t" + error_fname_empty_expected + "/" + error_fname_empty_actual);
            System.out.println("=======================================");
        }

        // TC-001.05
        // Page contains 2 radio buttons (Gender: "Male", "Female")

        driver.findElement(By.id("id_fname")).sendKeys(fname);
        driver.findElement(By.id("id_lname")).sendKeys(lname);
        driver.findElement(By.id("id_email")).sendKeys(email);
        driver.findElement(By.id("id_phone")).sendKeys(phone);
        driver.findElement(By.id("id_submit_button")).click();

        String fname_conf_actual = driver.findElement(By.id("id_fname_conf")).getText();
        String lname_conf_actual = driver.findElement(By.id("id_lname_conf")).getText();
        String email_conf_actual = driver.findElement(By.id("id_email_conf")).getText();
        String phone_conf_actual = driver.findElement(By.id("id_phone_conf")).getText();

        if (fname.equals(fname_conf_actual) && lname.equals(lname_conf_actual) && email.equals(email_conf_actual)
                && phone.equals(phone_conf_actual)) {
            System.out.println("Test Case ID: \t\t" + text_case_id_05 + " - PASSED");
            System.out.println("First Expected/Actual: \t" + fname + "/" + fname_conf_actual);
            System.out.println("Last Expected/Actual: \t" + lname + "/" + lname_conf_actual);
            System.out.println("Email Expected/Actual: \t" + email + "/" + email_conf_actual);
            System.out.println("Phone Expected/Actual: \t" + phone + "/" + phone_conf_actual);
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_05 + " - FAILED");
            System.out.println("First Expected/Actual: \t" + fname + "/" + fname_conf_actual);
            System.out.println("Last Expected/Actual: \t" + lname + "/" + lname_conf_actual);
            System.out.println("Email Expected/Actual: \t" + email + "/" + email_conf_actual);
            System.out.println("Phone Expected/Actual: \t" + phone + "/" + phone_conf_actual);
            System.out.println("=======================================");
        }

        // TC-001.30
        // "Confirmation" page contains: First Name, Last Name, Email Address,
        // Phone values, as well as optional if filled"

        if (fname.equals(driver.findElement(By.id("id_fname_conf")).getText())
                && lname.equals(driver.findElement(By.id("id_lname_conf")).getText())
                && email.equals(driver.findElement(By.id("id_email_conf")).getText())
                && phone.equals(driver.findElement(By.id("id_phone_conf")).getText())) {
            System.out.println("Test Case ID: \t\t" + text_case_id_30 + " - PASSED");
            System.out.println(
                    "First Expected/Actual: \t" + fname + "/" + driver.findElement(By.id("id_fname_conf")).getText());
            System.out.println(
                    "Last Expected/Actual: \t" + lname + "/" + driver.findElement(By.id("id_lname_conf")).getText());
            System.out.println(
                    "Email Expected/Actual: \t" + email + "/" + driver.findElement(By.id("id_email_conf")).getText());
            System.out.println(
                    "Phone Expected/Actual: \t" + phone + "/" + driver.findElement(By.id("id_phone_conf")).getText());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_30 + " - FAILED");
            System.out.println(
                    "First Expected/Actual: \t" + fname + "/" + driver.findElement(By.id("id_fname_conf")).getText());
            System.out.println(
                    "Last Expected/Actual: \t" + lname + "/" + driver.findElement(By.id("id_lname_conf")).getText());
            System.out.println(
                    "Email Expected/Actual: \t" + email + "/" + driver.findElement(By.id("id_email_conf")).getText());
            System.out.println(
                    "Phone Expected/Actual: \t" + phone + "/" + driver.findElement(By.id("id_phone_conf")).getText());
            System.out.println("=======================================");
        }

        // TC-001.31
        // "Back" button redirect to main page (Sign Up)

        driver.findElement(By.id("id_back_button")).click();

        driver.get(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title_main = driver.getTitle();

        if (title_sign_up_expected.equals(title_main)) {
            System.out.println("Test Case ID: \t\t" + text_case_id_31 + " - PASSED");
            System.out.println("Redirect to main page Expected/Actual: \t" + "true" + "/"
                    + (title_sign_up_expected.equals(title_main)));
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_31 + " - FAILED");
            System.out.println("Redirect to main page Expected/Actual: \t" + "false" + "/"
                    + (title_sign_up_expected.equals(title_main)));
            System.out.println("=======================================");
        }

		/*
		 * driver.findElement(By.id("id_g_radio_01")).click();
		 * driver.findElement(By.id("id_g_radio_02")).click();
		 * driver.findElement(By.id("id_img_facebook")).click();
		 * driver.findElement(By.id("id_submit_button")).click();
		 * driver.findElement(By.id("id_reset_button")).click();
		 * driver.findElement(By.id("id_img_facebook")).click();
		 * driver.findElement(By.id("id_img_twitter")).click();
		 * driver.findElement(By.id("id_img_flickr")).click();
		 * driver.findElement(By.id("id_img_youtube")).click();
		 */

        // TC-001.06
        // Page contains drop-down list ("State")

        // driver.findElement(By.id("id_state")).click();

        if (driver.findElement(By.id("id_state")).isDisplayed()) {
            System.out.println("Test Case ID: \t\t" + text_case_id_06 + " - PASSED");
            System.out.println("State is Displayed ? Expected/Actual: \t" + "true" + "/"
                    + driver.findElement(By.id("id_state")).isDisplayed());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_06 + " - FAILED");
            System.out.println("State is Displayed ? Expected/Actual: \t" + "false" + "/"
                    + driver.findElement(By.id("id_state")).isDisplayed());
            System.out.println("=======================================");
        }

        // TC-001.07
        // Page contain checkbox (Agreement on Terms)

        if (driver.findElement(By.id("id_checkbox")).isDisplayed()) {
            System.out.println("Test Case ID: \t\t" + text_case_id_07 + " - PASSED");
            System.out.println("Page cont. Checkbox Expected/Actual: \t" + "true" + "/"
                    + driver.findElement(By.id("id_checkbox")).isDisplayed());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_07 + " - FAILED");
            System.out.println("Page cont. Checkbox Expected/Actual: \t" + "false" + "/"
                    + driver.findElement(By.id("id_checkbox")).isDisplayed());
            System.out.println("=======================================");
        }

        // TC-001.08
        // Page contains 4 image links (Facebook, Twitter, Flickr, YouTube)

        if (driver.findElement(By.id("id_img_facebook")).isDisplayed()
                && driver.findElement(By.id("id_img_twitter")).isDisplayed()
                && driver.findElement(By.id("id_img_flickr")).isDisplayed()
                && driver.findElement(By.id("id_img_youtube")).isDisplayed()) {
            System.out.println("Test Case ID: \t\t" + text_case_id_08 + " - PASSED");
            System.out.println("Page cont. 4 img (FB, Tw, Flickr, YT) Expected/Actual: \t" + "true" + "/"
                    + driver.findElement(By.id("id_checkbox")).isDisplayed());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_08 + " - FAILED");
            System.out.println("Page cont. 4 img (FB, Tw, Flickr, YT) Expected/Actual: \t" + "false" + "/"
                    + driver.findElement(By.id("id_checkbox")).isDisplayed());
            System.out.println("=======================================");
        }

        // TC-001.09
        // Page contains 2 buttons ("Reset", "Submit")

        if (driver.findElement(By.id("id_submit_button")).isDisplayed()
                && driver.findElement(By.id("id_reset_button")).isDisplayed()) {
            System.out.println("Test Case ID: \t\t" + text_case_id_09 + " - PASSED");
            System.out.println("Page cont. 2 buttons Expected/Actual: \t" + "true" + "/"
                    + (driver.findElement(By.id("id_submit_button")).isDisplayed()
                    && driver.findElement(By.id("id_reset_button")).isDisplayed()));
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_09 + " - FAILED");
            System.out.println("Page cont. 2 buttons Expected/Actual: \t" + "false" + "/"
                    + (driver.findElement(By.id("id_submit_button")).isDisplayed()
                    && driver.findElement(By.id("id_reset_button")).isDisplayed()));
            System.out.println("=======================================");
        }

        // TC-001.10
        // Page contains dynamic text (today’s day) (Format - Month Day, Year:
        // [February 21, 2015])

        DateFormat dateFormat = new SimpleDateFormat("MMMM" + " d" + ", " + "yyyy ");
        Date date = new Date();

        if (dateFormat.format(date).equalsIgnoreCase(driver.findElement(By.id("timestamp")).getText())) {
            System.out.println("Test Case ID: \t\t" + text_case_id_10 + " - PASSED");
            System.out.println("dynamic text (today’s day) Expected/Actual: \t" + dateFormat.format(date) + "/"
                    + driver.findElement(By.id("timestamp")).getText());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_10 + " - FAILED");
            System.out.println("dynamic text (today’s day) Expected/Actual: \t" + dateFormat.format(date) + "/"
                    + driver.findElement(By.id("timestamp")).getText());
            System.out.println("=======================================");
        }

        // TC-001.11
        // Page contains static text (copyright) ("© 2015 learn2test.net")

        if (driver.findElement(By.id("copyright")).isDisplayed()) {
            System.out.println("Test Case ID: \t\t" + text_case_id_11 + " - PASSED");
            System.out.println("Page cont.Copyright label Expected/Actual: \t" + "true" + "/"
                    + driver.findElement(By.id("copyright")).isDisplayed());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_11 + " - FAILED");
            System.out.println("Page cont. Copyright label Expected/Actual: \t" + "false" + "/"
                    + driver.findElement(By.id("copyright")).isDisplayed());
            System.out.println("=======================================");
        }

        // TC-001.12
        // Page contains dynamic text (Client’s OS & Browser) (example: "Windows
        // 7 & Firefox 35")

        // driver.findElement(By.id("os_browser")).click();

        // TC-001.13
        // Page contains dynamic text (Client’s City and State) (example: "San
        // Francisco, CA")

        // driver.findElement(By.id("id_current_location")).click();

        // TC-001.14
        // Page contains dynamic icon (Client’s current weather)

        String xpath_pic = "/x:html/x:body/x:form/x:table/x:tbody/x:tr[3]/x:td/x:table/x:tbody/x:tr/x:td/x:table/x:tbody/x:tr[1]/x:td[5]/x:table/x:tbody/x:tr[2]/x:td[1]/x:img";
		/*
		 * if (//driver.findElements(By.xpath(
		 * "/x:html/x:body/x:form/x:table/x:tbody/x:tr[3]/x:td/x:table/x:tbody/x:tr/x:td/x:table/x:tbody/x:tr[1]/x:td[5]/x:table/x:tbody/x:tr[2]/x:td[1]/x:img"
		 * )).isDisplayed() )
		 *
		 * { System.out.println("Test Case ID: \t\t" + text_case_id_14 +
		 * " - PASSED"); System.out.println(
		 * "Page contain PicW Expected/Actual: \t" + "true" + "/" +
		 * driver.findElement(By.id("copyright")).isDisplayed());
		 * System.out.println("======================================="); } else
		 * { System.out.println("Test Case ID: \t\t" + text_case_id_14 +
		 * " - FAILED"); System.out.println(
		 * "Page contain PicW Expected/Actual: \t" + "false" + "/" +
		 * driver.findElement(By.id("copyright")).isDisplayed());
		 * System.out.println("======================================="); }
		 *
		 *
		 */

        // TC-001.15
        // Page contains dynamic text (Client’s current temperature, in
        // Fahrenheit) (example: "64 ℉")

        // driver.findElement(By.id("id_temperature")).click();

        // TC-001.16
        // New quote appears every new load of the page (quotes: shortest- 67
        // chars; longest - 103 chars)

        driver.findElement(By.id("id_quotes")).getText();
        String quot = driver.findElement(By.id("id_quotes")).getText();
        if (quot != null && quot.length() < 103 && quot.length() > 67) {
            System.out.println("Test Case ID: \t\t" + text_case_id_16 + " - PASSED");
            System.out.println("Quote length (shortest- 67 chars; longest - 103 chars) : " + quot.length());
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_16 + " - FAILED");
            System.out.println("Quote length (shortest- 67 chars; longest - 103 chars) : " + quot.length());
            System.out.println("=======================================");
        }

        // TC-001.17
        // "First Name" - required fields and accepts: alphabetic (upper/lower),
        // comma, hyphen, single quote, [min:3, max30]

        // TC-001.18
        // "Last Name" - required fields and accepts: alphabetic (upper/lower),
        // comma, hyphen, single quote, [min:3, max30]

        // TC-001.19
        // "Email Address" - required fields and accepts following format:
        // xx[min2]@x[min1].xx[2-6]

        // TC-001.20
        // "Phone" - required fields and accepts numeric (10 digits)including:
        // spaces, open/close parenthesis, hyphens

        // TC-001.21
        // "State" - option drop-down list

        // TC-001.22
        // "Gender" - option radio buttons

        // TC-001.23
        // "Terms" - option checkbox

        // TC-001.24
        // City and State dynamic text displays Client’s current City and State

        // TC-001.25
        // Temperature dynamic text displays Client’s current temperature
        // (refreshing every 2 minutes)

        // TC-001.26
        // OS & Browser dynamic text displays Client’s current OS & Browser +
        // version

        // TC-001.27
        // "Reset" button resets all fields and buttons (reloading the page
        // resets as well)

        // TC-001.28
        // "Submit" button redirects to Confirmation page (both titles
        // [html/application]: "Conformation")

        driver.findElement(By.id("id_fname")).sendKeys(fname);
        driver.findElement(By.id("id_lname")).sendKeys(lname);
        driver.findElement(By.id("id_email")).sendKeys(email);
        driver.findElement(By.id("id_phone")).sendKeys(phone);
        driver.findElement(By.id("id_submit_button")).click();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        String title_submit = driver.getTitle();

        if (title_submit_expected.equals(title_submit)) {
            System.out.println("Test Case ID: \t\t" + text_case_id_28 + " - PASSED");
            System.out.println("Redirect to submit page  Expected/Actual: \t" + "true" + "/"
                    + (title_submit_expected.equals(title_submit)));
            System.out.println("=======================================");
        } else {
            System.out.println("Test Case ID: \t\t" + text_case_id_28 + " - FAILED");
            System.out.println("Redirect to submit page Expected/Actual: \t" + "false" + "/"
                    + (title_submit_expected.equals(title_submit)));
            System.out.println("=======================================");

        }

        // TC-001.29
        // "Confirmation" page doesn’t contain: quotes, City/State, Temperature,
        // Icons, Today’s day, OS/Browser

        // =========================================================================================================

        driver.quit();

    }
}