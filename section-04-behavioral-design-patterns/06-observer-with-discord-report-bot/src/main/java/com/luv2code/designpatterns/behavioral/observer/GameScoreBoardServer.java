package com.luv2code.designpatterns.behavioral.observer;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Role: Concrete Subject
 *
 * Holds the actual game score state.
 * When the score is updated, it notifies all subscribed observers.
 */
public class GameScoreboardServer implements ScoreSubject {

    private final Set<ScoreObserver> observers = new LinkedHashSet<>();

    private int homeTeamScore;
    private int awayTeamScore;

    @Override
    public void registerObserver(ScoreObserver observer) {

        if (observer == null) {
            throw new IllegalArgumentException("Observer must be non-null");
        }

        observers.add(observer);
    }

    @Override
    public void removeObserver(ScoreObserver observer) {

        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (ScoreObserver observer : observers) {
            observer.updateScore(homeTeamScore, awayTeamScore);
        }

    }

    /**
     * When the score changes, notify all observers
     */
    public void setScore(int homeTeamScore, int awayTeamScore) {
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;

        notifyObservers();
    }

}











