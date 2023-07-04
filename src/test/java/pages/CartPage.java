package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CartPage {

    SelenideElement addToCartButton = $(".fa-shopping-cart",1),
    openCart = $(byText("View Cart")),
    checkCart = $(".cart_description"),
    deleteItem = $(".cart_quantity_delete"),
    checkDeletion = $("#empty_cart"),
    viewProductButton = $("a[href='/product_details/5']"),
    quantity = $("#quantity"),
    cartButton = $(".cart"),
    checkQuantity = $(".disabled");

    public CartPage openPage() {
        open("/");

        return this;
    }
    public CartPage addToCart(){
        addToCartButton.hover().click();

        return this;
    }
    public CartPage openCart(){
        openCart.click();

        return this;
    }
    public CartPage checkCart(String value){
        checkCart.shouldHave(Condition.text(value));

        return this;
    }
    public CartPage deleteFromCart(){
        deleteItem.click();

        return this;
    }
    public CartPage checkCartIsEmpty(String value){
        checkDeletion.shouldHave(Condition.text(value));

        return this;
    }
    public CartPage openItem(){
        viewProductButton.click();

        return this;
    }
    public CartPage changeQuantity(int value){
        quantity.setValue(Integer.toString(value));

        return this;
    }
    public CartPage addItemToCart(){
        cartButton.click();

        return this;
    }
    public CartPage viewCart(){
        openCart.click();

        return this;
    }
    public CartPage checkQuantity(int value){
       checkQuantity.shouldHave(Condition.text(Integer.toString(value)));

        return this;
    }
}
