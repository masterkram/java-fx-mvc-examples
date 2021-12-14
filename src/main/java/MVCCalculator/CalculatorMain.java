package MVCCalculator;

import MVCCalculator.controller.CalculatorController;
import MVCCalculator.model.CalculatorModel;
import MVCCalculator.view.CalculatorCLI;
import MVCCalculator.view.CalculatorGUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class CalculatorMain {
    public static void main(String[] args) {
        (new CLILauncher()).run();
    }
}

class CLILauncher {
    public void run() {
        CalculatorModel myModel = new CalculatorModel();
        CalculatorCLI myView = new CalculatorCLI();
        CalculatorController myController = new CalculatorController(myView, myModel);
        myView.run();
    }
}

class GUILauncher extends Application {
    public void run(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        CalculatorModel myModel = new CalculatorModel();
        CalculatorGUI myView = new CalculatorGUI();
        CalculatorController myController = new CalculatorController(myView, myModel);

        primaryStage.setTitle("Calculator");
        primaryStage.setHeight(720);
        primaryStage.setWidth(1000);
        primaryStage.setScene(myView.build());
        primaryStage.show();
    }
}
