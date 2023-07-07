package tests.web;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import tests.TestBase;
import static io.qameta.allure.Allure.step;

@Owner("Алена Порохова")
@Tag("web")
public class CartTests extends TestBase {
    CartPage cartPage = new CartPage();
    @Test
    @DisplayName("Добавление товара в корзину и его удаление")
    void addDeleteCartTest() {
        step("Открыть главную страницу", () -> {
            cartPage.openPage();
        });
        step("Добавить товар в корзину", () -> {
            cartPage.addToCart();
        });
        step("Перейти в корзину", () -> {
            cartPage.openCart();
        });
        step("Проверить наличие товара в корзине", () -> {
            cartPage.checkCart("Blue Top");
        });
        step("Удалить товар из корзины", () -> {
            cartPage.deleteFromCart();
        });
        step("Проверить, что корзина пуста", () -> {
            cartPage.checkCartIsEmpty("Cart is empty!");
        });

    }
    @Test
    @DisplayName("Проверка количества добавленных в корзину товаров")
    void cartQuantityTest() {
        step("Открыть главную страницу", () -> {
            cartPage.openPage();
        });
        step("Открыть информацию о товаре", () -> {
            cartPage.openItem();
        });
        step("Изменить количество товара", () -> {
            cartPage.changeQuantity(5);
        });
        step("Добавить товар в корзину", () -> {
            cartPage.addItemToCart();
        });
        step("Перейти в корзину", () -> {
            cartPage.viewCart();
        });
        step("Проверить количество товаров в корзине", () -> {
            cartPage.checkQuantity(5);
        });

    }
}
