package rca.devopsExam.y3B.calculator.serviceImpl;


import org.springframework.stereotype.Service;
import rca.devopsExam.y3B.calculator.exceptions.InvalidOperationException;
import rca.devopsExam.y3B.calculator.services.IMathOperator;

@Service
public class MathOperatorImpl implements IMathOperator {

    @Override
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        if ("/".equals(operation) && operand2 == (double) 0) {
            throw new InvalidOperationException("Cannot divide by 0");
        }

        switch (operation) {
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            default:
                throw new RuntimeException("Unknown Operation");
        }
    }
}
