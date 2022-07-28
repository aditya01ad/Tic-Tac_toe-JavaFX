package com.companyname.projectgroup.project;

public class Player {
	private String Name;
	private final String symbol;
	private final int value;
	static Player currentPlayer;

	public Player(String name, String symbol, int value) {
		super();
		this.Name = name;
		this.symbol = symbol;
		this.value = value;
	}

	// getters and setters

	public int getValue() {
		return value;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public static void setCurrentPlayer(Player currentPlayer) {
		Player.currentPlayer = currentPlayer;
	}

	public void steToCurrentPlayer(Player currentPlayer) {
		Player.currentPlayer = currentPlayer;
	}

	public static Player getCurrentPlayer() {
		return currentPlayer;
	}

}
