package trab.poo1_trab_banco;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);

        // teste
        double minshow = stage.getMinHeight();
        System.out.println("minheight: " + minshow);

        stage.setMinHeight(600.0); // seta a janela em 800x600 no minimo (nao permite resize)
        stage.setMinWidth(800.0);
        // teste

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}