package MVCCalculator.view;

import javafx.event.EventHandler;

public interface CalculatorView {
    int getFirstNumber();

    int getSecondNumber();

    int getCalcSolution();

    void setSolution(int solution);

    void addCalculationListener(EventHandler listener);

    void displayErrorMessage(String error);
}
