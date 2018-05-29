package com.example.user.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RockPaperScissorsTest {

    private RockPaperScissors game;

    @Before
    public void setup(){
        game = new RockPaperScissors();
    }

    @Test
    public void computerCanGuess() {
        MoveType guess = game.getGuess();
        assertTrue(guess == MoveType.ROCK || guess == MoveType.SCISSORS || guess == MoveType.PAPER);
    }

    @Test
    public void rockWins() {
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.SCISSORS, MoveType.ROCK));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.ROCK, MoveType.SCISSORS));
    }

    @Test
    public void paperWins() {
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.ROCK, MoveType.PAPER));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.PAPER, MoveType.ROCK));
    }

    @Test
    public void scissorsWins() {
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.PAPER, MoveType.SCISSORS));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.SCISSORS, MoveType.PAPER));
    }

    @Test
    public void canDraw() {
        assertEquals(GameOutcome.DRAW, game.getWinner(MoveType.PAPER, MoveType.PAPER));
    }
    



}
