package com.example.user.rockpaperscissors;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RockPaperScissors {

    private int player_1;
    private int computer;
    private int draw;

    public RockPaperScissors() {
        this.player_1 = 0;
        this.computer = 0;
        this.draw = 0;
    }

    public MoveType getGuess() {
        List<MoveType> moves = Arrays.asList(MoveType.values());
        Collections.shuffle(moves);
        return moves.get(0);
    }

    public GameOutcome getWinner(MoveType player_1, MoveType computer) {
        if (player_1 == computer) return GameOutcome.DRAW;
        for (MoveType move : player_1.getWinsAgainst()) {
            if (move == computer) return GameOutcome.PLAYER_1;
        }
        return GameOutcome.COMPUTER;
    }

    public int getPlayerWins() {
        return player_1;
    }

    public int getComputerWins() {
        return computer;
    }

    public int getDraws() {
        return draw;
    }

    public void recordOutcome(GameOutcome result) {
        switch (result) {
            case COMPUTER:
                computer ++;
                return;
            case PLAYER_1:
                player_1 ++;
                return;
            case DRAW:
                draw ++;
        }
    }
}
