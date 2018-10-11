package cs361.battleships.models;

public class Result {

	private Ship target;
	private Square location;
	private AttackStatus result;

	// Default constructor. Must use getters and setters to initialize values if this is used.
	public Result () {}

	public Result (Square location, AttackStatus result, Ship target) {
		// Set result location to passed location
		this.location = location;

		// Set result to passed result. Should be a valid attack status.
		this.result = result;

		// Sets the target to be the hit ship. If the attack had a MISS status, this should be NULL.
		this.target = target;
	}

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
