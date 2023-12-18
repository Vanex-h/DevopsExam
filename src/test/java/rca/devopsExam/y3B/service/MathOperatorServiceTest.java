package rca.devopsExam.y3B.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import rca.devopsExam.y3B.calculator.exceptions.InvalidOperationException;
import rca.devopsExam.y3B.calculator.serviceImpl.MathOperatorImpl;

import static org.mockito.ArgumentMatchers.any;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathOperatorServiceTest {

    @Mock
    private MathOperatorImpl mathOperatorService;

    @Test
    public void should_create_math_operation_addition_success() throws InvalidOperationException {
        double operator1 = 17;
        double operator2 = 8;
        String operation = "+";
        double expectedResult = 25.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }

    @Test
    public void should_create_math_operation_subtraction_success() throws InvalidOperationException {
        double operator1 = 17;
        double operator2 = 8;
        String operation = "-";
        double expectedResult = 9.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    @Test
    public void should_create_math_operation_multiplication_success() throws InvalidOperationException {
        double operator1 = 17;
        double operator2 = 8;
        String operation = "*";
        double expectedResult = 136.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
    @Test
    public void should_create_math_operation_division_success() throws InvalidOperationException {
        double operator1 = 18;
        double operator2 = 2;
        String operation = "/";
        double expectedResult = 9.0;

        when(mathOperatorService.doMath(operator1, operator2, operation)).thenReturn(expectedResult);

        double actualMathOperator = mathOperatorService.doMath(operator1, operator2, operation);

        assertThat(actualMathOperator).isEqualTo(expectedResult);
        verify(mathOperatorService).doMath(operator1, operator2, operation);
    }
}
