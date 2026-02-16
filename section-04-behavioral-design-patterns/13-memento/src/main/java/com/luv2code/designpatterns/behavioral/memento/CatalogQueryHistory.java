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

    private Deque<CatalogQueryState.QuerySnapshot> undoStack =
            new ArrayDeque<>();

    private Deque<CatalogQueryState.QuerySnapshot> redoStack =
            new ArrayDeque<>();


    public void saveBeforeChange(CatalogQueryState originator) {

        redoStack.clear();
        pushBounded(undoStack, originator.createSnapshot());
    }

    public boolean undo(CatalogQueryState originator) {

        if (undoStack.isEmpty()) {
            return false;
        }

        pushBounded(redoStack, originator.createSnapshot());
        originator.restore(undoStack.pop());

        return true;
    }

    public boolean redo(CatalogQueryState originator) {

        if (redoStack.isEmpty()) {
            return false;
        }

        pushBounded(undoStack, originator.createSnapshot());
        originator.restore(redoStack.pop());

        return true;
    }

    private void pushBounded(Deque<CatalogQueryState.QuerySnapshot> stack,
                             CatalogQueryState.QuerySnapshot snapshot) {

        if (stack.size() == MAX_HISTORY) {
            stack.removeLast();
        }

        stack.push(snapshot);
    }
}





















