package com.companyname.projectgroup.project;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
	private static final String APPNAME = "Tic Tac Toe";
	Timer timer = new Timer();
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) {
		
		GridPane root = MyUserinterface.creatGridPane();
		Scene scene = new Scene(root, 620, 800);

		Background bGround = gameBackGround();
		root.setBackground(bGround);

		primaryStage.setTitle(APPNAME);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		while (GameLogic.play) {
			
			// Check if any player won
			CheckWinner.checkWinner();
			GameLogic.gameOver();
			//GameLogic.chelkUpdate();

		}
	}

	// Tic-Tac-Toe Board Image
	private Background gameBackGround() {
		Image img = new Image("https://www.5minutesformom.com/wp-content/uploads/2015/08/Tic-Tac-Toe-Board-letter.jpg");
		BackgroundImage bImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
				BackgroundPosition.DEFAULT, new BackgroundSize(620, 800, true, true, true, true));
		Background bGround = new Background(bImg);
		return bGround;
	}

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}

}
