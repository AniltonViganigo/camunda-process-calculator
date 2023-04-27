package com.curso.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class SubtractDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Long firstNumber = (Long) execution.getVariable("first_number");
        Long secondNumber = (Long) execution.getVariable("second_number");
        execution.setVariable("result", firstNumber - secondNumber);
    }
}
