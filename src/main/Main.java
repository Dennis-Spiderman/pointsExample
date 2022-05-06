package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class Main extends Application{

	public static void main(String[]args) {
		launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("Main"));
	}
}
