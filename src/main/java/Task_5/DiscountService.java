package Task_5;

public class DiscountService {
    public double applyPercentageDiscount(double price, int percent){
        if (price <= 0){
            throw new IllegalArgumentException("Помилка! Ціна має бути більше нуля!");
        }

        if (percent < 0 || percent > 100){
            throw new IllegalArgumentException("Помилка! Знижка має бути в межах від 0 до 100");
        }

        return price - (price * percent / 100);
    }

    public double applyFixedDiscount(double price, double discountAmount){
        if (price < discountAmount){
            throw new IllegalArgumentException("Помилка! Знижка більша за ціну!");
        }

        return price - discountAmount;
    }

    public boolean isEligibleForDiscount(double price){
        return price > 100;
    }
}
