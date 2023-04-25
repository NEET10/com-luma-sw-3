package testsuite;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class WomenTest extends Utility {
    String baseUrl = "https://magento.softwaretestingboard.com/";@Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void verifyTheSortByProductNameFilter(){
        //* Mouse Hover on Women Menu
       // mouseHoverToElement(By.xpath("//span[contains(text(),'Women')]"));
        //* Mouse Hover on Tops
       mouseHoverToElementToAnotherElement(By.xpath("//span[contains(text(),'Women')]"),By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));

     //  mouseHoverToElement(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));
        //* Click on Jackets
        mouseHoverToElementAndClick(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]") );
        //* Select Sort By filter “Product Name”
        selectByVisibleTextFromDropDown(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]"),"Product Name");
        //* Verify the products name display in alphabetical order

    }
    @Test
    public void  verifyTheSortByPriceFilter(){
      //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        mouseHoverToElementToAnotherElement(By.xpath("//span[contains(text(),'Women')]"),By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/span[2]"));
        //* Click on Jackets
        mouseHoverToElementAndClick(By.xpath("//body/div[1]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]") );
        //* Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]"),"Price");
        //* Verify the products price display in Low to High

    }
    @After
public void tearDown(){
       closeBrowser();
}

}