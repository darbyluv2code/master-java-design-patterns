package com.luv2code.designpatterns.behavioral.observer;

/**
 * Role: Client / Demo / Driver
 *
 * Sets up the Subject and Observers, then simulates score changes.
 */
public class MainApp {

    public static void main(String[] args) {

        GameScoreBoardServer scoreboard = new GameScoreBoardServer();

        ScoreObserver jumbotron = new JumbotronDisplay();
        ScoreObserver mobileApp = new MobileAppDisplay();

        // Observers subscribe
        System.out.println("Registering observers");
        scoreboard.registerObserver(jumbotron);
        scoreboard.registerObserver(mobileApp);

        // Simulate score changes
        System.out.println("Setting the score");
        scoreboard.setScore(3, 2);
        System.out.println();

        System.out.println("Setting the score");
        scoreboard.setScore(6, 3);
        System.out.println();

        // One observer leaves
        System.out.println("Removing observer: mobileApp");
        scoreboard.removeObserver(mobileApp);

        // mobileApp no longer receives the updates
        System.out.println("Setting the score");
        scoreboard.setScore(9, 4);
    }
}
