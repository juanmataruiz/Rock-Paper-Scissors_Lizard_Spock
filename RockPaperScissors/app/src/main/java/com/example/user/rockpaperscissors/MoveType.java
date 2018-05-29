package com.example.user.rockpaperscissors;

public enum MoveType {

    ROCK(MoveType.SCISSORS),
    PAPER(MoveType.ROCK),
    SCISSORS(MoveType.PAPER);

    private MoveType winsAgainst;

    MoveType(MoveType moveType) {
        this.winsAgainst = moveType;
    }

    public MoveType getWinsAgainst() {
        return winsAgainst;
    }
}
