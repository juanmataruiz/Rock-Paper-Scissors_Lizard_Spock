package com.example.user.rockpaperscissors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RockPaperScissors {

    public MoveType getGuess() {
        List<MoveType> moves = Arrays.asList(MoveType.values());
        Collections.shuffle(moves);
        return moves.get(0);
    }

    public GameOutcome getWinner(MoveType player_1, MoveType computer) {
        if (player_1 == computer) return GameOutcome.DRAW;
        if (player_1.getWinsAgainst() == computer) {
            return GameOutcome.PLAYER_1;
        }
        return GameOutcome.COMPUTER;
    }
}
