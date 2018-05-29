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
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.LIZARD, MoveType.ROCK));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.ROCK, MoveType.LIZARD));
    }

    @Test
    public void paperWins() {
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.ROCK, MoveType.PAPER));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.PAPER, MoveType.ROCK));
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.SPOCK, MoveType.PAPER));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.PAPER, MoveType.SPOCK));
    }

    @Test
    public void scissorsWins() {
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.PAPER, MoveType.SCISSORS));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.SCISSORS, MoveType.PAPER));
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.LIZARD, MoveType.SCISSORS));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.SCISSORS, MoveType.LIZARD));
    }

    @Test
    public void lizardWins() {
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.PAPER, MoveType.LIZARD));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.LIZARD, MoveType.PAPER));
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.SPOCK, MoveType.LIZARD));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.LIZARD, MoveType.SPOCK));
    }

    @Test
    public void spockWins() {
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.ROCK, MoveType.SPOCK));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.SPOCK, MoveType.ROCK));
        assertEquals(GameOutcome.COMPUTER, game.getWinner(MoveType.SCISSORS, MoveType.SPOCK));
        assertEquals(GameOutcome.PLAYER_1, game.getWinner(MoveType.SPOCK, MoveType.SCISSORS));
    }

    @Test
    public void canDraw() {
        assertEquals(GameOutcome.DRAW, game.getWinner(MoveType.PAPER, MoveType.PAPER));
    }

    @Test
    public void canGetPlayersWins() {
        assertEquals(0, game.getPlayerWins());
    }

    @Test
    public void canGetComputerWins() {
        assertEquals(0, game.getComputerWins());
    }

    @Test
    public void canGetDraws() {
        assertEquals(0, game.getDraws());
    }

    @Test
    public void gameCanAddWin__Player() {
        game.recordOutcome(GameOutcome.PLAYER_1);
        assertEquals(1, game.getPlayerWins());
    }

    @Test
    public void gameCanAddWin__Computer() {
        game.recordOutcome(GameOutcome.COMPUTER);
        assertEquals(1, game.getComputerWins());
    }

    @Test
    public void gameCanAddDraw() {
        game.recordOutcome(GameOutcome.DRAW);
        assertEquals(1, game.getDraws());
    }







}
