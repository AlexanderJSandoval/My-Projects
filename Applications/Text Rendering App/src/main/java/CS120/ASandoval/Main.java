package CS120.ASandoval;

//Please don't think I can't spell "pane", spelling it "pain" is just my way of sneaking some creativity into here
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class Main extends Application {

	protected MainPain mainPain;

	@Override
	public void start(Stage stage) {
		// This creates a main pane
		mainPain = new MainPain();
		// THis creates the one scene we need for this project
		var scene = new Scene(mainPain.root, 900, 700);
		// This shows the selected scene
		stage.setScene(scene);
		stage.show();
	}

	// The actual main will just serve to launch the project
	public static void main(String[] args) {
		// The actual launch code
		launch();
	}

}