package com.companyname.projectgroup.project;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class MyUserinterface {
	static GridPane gridPane;
	static Label[][] textArr = new Label[3][3];
	static Player playerX = new Player("Aditya", "X", 0);
	static Player playerO = new Player("Jay", "O", 1);
	static boolean win = false;

	public static GridPane creatGridPane() {
		
		gridPane = new GridPane();
		gridPane.setPadding(new Insets(15, 0, 0, 15));
		gridPane.setHgap(35);
		gridPane.setVgap(40);
		
		// title Label to fill extra space above
		Label l = new Label("");
		l.setMinHeight(168);
		gridPane.add(l, 0, 0);

		// crest game
		creatTextFieldArr();
		creatNewGame();

		return gridPane;
	}
	
	// create transparent Labels to display user input
	private static void creatTextFieldArr() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				textArr[i][j] = new Label();
				textArr[i][j].setAlignment(Pos.CENTER);
				textArr[i][j].setMinHeight(160);
				textArr[i][j].setFont(new Font(70));
				// textArr[i][j].setStyle(" -fx-background-insets: 0;");
				gridPane.add(textArr[i][j], i, j + 1);
			}
		}

	}
	
	// to change player after every move
	static void changePlayer() {
		if (Player.currentPlayer == null) {
			Player.setCurrentPlayer(playerO);
		} else if (Player.currentPlayer == playerX) {
			Player.setCurrentPlayer(playerO);
		} else if (Player.currentPlayer == playerO) {
			Player.setCurrentPlayer(playerX);
		}
	}
	
	// create a new blank game
	static void creatNewGame() {
		Player.currentPlayer = playerX;
		GameLogic.moves = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				textArr[i][j].setText(" ");
				GameLogic.game[i][j] = 2;
			}
		}
	}
}
