module calculator.com.example.javafx_calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens calculator.com.example.javafx_calculator to javafx.fxml;
    exports calculator.com.example.javafx_calculator;
}