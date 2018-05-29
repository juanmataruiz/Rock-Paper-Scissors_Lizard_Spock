package com.example.user.rockpaperscissors;

public enum MoveType {

    ROCK("SCISSORS"),
    PAPER("ROCK"),
    SCISSORS("PAPER");

    private String winsAgainst;

    MoveType(String moveString) {
        this.winsAgainst = moveString;
    }

    public MoveType getWinsAgainst() {
        switch (winsAgainst){
            case "SCISSORS":
                return MoveType.SCISSORS;
            case "PAPER":
                return MoveType.PAPER;
            case "ROCK":
                return MoveType.ROCK;
            default:
                return MoveType.ROCK;
        }
    }
}
