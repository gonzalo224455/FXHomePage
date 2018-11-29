package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			  	FXMLLoader loader =new FXMLLoader(getClass().getResource("interfaz.fxml"));
		        AnchorPane pane=loader.load();
		        Scene scene=new Scene(pane);
		        scene.getStylesheets().addAll(getClass().getResource("application.css").toExternalForm());
		        primaryStage.setTitle("Home page");
		        primaryStage.setScene(scene);
		        primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
