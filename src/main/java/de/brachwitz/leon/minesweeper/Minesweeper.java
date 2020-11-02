package de.brachwitz.leon.minesweeper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Minesweeper extends Application
{
    private Stage buehne;
    private static final int BREITE = 500;
    private static final int HOEHE = 500;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        this.buehne = primaryStage;
        BorderPane root = FXMLLoader.load(getClass().getResource("/minesweeper/minesweeper.fxml"));
        buehne.setScene(new Scene(root, BREITE,HOEHE));
        buehne.show();
    }
}
