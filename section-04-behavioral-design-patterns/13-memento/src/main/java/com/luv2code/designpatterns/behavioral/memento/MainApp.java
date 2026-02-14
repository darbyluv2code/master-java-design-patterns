package com.luv2code.designpatterns.behavioral.memento;

/**
 * Role: Client
 *
 * Demonstrates usage of the Memento pattern
 * for Course Catalog Query History with
 * bounded undo and redo support
 */
public class MainApp {

    public static void main(String[] args) {

        //------------------------------------
        // Setup
        //------------------------------------
        CatalogQueryState queryState = new CatalogQueryState();
        CatalogQueryHistory queryHistory = new CatalogQueryHistory();

        System.out.println("Initial state:");
        System.out.println(queryState);


        //------------------------------------
        // Build Query
        //------------------------------------
        queryHistory.saveBeforeChange(queryState);
        queryState.setSearchText("spring boot");

        queryHistory.saveBeforeChange(queryState);
        queryState.addFilter("level", "beginner");

        queryHistory.saveBeforeChange(queryState);
        queryState.addFilter("topic", "security");

        queryHistory.saveBeforeChange(queryState);
        queryState.setSort("rating", SortDirection.DESCENDING);

        System.out.println("\nAfter building query:");
        System.out.println(queryState);


        //------------------------------------
        // Remove a filter
        //------------------------------------
        queryHistory.saveBeforeChange(queryState);
        queryState.removeFilter("topic", "security");

        System.out.println("\nAfter removing topic=security");
        System.out.println(queryState);

        //------------------------------------
        // Clear all filters
        //------------------------------------
        queryHistory.saveBeforeChange(queryState);
        queryState.clearFilters();

        System.out.println("\nAfter clearing all filters");
        System.out.println(queryState);

        //------------------------------------
        // UNDO clear
        //------------------------------------
        boolean undoWorked = queryHistory.undo(queryState);

        System.out.println("\nAfter UNDO (restore previous state)");
        System.out.println(queryState);
        System.out.println("Undo worked: " + undoWorked);


        //------------------------------------
        // UNDO remove
        //------------------------------------
        queryHistory.undo(queryState);

        System.out.println("\nAfter UNDO (restore removed filter)");
        System.out.println(queryState);

        //------------------------------------
        // Change Sort
        //------------------------------------
        queryHistory.saveBeforeChange(queryState);
        queryState.setSort("name", SortDirection.ASCENDING);

        System.out.println("\nAfter changing sort to name ASCENDING");
        System.out.println(queryState);

        //------------------------------------
        // UNDO Sort change
        //------------------------------------
        queryHistory.undo(queryState);

        System.out.println("\nAfter UNDO (restore previous sort)");
        System.out.println(queryState);

        //------------------------------------
        // REDO
        //------------------------------------
        queryHistory.redo(queryState);

        System.out.println("\nAfter REDO");
        System.out.println(queryState);

        //------------------------------------
        // REDO clearing rule
        //------------------------------------
        queryHistory.saveBeforeChange(queryState);
        queryState.addFilter("level", "advanced");

        System.out.println("\nAfter new change (redo history cleared)");
        System.out.println(queryState);

        boolean redoWorked = queryHistory.redo(queryState);
        System.out.println("\nTry REDO after new change (should be false): " + redoWorked);

    }
}












