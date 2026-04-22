package Task_5;

public class Product {
    private String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(String name, double price){
        setName(name);
        setPrice(price);
    }

    public void setName(String name){
        if (name.length() < 20){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Помилка! Ім'я не може бути більше 20 символів!");
        }
    }

    public void setPrice(double price){
        this.price = price;
    }


}
