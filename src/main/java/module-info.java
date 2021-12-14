module com.example.mvcexample {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.mvcexample to javafx.fxml;
    exports com.example.mvcexample;
    exports MVCCalculator;
    opens MVCCalculator to javafx.fxml;
}