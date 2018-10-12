package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private List<Square> occupiedSquares;

	private String kind;
	private int size;

	public Ship() {
		occupiedSquares = new ArrayList<>();
	}

	public Ship(String kind) {
        this.kind = kind;

        if (this.kind.equals("MINESWEEPER")) {
            size = 2;
        } else if (this.kind.equals("DESTROYER")) {
            size = 3;
        } else if (this.kind.equals("BATTLESHIP")) {
            size = 4;
        } else {
            size = 0;
        }

        occupiedSquares = new ArrayList<>(size);
    }

    public List<Square> getOccupiedSquares() { return occupiedSquares; }

	public String getKind() { return kind; }

    public int getSize() { return size; }
}
