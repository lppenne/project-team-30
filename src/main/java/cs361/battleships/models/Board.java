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

		// Maximum index the row or column can be based on ship length
		int maxIndex = 10 - shipLength + 1;

		// Check if ship is placed outside boundaries
		if (isVertical && x > maxIndex || !isVertical && columnIndex > maxIndex || checkOverlap(ship)) {
			return false;
		}

		// Add ship to ships array
		ships.add(ship);

		return true;
	}

	/**
	 * Checks if new ship overlaps with existing ships on the board
	 * @param newShip Ship to be added to board
	 * @return true if new ship overlaps with existing ships, false otherwise
	 */
	private boolean checkOverlap(Ship newShip) {
		// Iterate over existing ships
		for (Ship ship : this.ships) {
			// Iterate over occupied squares in existing ship
			for (Square s1 : ship.getOccupiedSquares()) {
				// Iterate over squares in new ship
				for (Square s2 : newShip.getOccupiedSquares()) {
					// Return true if a square in the new ship overlaps with an existing ship
					if (s1.getColumn() == s2.getColumn() && s1.getRow() == s2.getRow()) {
						return true;
					}
				}
			}
		}
		return false;
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
