package com.example.MVCCalculator.view;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import java.util.Scanner;

public class CalculatorCLI implements CalculatorView {
    private final Scanner myScanner = new Scanner(System.in);
    private int firstNumber;
    private int secondNumber;
    private int solution;
    private Event event;
    private EventHandler myListener;

    public void run() {
        boolean exit = false;
        this.event = new Event(new EventType<>("Calculate"));

        while (!exit) {
            boolean sn = false;
            boolean fn = false;

            while(!fn) {
                System.out.println("enter first number: ");
                try {
                    this.firstNumber = Integer.parseInt(myScanner.nextLine());
                    fn = true;
                } catch (Exception ignore) {
                    System.out.println("-> invalid input");
                }
            }

            while(!sn) {
                System.out.println("enter second number: ");
                try {
                    this.secondNumber = Integer.parseInt(myScanner.nextLine());
                    sn = true;
                } catch (Exception ignore) {
                    System.out.println("-> invalid input");
                }
            }

            // reached the point where we do some logic.
            this.myListener.handle(this.event);
            System.out.printf("\nSolution is: %s%n\n", this.solution);
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
