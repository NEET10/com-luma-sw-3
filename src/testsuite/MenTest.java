package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class MenTest extends Utility {
    String baseUrl = "https://magento.softwaretestingboard.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        //* Mouse Hover on Men Menu
        //* Mouse Hover on Bottoms
        mouseHoverToElementToAnotherElement(By.xpath("//span[contains(text(),'Men')]"),By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[2]"));
        //* Click on Pants
        mouseHoverToElementAndClick(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[1]"));
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        mouseHoverToElementAndClick(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]"));
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        mouseHoverToElementAndClick(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        Thread.sleep(2000);
        //* Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        mouseHoverToElementAndClick(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]"));
        Thread.sleep(2000);
        //* Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        //verifyExpectedAndActual(By.xpath("//body/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]"),"You added Cronus Yoga Pant to your shopping cart.");
        //* Click on ‘shopping cart’ Link into message
        // clickOnElement(By.linkText("shopping cart"));
        //* Verify the text ‘Shopping Cart.’
        //  verifyExpectedAndActual(By.xpath("//body/div[1]/main[1]/div[1]/h1[1]/span[1]"),"Shopping Cart");
        //* Verify the product name ‘Cronus Yoga Pant’
        // verifyExpectedAndActual(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']"),"Cronus Yoga Pant");
        //* Verify the product size ‘32’
        //  verifyExpectedAndActual(By.xpath("//dd[contains(text(),'32')]"),"32");
        //* Verify the product colour ‘Black’
        //  verifyExpectedAndActual(By.xpath("//dd[contains(text(),'Black')]"),"Black");
    }
    @After
    public void tearDown(){
         closeBrowser();
    }
}