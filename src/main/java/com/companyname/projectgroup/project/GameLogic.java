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
		System.out.println("Check GameOver");
		if (MyUserinterface.win == true) {
			
		}
		if (moves == 9) {
			System.out.println("Game Tie");
			MyUserinterface.creatNewGame();
		}
	}

	static void chelkUpdate() {
		System.out.println("Check Event");
		App.root.getOnMouseClicked();
	}

	// update the label text
	static void updateBoard(int i, int j) {
		System.out.println("Update Board");
		if (MyUserinterface.textArr[i][j].getText() == " ") {
			MyUserinterface.textArr[i][j].setText(Player.getCurrentPlayer().getSymbol());
			
		}
	}

	// update game
	static void updateGame(int i, int j) {
		System.out.println("Update Game");
		if (game[i][j] == 2) {
			game[i][j] = Player.getCurrentPlayer().getValue();
			System.out.print(Player.getCurrentPlayer().getValue());
			moves++;
			//System.out.println(game[i-1][j-1]);
		}
	}
	static void setMyEventHandle() {
		System.out.println("set Mouse Event");
		App.root.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent eS) {
				for (int i = 0; i < 3; i++) { 
					for (int j = 0; j < 3; j++) {
				
						System.out.println("Event Occur");
						updateBoard(a, b);
						updateGame(a, b);
						gameOver();
						CheckWinner.checkWinner();
					}
				}
			}
		});
		
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
		 * MyUserinterface.textArr[i][j].setOnMouseClicked(new
		 * EventHandler<MouseEvent>() {
		 * 
		 * @Override public void handle(MouseEvent eS) {
		 * System.out.println("Event Occur"); gameOver(); updateBoard(a, b);
		 * updateGame(a, b); CheckWinner.checkWinner(); } }); } }
		 */
	}
}
