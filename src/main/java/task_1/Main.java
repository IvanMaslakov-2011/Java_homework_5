package task_1;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator simpleCalc = new SimpleCalculator();
        AdvancedCalculator advancedCalc = new AdvancedCalculator();

        System.out.println("Результат додавання: " + simpleCalc.add(44, 55)); //  Метод add з SimpleCalc
        System.out.println("Результат віднімання: " + simpleCalc.subtract(77, -78)); // Метод substract з SimpleCalc
        System.out.println("Результат множення: " + simpleCalc.multiply(45, 10)); // Метод multiply з SimpleCalc
        try {
        System.out.println("Результат ділення: " + simpleCalc.divide(12, 0)); // метод divide з SimpleCalc
        } catch (ArithmeticException e) {
        System.out.println("Помилка! Ділення на нуль!)");
    }


        System.out.println("Результат піднесення до степеня: " + advancedCalc.power(5, 3)); // Метод power з AdvancedCalc
        try {
            System.out.println("Факторіал числа: " + advancedCalc.factorial(20)); // Метод factorial з AdvancedCalc
        } catch (ArithmeticException e){
            System.out.println("Помилка! " + e.getMessage());
        }

        System.out.println("Число просте? " + advancedCalc.isEven(17)); // Метод isEven з AdvancedCalc
    }
}
