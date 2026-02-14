package com.luv2code.designpatterns.behavioral.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Role: Caretaker
 *
 * Maintains bounded undo and redo history.
 * Stores QuerySnapshot objects without
 * inspecting or modifying their contents.
 */
public class CatalogQueryHistory {

    private static final int MAX_HISTORY = 20;

    private Deque<CatalogQueryState.QuerySnapshot> undoCollection = new ArrayDeque<>();

    private Deque<CatalogQueryState.QuerySnapshot> redoCollection = new ArrayDeque<>();

    private void pushBounded(Deque<CatalogQueryState.QuerySnapshot> theCollection,
                             CatalogQueryState.QuerySnapshot snapshot) {

        if (theCollection.size() == MAX_HISTORY) {
            theCollection.removeLast();
        }

        theCollection.push(snapshot);
    }

    public void saveBeforeChange(CatalogQueryState originator) {

        redoCollection.clear();
        pushBounded(undoCollection, originator.createSnapshot());
    }

    public boolean undo(CatalogQueryState originator) {

        if (undoCollection.isEmpty()) {
            return false;
        }

        pushBounded(redoCollection, originator.createSnapshot());
        originator.restore(undoCollection.pop());

        return true;
    }

    public boolean redo(CatalogQueryState originator) {

        if (redoCollection.isEmpty()) {
            return false;
        }

        pushBounded(undoCollection, originator.createSnapshot());
        originator.restore(redoCollection.pop());

        return true;
    }

}











