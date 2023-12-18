package rca.devopsExam.y3B.calculator.services;

import rca.devopsExam.y3B.calculator.exceptions.InvalidOperationException;

public interface IMathOperator {

    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}