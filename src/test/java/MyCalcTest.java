import Testing.MyCalc;
import org.junit.Test;

public class MyCalcTest {
    @Test(expected = ArithmeticException.class)
    public void zeroDenominatorShouldThrowException(){
        MyCalc.divide(1,0);
    }
}
