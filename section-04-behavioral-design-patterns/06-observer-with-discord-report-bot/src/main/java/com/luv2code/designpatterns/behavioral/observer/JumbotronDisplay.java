package com.luv2code.designpatterns.behavioral.observer;

/**
 * Role: Concrete Observer
 *
 * Represents a large stadium scoreboard display.
 * Reacts to score updates by visually showing changes.
 */
public class JumbotronDisplay implements ScoreObserver {

    @Override
    public void updateScore(int homeTeamScore, int awayTeamScore) {

        System.out.println("[Jumbotron Display] Home: "
                + homeTeamScore + " | Away: " + awayTeamScore);

    }

}













