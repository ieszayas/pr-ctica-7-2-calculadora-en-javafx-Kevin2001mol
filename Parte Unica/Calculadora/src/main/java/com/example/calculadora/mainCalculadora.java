package com.example.calculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import java.io.IOException;


public class mainCalculadora extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(mainCalculadora.class.getResource("calculadora.fxml"));
        Scene scene = new Scene(fxmlLoader.load());


        // Cargar el archivo CSS
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        // Agregar el icono de la aplicación
        Image icono = new Image(getClass().getResourceAsStream("/com/example/calculadora/IconoCalculadoraP.png"));
        stage.getIcons().add(icono); //.webp no lo coge bien.


        stage.setScene(scene);
        stage.setTitle("Mi Calculadora");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
