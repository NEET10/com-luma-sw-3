package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class GearTest extends Utility {
    String baseUrl = "https://magento.softwaretestingboard.com/";
    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //* Mouse Hover on Gear Menu
        //* Click on Bags
        Thread.sleep(2000);
       mouseHoverToElementToAnotherElementAndClick(By.xpath("//span[contains(text(),'Gear')]"),By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]/span[1]"));
        //* Click on Product Name ‘Overnight Duffle’
        clickOnElement(By.xpath("//a[contains(text(),'Overnight Duffle')]"));
        //* Verify the text ‘Overnight Duffle’
        verifyExpectedAndActual(By.xpath("//span[contains(text(),'Overnight Duffle')]"),"Overnight Duffle");
        //* Change Qty 3
        clearTextAndSendKey(By.id("qty"),"3");
        //* Click on ‘Add to Cart’ Button.
        clickOnElement(By.xpath("//span[contains(text(),'Add to Cart')]"));
        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        verifyExpectedAndActual(By.xpath("//body/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]"),"You added Overnight Duffle to your shopping cart.");
        //* Click on ‘shopping cart’ Link into message
        clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        //* Verify the product name ‘Overnight Duffle’
        verifyExpectedAndActual(By.linkText("Overnight Duffle"),"Overnight Duffle");
        //Thread.sleep(2000);
        //* Verify the Qty is ‘3’
     //  verifyExpectedAndActual(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]"),"3");
        //* Verify the product price ‘$135.00’
        verifyExpectedAndActual(By.xpath("//tbody/tr[1]/td[4]/span[1]/span[1]/span[1]"),"$135.00");
        //* Change Qty to ‘5’
        clearTextAndSendKey(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/label[1]/input[1]"),"5");
        //* Click on ‘Update Shopping Cart’ button
       clickOnElement(By.xpath("//span[contains(text(),'Update Shopping Cart')]"));
        //* Verify the product price ‘$225.00’
        verifyExpectedAndActual(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[3]/div[1]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/span[1]/span[1]/span[1]"),"$225.00");
    }
    @After
    public void tearDown(){
        // closeBrowser();
    }
}
