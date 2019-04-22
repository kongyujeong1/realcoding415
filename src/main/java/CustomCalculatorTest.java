import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    @Test
    public void 더하기테스트(){
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.add(3, 4);
        assertTrue(result == 7);
    }

    @Test
    public void 빼기테스트(){
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10, 2);
        assertTrue(result == 8);
    }

    @Test
    public void 곱하기테스트(){
        CustomCalculator customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(3, 4);
        assertTrue(result == 12);
    }
}