package MVCCalculator.model;

public class CalculatorModel {
    private int calculationValue;

    public void addTwoNumbers(int firstNumber, int secondNumber) {
        this.calculationValue = firstNumber + secondNumber;
    }

    public int getCalculationValue() {
        return this.calculationValue;
    }
}
