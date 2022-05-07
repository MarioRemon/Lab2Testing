import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class FunTest extends TestCase {
    int testcases[] = {-100,-4,-1,0,1,2,3,4,50,70,100,103};
    @Test
    public void testChecker()
    {
        boolean result1 = true;
        Fun f = new Fun();
        for(int i = 0 ; i < testcases.length; i++) {

            if (f.checkEvenOdd(testcases[i]) == true && testcases[i] < 0 && testcases[i] % 2 != 0) {
                result1 = false;
                break;
            }
        }
        assertTrue(result1);
    }
    int [][]arr = {{1, 2,3},{-1,0,5},{-100,-20,40},{1,30,50}};

    public void testMaxMin()
    {
        boolean testaya = true;
        Fun f1 = new Fun();
        for(int i = 0; i < 4; i++)
        {
            int [] arr2 = new int [2];
            arr2 = f1.getMax(arr[i],3);
            for(int j = 0; j < 3; j++)
            {
                if(arr2[0] < arr[i][j])
                {
                    testaya = false;
                    break;
                }
                if(arr2[1] > arr[i][j])
                {
                    testaya = false;
                    break;
                }
                if(testaya == false)
                {
                    break;
                }
            }
            assertTrue(testaya);
        }
    }
}