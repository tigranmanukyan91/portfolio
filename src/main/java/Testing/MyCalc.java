package Testing;

public class MyCalc {
    public static double divide(int num1, int num2){
        if (num2 == 0){
            throw new ArithmeticException("Can not divide by zero");
        }
        return (double) num1 / num2;
    }
}
