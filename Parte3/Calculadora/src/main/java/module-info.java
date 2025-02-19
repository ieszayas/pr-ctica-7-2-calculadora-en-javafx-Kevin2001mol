module com.example.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.calculadora to javafx.fxml;
    exports com.example.calculadora;
}