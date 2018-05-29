package com.example.user.rockpaperscissors;

public enum MoveType {

    ROCK(new String[]{"SCISSORS","LIZARD"}),
    PAPER(new String[]{"ROCK","SPOCK"}),
    SCISSORS(new String[]{"PAPER", "LIZARD"}),
    LIZARD(new String[]{"PAPER","SPOCK"}),
    SPOCK(new String[]{"POCK","SCISSORS"});

    private String[] winsAgainst;

    MoveType(String[] moveString) {
        this.winsAgainst = moveString;
    }

    public MoveType stringToMoveType(String move) {
        switch (move){
            case "SCISSORS":
                return MoveType.SCISSORS;
            case "PAPER":
                return MoveType.PAPER;
            case "ROCK":
                return MoveType.ROCK;
            case "SPOCK":
                return MoveType.SPOCK;
            case "LIZARD":
                return MoveType.LIZARD;
            default:
                return MoveType.ROCK;
        }
    }

    public MoveType[] getWinsAgainst() {
        MoveType[] result = new MoveType[winsAgainst.length];
        for (int i = 0; i < winsAgainst.length; i ++) {
            result[i] = stringToMoveType(winsAgainst[i]);
        }
        return result;
    }
}
