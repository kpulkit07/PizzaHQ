package com.AccessHQ;

import com.Model.AllPizzas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assessment {
    private WebDriver  driver;
    @BeforeEach
    public void openBrowser(){
        getWebDriver();
        driver.get("https://d3ovkzfkbrwp1z.cloudfront.net/#/");

    }

//    @Test
//    public void getSignUpForm() {
//        driver.findElement(By.cssSelector("a[aria-label ='login or signup']")).click();
//       // By waitForTheBox = (By.className(""));
//         new WebDriverWait(driver, Duration.ofSeconds(3)).
//                 until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-dialog--active")));
//        for (WebElement clickSignup: driver.findElements(By.cssSelector(".v-dialog--active > p > a"))) {
//            if (clickSignup.getText().equalsIgnoreCase("sign up")) {
//                clickSignup.click();
//            }
//            //throw new NotFoundException("could not find" + state);
//        }
//        //driver.findElement(By.cssSelector(".v-dialog--active > p > a")).click();
//    }

//    @Test
//    public void fillUpTheForm(){
//        driver.findElement()
//    }



//        driver.findElement(By.cssSelector("a[aria-label ='login or signup']")).click();
//
//        //click on "Not a member? Sign up"
//        By GetSignUp = (By.cssSelector(".v-card__text > p > a"));
//        // driver.findElement(By.cssSelector(".v-card__text > p > a")).getText().equalsIgnoreCase("sign up");
//        new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.
//                visibilityOfElementLocated(GetSignUp));
//        Assertions.assertEquals("Signup", signin);
//    }
//    //        for (WebElement getSignClicked: driver.findElements(By.cssSelector(".v-card__text > p > a"))){
////            if (getSignClicked.getText().equalsIgnoreCase("Sign Up")) {
////                getSignClicked.click();
////            }
////            else {
////                System.out.println("no sign-up option found");
////            }
////        }
////    }







    @Test
    public void clickMenu(){
        driver.findElement(By.cssSelector("[aria-label = menu]")).click();
        AllPizzas allpizzas = new AllPizzas();
        AllPizzas.getPizza(planet -> planet.getName().equals("Pepperoni"));
        }


//        new WebDriverWait(driver, Duration.ofSeconds(2)).
//                until(ExpectedConditions.urlToBe("https://d3ovkzfkbrwp1z.cloudfront.net/#/menu"));
//        String getmenu = driver.findElement(By.tagName("[role=tab]")).getText();
//        if(getmenu.equalsIgnoreCase("Sides")){
//            getmenu.click();
//        }
//        for (WebElement submenu: driver.findElements(By.className("v-slide-group__content"))) {
//                if(submenu.findElements(By.tagName("role=tab")).equals("Sides")){
//                    submenu.click();
//                }
//        }

    public void getWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(options);
    }
}
