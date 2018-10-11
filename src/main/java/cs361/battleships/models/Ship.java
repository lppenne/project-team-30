package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private List<Square> occupiedSquares;

	private String kind;

	public Ship() {
		occupiedSquares = new ArrayList<>();
	}
	
	public Ship(String kind) {
        this.kind = kind;
        occupiedSquares = new ArrayList<>();
	}

	public List<Square> getOccupiedSquares() {
		//TODO implement
		return null;
	}

	public String getKind() {.
	    return kind;
    }
}
