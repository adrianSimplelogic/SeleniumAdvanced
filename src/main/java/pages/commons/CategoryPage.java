package pages.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

import java.util.List;

public class CategoryPage extends BasePage {
    public CategoryPage(WebDriver driver) {
        super(driver);
    }

//    @FindBy(css = "#category-3")
//    private WebElement clothesCategoryBtn;
//
//    @FindBy(css = "#category-6")
//    private WebElement accessoriesCategoryBtn;
//
//    @FindBy(css = "#category-9")
//    private WebElement artCategoryBtn;

    @FindBy(css = "#top-menu>li")
    private List<WebElement> categoryLinks;

    @FindBy(css = ".h1")
    private WebElement categoryTitle;

    @FindBy(css = ".total-products p")
    private WebElement totalProducts;

    @FindBy(css = ".product")
    private  List<WebElement> products;

    public List<WebElement> getCategoryLinks() {
        return categoryLinks;
    }

    public String getCategoryTitle() {
        waitToBeVisible(categoryTitle);
        return categoryTitle.getText();
    }

    public int getTotalProducts() {
        return Integer.parseInt(totalProducts.getText().replace("There are ","").replace(" products.",""));
    }

    public List<WebElement> getProducts() {
        return products;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////

    @FindBy(css = "#category-3")
    private WebElement clothesCategoryBtn;

    @FindBy(css = "#top_sub_menu_51213 li")
    private List<WebElement> submenuCloths;

    public void moveToClothesCategoryBtn() {
        actions.moveToElement(clothesCategoryBtn).perform();
    }

    public WebElement getClothesCategoryBtn() {
        return clothesCategoryBtn;
    }

    public List<WebElement> getSubmenuCloths() {
        return submenuCloths;
    }




}
