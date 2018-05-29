package com.example.user.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button rockBttn;
    Button paperBttn;
    Button scissorsBttn;
    TextView resultConsole;
    RockPaperScissors rockPaperScissors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockBttn = findViewById(R.id.rock_bttn);
        paperBttn = findViewById(R.id.paper_bttn);
        scissorsBttn = findViewById(R.id.scissors_bttn);
        resultConsole = findViewById(R.id.result_console);
        rockPaperScissors = new RockPaperScissors();
        rockBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(MoveType.ROCK);
            }
        });
        paperBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(MoveType.PAPER);
            }
        });
        scissorsBttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play(MoveType.SCISSORS);
            }
        });

    }

    public void play(MoveType playerChoice) {
       MoveType computerChoice = rockPaperScissors.getGuess();
       GameOutcome result = rockPaperScissors.getWinner(playerChoice, computerChoice);
       rockPaperScissors.recordOutcome(result);
       displayResult(playerChoice, computerChoice, result);
    }

    public void displayResult(MoveType playerChoice, MoveType computerChoice, GameOutcome result) {
        resultConsole.setText("");
        StringBuilder sb = new StringBuilder();

        sb.append("Player wins: ");
        sb.append(rockPaperScissors.getPlayerWins());
        sb.append("\n");

        sb.append("Computer wins: ");
        sb.append(rockPaperScissors.getComputerWins());
        sb.append("\n");

        sb.append("Draws: ");
        sb.append(rockPaperScissors.getDraws());
        sb.append("\n\n");


        sb.append("Player chose: ");
        sb.append(playerChoice.toString().toLowerCase());
        sb.append("\n");

        sb.append("Computer chose: ");
        sb.append(computerChoice.toString().toLowerCase());
        sb.append("\n");

        switch (result) {
            case PLAYER_1:
                sb.append("Congrats you win!");
                break;
            case DRAW:
                sb.append("It has been a draw!");
                break;
            case COMPUTER:
                sb.append("Sorry, computer won this time.");
        }

        resultConsole.setText(sb.toString());
    }
}
