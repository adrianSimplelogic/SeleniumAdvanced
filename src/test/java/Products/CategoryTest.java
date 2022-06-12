package Products;

import base.Pages;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CategoryTest extends Pages {

    @Test
    public void shoudlCheckAllCategorys() {

        for (int i = 0; i < categoryPage.getCategoryLinks().size(); i++) {
            WebElement categoryLink = categoryPage.getCategoryLinks().get(i);
            String targetTitle = categoryLink.getText();
            categoryLink.click();
            String title = categoryPage.getCategoryTitle();
            int qty = categoryPage.getTotalProducts();
            Assertions.assertThat(targetTitle).isEqualTo(title);
            Assertions.assertThat(qty).isEqualTo(categoryPage.getProducts().size());
        }
    }

    @Test
    public void shouldCheckSubcategoriesClothes(){
        categoryPage.moveToClothesCategoryBtn();
        for (WebElement el:categoryPage.getSubmenuCloths()){
            categoryPage.moveToClothesCategoryBtn();
            String targetTitle = el.getText();
            el.click();
            String title = categoryPage.getCategoryTitle();
            int qty = categoryPage.getTotalProducts();
            Assertions.assertThat(targetTitle).isEqualTo(title);
            Assertions.assertThat(qty).isEqualTo(categoryPage.getProducts().size());
        }

    }

}
