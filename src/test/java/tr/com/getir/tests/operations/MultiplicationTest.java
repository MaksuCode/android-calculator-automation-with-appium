package tr.com.getir.tests.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import tr.com.getir.BaseTest;

public class MultiplicationTest extends BaseTest {


    @ParameterizedTest
    @MethodSource("provideTwoNumbers")
    public void mul_two_numbers(int[] values){
        int result = calculator.mul(values);
        Assertions.assertEquals(multiplicationOfNumbers(values),result);
    }

    @ParameterizedTest
    @MethodSource("provideNumberArrayForTest")
    public void mul_more_than_two_numbers(int[] values){
        int result = calculator.mul(values);
        Assertions.assertEquals(multiplicationOfNumbers(values),result);
    }

    @ParameterizedTest
    @MethodSource("provideTwoDigitNumbers")
    public void mul_two_digit_numbers(int[] numbers){
        int result = calculator.mul(numbers);
        Assertions.assertEquals(multiplicationOfNumbers(numbers),result);
    }

    private static int multiplicationOfNumbers(int[] numbers){
        int result = 1 ;
        for (int number : numbers){
            result *= number ;
        }
        return result ;
    }



}
