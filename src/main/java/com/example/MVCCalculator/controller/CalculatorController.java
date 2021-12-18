package com.example.MVCCalculator.controller;

import com.example.MVCCalculator.view.CalculatorView;
import com.example.MVCCalculator.model.CalculatorModel;
import javafx.event.Event;
import javafx.event.EventHandler;

public class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
        this.view.addCalculationListener(new CalculatorHandler());
    }

    class CalculatorHandler implements EventHandler<Event> {

        @Override
        public void handle(Event event) {
            int num1, num2 = 0;

            try {
                num1 = view.getFirstNumber();
                num2 = view.getSecondNumber();

                model.addTwoNumbers(num1, num2);
                view.setSolution(model.getCalculationValue());
            } catch (Exception e) {
                view.displayErrorMessage("Enter two valid numbers");
            }
        }
    }
}
