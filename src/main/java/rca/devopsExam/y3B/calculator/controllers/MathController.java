package rca.devopsExam.y3B.calculator.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.devopsExam.y3B.calculator.dtos.DoMathRequestDto;
import rca.devopsExam.y3B.calculator.exceptions.InvalidOperationException;
import rca.devopsExam.y3B.calculator.payloads.ApiResponse;
import rca.devopsExam.y3B.calculator.serviceImpl.MathOperatorImpl;

@RestController
@RequestMapping("/api/v1/do_math")
public class MathController {
    private final MathOperatorImpl mathOperatorImpl;

    public MathController(MathOperatorImpl mathOperatorImpl) {
        this.mathOperatorImpl = mathOperatorImpl;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> create(@RequestBody DoMathRequestDto dto) throws InvalidOperationException {
        return ResponseEntity.ok(ApiResponse.success(mathOperatorImpl.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation())));
    }
}
