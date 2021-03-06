package com.example.benjaminbowen.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by benjaminbowen on 20/12/2017.
 */

public class GameTest {

    private Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void canGetPlayersChoice(){
        assertEquals("rock", game.getPlayerChoice());
    }

    @Test
    public void canGetComputerChoice(){
        assertNotNull(game.getComputerChoice());
//        assertEquals("Rock", game.getComputerChoice());
    }

    @Test
    public void canSetRandomComputerChoice(){
        game.setComputerToRandomChoice();
//        assertEquals("rock", game.getComputerChoice());
        assertNotNull(game.getComputerChoice());
    }

    @Test
    public void canSetPlayerChoice(){
        game.setPlayerChoice("paper");
        assertEquals("paper", game.getPlayerChoice());
    }

    @Test
    public void canGetWinnerDraw(){
        game.setComputerChoice("rock");
        assertEquals("It's a draw", game.getWinner());
    }

    @Test
    public void canGetWinnerComputerPaper(){
        game.setComputerChoice("paper");
        assertEquals("The computer wins with paper", game.getWinner());
    }

    @Test
    public void canGetWinnerCOmputerScissors(){
        game.setComputerChoice("scissors");
        assertEquals("The player wins with rock", game.getWinner());
    }

    @Test
    public void canPrintInputs(){
        game.setComputerChoice("scissors");
        assertEquals("The computer played scissors and you played rock.", game.printInputs());
    }


    @Test
    public void canGetRandomWinner(){
        assertEquals("The player wins with rock", game.getWinner());
    }

    @Test
    public void canGetScoreNoGames(){
        assertEquals("The score\n\nYou: 0\nComputer: 0", game.printScore());
    }

    @Test
    public void canGetScoreOneGame(){
        game.setComputerChoice("paper");
        game.getWinner();
        assertEquals("The score\n\nYou: 0\nComputer: 1", game.printScore());
    }
}
