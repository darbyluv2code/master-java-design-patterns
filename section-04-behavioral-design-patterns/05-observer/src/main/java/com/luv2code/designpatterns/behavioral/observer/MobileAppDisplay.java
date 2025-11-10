package com.luv2code.designpatterns.behavioral.observer;

/**
 * Role: Concrete Observer
 *
 * Represent's a fan's mobile app that receives live score notifications.
 */
public class MobileAppDisplay implements ScoreObserver {

    @Override
    public void updateScore(int homeTeamScore, int awayTeamScore) {

        System.out.println("[Mobile App Display] Home: "
                + homeTeamScore + " | Away: " + awayTeamScore);

    }
}
