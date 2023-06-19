package CS120.ECASandoval20;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

	@FXML
	private void HitProc() throws IOException {
		//BlackJackGame game = new BlackJackGame();
		App.game.setpOf(true);
		//App.game.bjgCont();
	}

	@FXML
	private void passProc() throws IOException {
		//BlackJackGame game = new BlackJackGame();
		App.game.setpOf(false);	
		//App.game.bjgCont();
	}

}
