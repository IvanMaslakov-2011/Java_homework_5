package task_1;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator simpleCalc = new SimpleCalculator();
        AdvancedCalculator advancedCalc = new AdvancedCalculator();

        System.out.println("Результат додавання: " + simpleCalc.add(44, 55));
        System.out.println("Результат віднімання: " + simpleCalc.subtract(77, -78));
        System.out.println("Результат множення: " + simpleCalc.multiply(45, 10));
        try {
        System.out.println("Результат ділення: " + simpleCalc.divide(12, 0));
        } catch (ArithmeticException e) {
        System.out.println("Помилка! Ділення на нуль!)");
    }


        System.out.println("Результат піднесення до степеня: " + advancedCalc.power(5, 3));
        try {
            System.out.println("Факторіал числа: " + advancedCalc.factorial(20));
        } catch (ArithmeticException e){
            System.out.println("Помилка! " + e.getMessage());
        }

        System.out.println("Число просте? " + advancedCalc.isEven(17));
    }
}
