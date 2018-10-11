package cs361.battleships.models;

public class Result {

	private Ship target;
	private Square location;
	private AttackStatus result;

	public AttackStatus getResult() {
		return result;
	}

	public void setResult(AttackStatus result) {
		this.result = result;
	}

	public Ship getShip() {
		return target;
	}

	public void setShip(Ship ship) {
		target = ship;
	}

	public Square getLocation() {
		return location;
	}

	public void setLocation(Square square) {
		location = square;
	}
}
