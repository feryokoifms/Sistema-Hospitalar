package sistemahospitalar1.0;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SistemaHospitalar1.0 Extends Application {
	
	@override
	public void start(Stage stage) throw Exception{
		parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
	
		Scene scene = new Scene (root);
		
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
