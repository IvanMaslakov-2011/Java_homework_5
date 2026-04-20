public class AdvancedCalculator {

    public int power(int a, int b){
        int res = 1;

        for (int i = 0; i < b; i++){
           res *= a;
        }
        return res;
    }

    public long factorial(int n){
        boolean correctNum = n >= 0;

        if (correctNum) {
            long res = 1;

            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
        } else {
            throw new ArithmeticException("Факторіал не може бути знайденним із нуля чи від'ємного числа!");
        }
    }

    public boolean isEven(int n){
        return n % 2 == 0;
    }


}
