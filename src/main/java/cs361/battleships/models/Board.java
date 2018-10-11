package cs361.battleships.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Result> attacks;
	private List<Ship> ships;

	private final String chars = "ABCDEFGHIJ";

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Board() {
		// TODO Implement
		this.attacks = new ArrayList<>();
		this.ships = new ArrayList<>();
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {
		int shipLength = ship.getOccupiedSquares().size();
		int columnIndex = this.chars.indexOf(y) + 1;

		int maxIndex = 10 - shipLength + 1;

		if (isVertical && x > maxIndex || !isVertical && columnIndex > maxIndex) {
			return false;
		}

		ships.add(ship);
		return true;
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Result attack(int x, char y) {
		//TODO Implement
		return null;
	}

	public List<Ship> getShips() {
		return this.ships;
	}

	public void setShips(List<Ship> ships) {
		//TODO implement
	}

	public List<Result> getAttacks() {
		return this.attacks;
	}

	public void setAttacks(List<Result> attacks) {
		//TODO implement
	}
}
