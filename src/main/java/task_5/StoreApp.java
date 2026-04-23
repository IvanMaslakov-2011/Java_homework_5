package task_5;

public class StoreApp {
    public static void main(String[] args) {

        // Створюємо продукти - клас Product
        Product product1 = new Product("Tires", 1000);
        Product product2 = new Product("Laptop", 700);
        Product product3 = new Product("Watch", 400);
        Product product4 = new Product("Car", 20000);

        // Створюємо кошик - клас ShoppingCart
        ShoppingCart shoppingCart = new ShoppingCart();

        // Створюємо discountService - клас DiscountService
        DiscountService discountService = new DiscountService();

        // Додаємо продукти до кошика - метод addProduct у класі ShoppingCart
        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);
        shoppingCart.addProduct(product3);
        shoppingCart.addProduct(product4);

        // Викликаємо метод getTotalPrice - клас ShoppingCart
        System.out.println("Загальна вартість: " + shoppingCart.getTotalPrice());

        // Викликаємо метод applyDiscountToTotal - клас ShoppingCart
        shoppingCart.applyDiscountToTotal(discountService, 10);
    }
}
