package com.companyname.projectgroup.project;

public class CheckWinner {
	
	// check after every move for current player
	static void checkWinner() {
		MyUserinterface.win = false;
		for (int i = 0; i < 3; i++) {
			checkRow(i);
		}
		for (int i = 0; i < 3; i++) {
			checkCol(i);
		}
		checkX();

		if (MyUserinterface.win == true)

		{
			System.out.println("Winner Is " + Player.getCurrentPlayer().getName());
		}
	}
	
	// check diagonal 
	private static void checkX() {
		int miss = 0;
		for (int j = 0; j < 3; j++) {
			if (GameLogic.game[j][j] != Player.getCurrentPlayer().getValue()) {
				miss++;
			}
		}
		if (miss == 0) {
			MyUserinterface.win = true;
		}
		miss = 0;
		for (int j = 0; j < 3; j++) {
			if (GameLogic.game[j][j] != Player.getCurrentPlayer().getValue()) {
				miss++;
			}
		}
		if (miss == 0) {
			MyUserinterface.win = true;
		}
	}
	
	//check each column 
	private static void checkCol(int i) {
		int miss = 0;
		for (int j = 0; j < 3; j++) {
			if (GameLogic.game[j][j] != Player.getCurrentPlayer().getValue()) {
				miss++;
			}
		}
		if (miss == 0) {
			MyUserinterface.win = true;
		}
	}

	// check each row
	private static void checkRow(int i) {
		int miss = 0;
		for (int j = 0; j < 3; j++) {
			if (GameLogic.game[j][j] != Player.getCurrentPlayer().getValue()) {
				miss++;
			}
		}
		if (miss == 0) {
			MyUserinterface.win = true;
		}
	}

}
