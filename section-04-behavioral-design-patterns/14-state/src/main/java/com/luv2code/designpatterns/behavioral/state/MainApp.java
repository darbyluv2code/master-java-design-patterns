package com.luv2code.designpatterns.behavioral.state;

/**
 * Role: Client
 *
 * Demonstrates the State pattern through happy path,
 * backward transition and invalid transition scenarios.
 */
public class MainApp {

    static void main() {

        // Demo 1: The Happy Path
        System.out.println("\n--- Demo 1: Happy Path ---");
        demonstrateHappyPath();

        // Demo 2: Reopening a Closed Ticket (backward transition)
        System.out.println("\n--- Demo 2: Backward Transition (Reopen) ---");
        demonstrateReopenWorkflow();

        // Demo 3: Invalid State Transitions
        System.out.println("\n--- Demo 3: Invalid State Transitions ---");
        demonstrateInvalidTransitions();

    }

    private static void demonstrateInvalidTransitions() {

        BugTicket ticket = new BugTicket("BUG-103", "Memory leak in background service",
                "Service consumes excessive memory over time");

        // Attempt 1: Try to close without starting work
        ticket.printStatus();
        System.out.println("Attempt: Close ticket without starting work ...");

        try {
            ticket.close();
        } catch (IllegalStateException e) {
            System.out.println("[FAIL] Invalid transition (expected): " + e.getMessage());
        }

        // Attempt 2: Try to reopen a ticket that's not closed
        ticket.printStatus();
        System.out.println("Attempt: Reopen a ticket that's not closed ...");

        try {
            ticket.reopen();
        } catch (IllegalStateException e) {
            System.out.println("[FAIL] Invalid transition (expected): " + e.getMessage());
        }

        // Correct workflow
        ticket.startWork();

        // Attempt 3: Try to start work again (already in progress)
        ticket.printStatus();
        System.out.println("Attempt: Start work again while already in progress ...");

        try {
            ticket.startWork();
        } catch (IllegalStateException e) {
            System.out.println("[FAIL] Invalid transition (expected): " + e.getMessage());
        }

        // Close it properly
        ticket.close();

        // Attempt 4: Try to close an already closed ticket
        ticket.printStatus();
        System.out.println("Attempt: Close an already closed ticket ...");

        try {
            ticket.close();
        } catch (IllegalStateException e) {
            System.out.println("[FAIL] Invalid transition (expected): " + e.getMessage());
        }

        System.out.println("\n[PASS] State transition guards are working correctly!");
    }

    private static void demonstrateReopenWorkflow() {

        BugTicket ticket = new BugTicket("BUG-102", "Dashboard loading slowly",
                "Dashboard takes 10 seconds to load");

        // Complete the workflow
        ticket.startWork();
        ticket.close();
        ticket.printStatus();

        // Bug resurfaces - reopen the ticket (Backward Transition)
        System.out.println("Bug has resurfaced! Reopening ticket ...");
        ticket.reopen();
        ticket.printStatus();
        ticket.addComment("Bug reappeared after last deployment - reopening for investigation");

        // Fix it again
        ticket.startWork();
        ticket.close();
        ticket.printStatus();

        System.out.println("[PASS] Reopen workflow completed successfully!");
    }

    private static void demonstrateHappyPath() {

        BugTicket ticket = new BugTicket("BUG-101", "Login button not responding",
                "Users cannot click the login button on mobile devices");

        ticket.printStatus();
        ticket.addComment("Reproduced on mobile browsers.");

        // Move from OPEN -> IN_PROGRESS
        ticket.startWork();
        ticket.printStatus();
        ticket.addComment("Traced to a missing pointer event listener");

        // Move from IN_PROGRESS -> CLOSED
        ticket.close();
        ticket.printStatus();

        System.out.println("[PASS] Happy path completed successfully!");
    }
}






