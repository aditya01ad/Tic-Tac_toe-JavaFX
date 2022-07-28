package com.companyname.projectgroup.project;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class GameLogic {
	static int[][] game = new int[3][3]; // an array of 0, 1, 2 (for empty / can take any other number like -1)
	static boolean play = true; //
	static int moves = 0; // count number of moves
	static int a, b;
	
	// a player wins or tie in moves are 9 and no winer
	static void gameOver() {

		if (MyUserinterface.win == true) {
			
		}
		if (moves == 9) {
			System.out.println("Game Tie");
			MyUserinterface.creatNewGame();
		}
	}

	static void chelkUpdate() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a = i;
				b = j;
				MyUserinterface.textArr[i - 1][j - 1].setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent e) {
						updateBord(a, b);
						updateGame(a, b);
					}
				});
			}
		}
	}

	// update the label text
	static void updateBord(int i, int j) {

		if (MyUserinterface.textArr[i - 1][j - 1].getText() == " ") {
			MyUserinterface.textArr[i - 1][j - 1].setText(Player.getCurrentPlayer().getSymbol());
			
		}
	}

	// update game
	static void updateGame(int i, int j) {

		if (game[i - 1][j - 1] == 2) {
			game[i - 1][j - 1] = Player.getCurrentPlayer().getValue();
			moves++;
			//System.out.println(game[i-1][j-1]);
		}
	}

}
