package MVCCalculator.view;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;

import java.util.Scanner;

public class CalculatorCLI implements CalculatorView {
    private Scanner myScanner = new Scanner(System.in);
    private int firstNumber;
    private int secondNumber;
    private int solution;
    private EventHandler myListener;

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter Number 1:");
            this.firstNumber = myScanner.nextInt();
            System.out.println("Enter Number 2:");
            this.secondNumber = myScanner.nextInt();
            // reached the point where we do some logic.
            this.myListener.handle(new Event(new EventType<>("Calculate")));
            System.out.printf("Solution is: %s%n", this.solution);
        }
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }

    @Override
    public int getSecondNumber() {
        return secondNumber;
    }

    @Override
    public int getCalcSolution() {
        return solution;
    }

    @Override
    public void setSolution(int solution) {
        this.solution = solution;
    }

    @Override
    public void addCalculationListener(EventHandler listener) {
        this.myListener = listener;
    }

    @Override
    public void displayErrorMessage(String error) {
        System.out.println(error);
    }
}
