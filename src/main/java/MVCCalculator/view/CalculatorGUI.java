package MVCCalculator.view;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class CalculatorGUI implements CalculatorView {
    private TextField firstNumber = new TextField();
    private TextField secondNumber = new TextField();
    private Label additionLabel = new Label("+");
    private Button myButton = new Button("Calculate");
    private TextField solution = new TextField();
    private VBox container = new VBox();


    public Scene build() {
        container.getChildren().addAll(firstNumber, secondNumber, additionLabel, myButton, solution);
        return new Scene(container);
    }

    public int getFirstNumber() {
        return Integer.parseInt(this.firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(this.secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(this.solution.getText());
    }

    public void setSolution(int solution) {
        this.solution.setText(Integer.toString(solution));
    }

    public void addCalculationListener(EventHandler listener) {
        this.myButton.setOnAction(listener);
    }

    public void displayErrorMessage(String error) {
        this.container.getChildren().add(new Text(error));
    }
}
