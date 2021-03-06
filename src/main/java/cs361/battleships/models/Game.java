package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Random;

import static cs361.battleships.models.AttackStatus.*;

public class Game {

    @JsonProperty private Board playersBoard = new Board();
    @JsonProperty private Board opponentsBoard = new Board();

    /*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
    public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {
        boolean successful = playersBoard.placeShip(ship, x, y, isVertical);
        if (!successful)
            return false;

        boolean opponentPlacedSuccessfully;
        do {
            // AI places random ships, so it might try and place overlapping ships
            // let it try until it gets it right
            opponentPlacedSuccessfully = opponentsBoard.placeShip(ship, randRow(), randCol(), randVertical());
        } while (!opponentPlacedSuccessfully);

        return true;
    }

    /*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
    public boolean attack(int x, char  y) {
        Result playerAttack = opponentsBoard.attack(x, y);
        if (playerAttack.getResult() == INVALID) {
            return false;
        }

        Result opponentAttackResult;
        do {
            // AI does random attacks, so it might attack the same spot twice
            // let it try until it gets it right
            opponentAttackResult = playersBoard.attack(randRow(), randCol());
        } while(opponentAttackResult.getResult() != INVALID);

        return true;
    }

    // All three of these are public. I can't think of a reason why they should specifically be private,
    // also, it makes testing easier
    public char randCol() {
        Random rand = new Random();
        // Grid of size 10 is hardcoded into this. TODO: make grid size a seperately defined constant
        int someNumber = rand.nextInt(10) + 65;
        char theCol = (char)someNumber;
        return theCol;
    }

    public int randRow() {
        Random rand = new Random();
        // This is also hardcoded as a grid size of 10
        return rand.nextInt(10) + 1;
    }

    public boolean randVertical() {
        Random rand = new Random();
        return rand.nextBoolean();
    }
}
