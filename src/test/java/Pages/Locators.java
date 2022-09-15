package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class Locators extends Parent {
    public Locators() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(id = "CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")
    private WebElement cookies;

    @FindBy(css = ("[title='GİYİM & AKSESUAR']"))
    private WebElement categories;


    @FindBy(xpath= ("//*[contains(text(),'Dizaltı Çorap')]"))
    private WebElement corap;

    @FindBy(css = "[title='Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    private WebElement product;


    @FindBy(id = "attributes_integration_colourSİYAH")
    private WebElement checkbox;

    @FindBy(xpath = "//h1[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    private WebElement verifyText;

    @FindBy(xpath = "//button[@data-pk='18864']")
     private  WebElement addToCart;

    @FindBy(css = "[class='go-to-shop']")
    private  WebElement goToCart;

    @FindBy(css = "[href='/orders/checkout/']")
    private  WebElement validateCart;

    @FindBy(css = "[title='ÜYE OLMADAN DEVAM ET']")
    private  WebElement skip;

    @FindBy(css = "[class='button block green']")
    private WebElement skip2;

    @FindBy(name = "user_email")
    private WebElement email;

    @FindBy(css = "[class='new-address js-new-address']")
    private WebElement createAddress;

    @FindBy(name = "title")
    private WebElement title;

    @FindBy(name = "first_name")
    private WebElement first_name;

    @FindBy(name = "last_name")
    private WebElement last_name;


    @FindBy(name = "phone_number")
    private WebElement phone_number;


    @FindBy(name = "city")
    private WebElement city;

    @FindBy(xpath = "//option[contains(text(),'SAKARYA')]")
    private WebElement il;

    @FindBy(name = "township")
    private WebElement township;

    @FindBy(xpath = "//option[contains(text(),'SERDİVAN')]")
    private WebElement ilce;

    @FindBy(name = "district")
    private WebElement district;

    @FindBy(xpath = "//option[contains(text(),'KEMALPAŞA MAH')]")
    private WebElement mahalle;

    @FindBy(name = "line")
    private WebElement adress;

    @FindBy(css = "[class='button green js-set-country js-prevent-emoji']")
    private WebElement saveBtn;

    @FindBy(xpath = "//span[contains(text(),'Sendeo')]")
    private WebElement kargo;

    @FindBy(css = "[class='button block green js-proceed-button']")
    private WebElement skip3;

    @FindBy(xpath = "//div[@class='field']//following::input[8]")
    private WebElement cardName;

    @FindBy(css = "[class='js-masterpassbin-payment-card']")
    private WebElement cardNumber;

    @FindBy(xpath = "//div[@class='select select--first']//following::select[3]")
    private WebElement card_month;

    @FindBy(xpath= "//div[@class='select select--first']//following::select[3]//option[12]")
    private WebElement card_ay;

    @FindBy(xpath= "//div[@class='field field-cvc']//following::input[9]")
    private WebElement card_cvv;

    @FindBy(css = "[data-pk='2']")
    private WebElement garanti;

    @FindBy(css= "[class*='_checkbox']")
    private WebElement checkbox2;

    @FindBy(css= "[class*='gpay-payment']")
    private WebElement complete;



    WebElement myElement;

    public void clickFnc(String strElement) {
        switch (strElement) {
            case "cookies": myElement = cookies; break;
            case "corap": myElement = corap; break;
            case "product": myElement = product; break;
            case "addToCart": myElement = addToCart; break;
            case "goToCart": myElement = goToCart; break;
            case "validateCart": myElement = validateCart; break;
            case "skip": myElement = skip; break;
            case "skip2": myElement = skip2; break;
            case "createAddress": myElement = createAddress; break;
            case "city": myElement = city; break;
            case "il": myElement = il; break;
            case "township": myElement = township; break;
            case "ilce": myElement = ilce; break;
            case "district": myElement = district; break;
            case "mahalle": myElement = mahalle; break;
            case "saveBtn": myElement = saveBtn; break;
            case "kargo": myElement = kargo; break;
            case "skip3": myElement = skip3; break;
            case "card_month": myElement = card_month; break;
            case "card_ay": myElement = card_ay; break;
            case "card_cvv": myElement = card_cvv; break;
            case "checkbox2": myElement = checkbox2; break;
            case "complete": myElement = complete; break;
            case "garanti": myElement = garanti; break;


        }
        click(myElement);
    }

    public void verifyFnc(String strElement, String message) {
        switch (strElement) {
            case "verifyText": myElement = verifyText; break;

        }
        verifyText(myElement, message);
    }

    public void sendKeysFnc(String strElement, String message) {
        switch (strElement) {
            case "email": myElement = email; break;
            case "title": myElement = title; break;
            case "first_name": myElement = first_name; break;
            case "last_name": myElement = last_name; break;
            case "phone_number": myElement =  phone_number; break;
            case "adress": myElement =  adress; break;
            case "cardName": myElement =  cardName; break;
            case "cardNumber": myElement =  cardNumber; break;
            case "card_cvv": myElement = card_cvv; break;

        }
        sendKeys(myElement, message);
    }

    public void moveToFnc(String strElement) {
        switch (strElement) {
            case "categories": myElement = categories;break;
            case "checkbox2": myElement = checkbox2; break;

        }
        moveTo(myElement);

    }
    public void moveToClickFnc(String strElement) {
        switch (strElement) {
            case "categories": myElement = categories;break;
            case "corap": myElement = corap; break;
            case "checkbox2": myElement = checkbox2; break;

        }
        moveToClick(myElement);
    }



}
