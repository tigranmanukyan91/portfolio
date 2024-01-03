import Testing.Junity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunityTest {
    private final double EPS = 1e-9;
    private static Junity junity;

    //@BeforeClass is initialized once for the class, @Begore is initialized each time a test method is triggered
    @BeforeClass
    public static void createNewVector(){
        junity = new Junity();
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        //1e-9 = 0,0000000001
        Assert.assertEquals(0,junity.length(),EPS);
    }

    @Test
    public void newVectorShouldHaveZeroXAndZeroY(){
        Assert.assertEquals(0, junity.getX(),EPS);
        Assert.assertEquals(0,junity.getY(),EPS);
    }



}
