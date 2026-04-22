package task_1;

public class SimpleCalculator {

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        if (b == 0){
            System.out.println("Помилка! Ділення на нуль!");
            return 0;
        } else {
            return a / b;
        }
    }


}
