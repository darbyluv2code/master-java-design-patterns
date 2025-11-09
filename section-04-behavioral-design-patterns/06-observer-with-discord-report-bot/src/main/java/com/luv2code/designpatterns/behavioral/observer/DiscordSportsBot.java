package com.luv2code.designpatterns.behavioral.observer;

/**
 * ROLE: Concrete Observer
 *
 * Represents a Discord bot that posts score updates to a Discord channel.
 */
public class DiscordSportsBot implements ScoreObserver {

    @Override
    public void updateScore(int homeTeamScore, int awayTeamScore) {
        System.out.println("[Discord Bot] Posting update: Home "
                + homeTeamScore + " - Away " + awayTeamScore);
    }
}