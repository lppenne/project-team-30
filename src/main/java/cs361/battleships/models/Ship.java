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

        switch (this.kind) {
            case "MINESWEEPER":
                size = 2;
                break;
            case "DESTROYER":
                size = 3;
                break;
            case "BATTLESHIP":
                size = 4;
                break;
            default:
                size = 0;
                break;
        }

        occupiedSquares = new ArrayList<>(size);
    }

    public List<Square> getOccupiedSquares() { return occupiedSquares; }

	public String getKind() { return kind; }

    public int getSize() { return size; }
}
