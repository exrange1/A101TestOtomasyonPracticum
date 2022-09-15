package StepDefinitions;

import Pages.Locators;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Step1 {
    Locators lc = new Locators();

    @When("Navigate to Site")
    public void navigateToSite() {
        GWD.getDriver().get("https://www.a101.com.tr/");
        GWD.getDriver().manage().window().maximize();


    }

    @And("Find product and verify")
    public void findProductAndAddToCart() {
        lc.clickFnc("cookies");
        GWD.getDriver().navigate().refresh();//--> navbardaki elemetlere tıklamadığı için refresh kullandım sizde refresh
                                               //  sonrası cookie ekranı gelirse aşağıdaki kodu yorumdan kaldırınız veya bu kodu siliniz
       // lc.clickFnc("cookies");
        lc.moveToFnc("categories");
        lc.moveToClickFnc("corap");
        lc.clickFnc("product");
        lc.verifyFnc("verifyText","siyah");

    }


    @And("go to cart and proceed to checkout")
    public void goToCartAndProceedToCheckout() {
        lc.clickFnc("addToCart");
        lc.clickFnc("goToCart");
        lc.clickFnc("validateCart");
        lc.clickFnc("skip");

    }

    @Then("fill the informations and go to payment")
    public void fillTheInformationsAndGoToPayment() {
        String random= RandomStringUtils.randomAlphabetic(30);
        lc.sendKeysFnc("email","ahmet44@gmail.com");
        lc.clickFnc("skip2");
        lc.clickFnc("createAddress");
        lc.sendKeysFnc("title","ev");
        lc.sendKeysFnc("first_name","ibrahim");
        lc.sendKeysFnc("last_name","evsiz");
        lc.sendKeysFnc("phone_number","533 353 5101");
        lc.clickFnc("city");
        lc.clickFnc("il");
        lc.clickFnc("township");
        lc.clickFnc("ilce");
        lc.clickFnc("district");
        lc.clickFnc("mahalle");
        lc.sendKeysFnc("adress",random);
        lc.clickFnc("saveBtn");
        lc.clickFnc("kargo");
        lc.clickFnc("skip3");

    }

    @Then("complete the order")
    public void completeTheOrder() {
        /*lc.sendKeysFnc("cardName","ibrahim evsiz");
        lc.sendKeysFnc("cardNumber","4532525863880154");
        lc.clickFnc("card_ay");
        lc.sendKeysFnc("card_cvv","279");
        ilk ödeme kısmındaki checkbox'ın locatörüne tıklanmadığı için
        2. ödeme yönetemini denedim

        */
        lc.clickFnc("garanti");
        GWD.Bekle(2);
        lc.clickFnc("checkbox2");
        GWD.Bekle(2);
        lc.clickFnc("complete");

    }


}
