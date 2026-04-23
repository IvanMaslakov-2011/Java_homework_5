package task_5;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> items = new ArrayList<>();

    public void addProduct(Product p){
        if (p != null){
            items.add(p);
        } else {
            throw new IllegalArgumentException("Помилка! Продукт не може бути null!");
        }
    }

    public double getTotalPrice(){
        double total = 0;

        for (Product product : items){
            total += product.getPrice();
        }

        return total;
    }

    public void applyDiscountToTotal(DiscountService ds, int percent){
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Помилка! Знижка має бути у межах від 0 до 100");
        }

        double total = getTotalPrice();

        double finalPrice = ds.applyPercentageDiscount(total, percent);
    }
}
