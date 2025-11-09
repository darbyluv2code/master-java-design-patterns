package com.luv2code.designpatterns.behavioral.observer;

/**
 * Role: Observer
 *
 * Any display element that wants to receive score updates implements this.
 * The subject calls updateScore(...) whenever the score changes.
 */
public interface ScoreObserver {

    void updateScore(int homeTeamScore, int awayTeamScore);

}
