package com.luv2code.designpatterns.behavioral.observer;

/**
 * Role: Subject (Publisher)
 *
 * Maintains a list of observers interested in score updates.
 * Notifies all registered observers when the score changes.
 */
public interface ScoreSubject {

    void registerObserver(ScoreObserver observer);
    void removeObserver(ScoreObserver observer);
    void notifyObservers();

}
