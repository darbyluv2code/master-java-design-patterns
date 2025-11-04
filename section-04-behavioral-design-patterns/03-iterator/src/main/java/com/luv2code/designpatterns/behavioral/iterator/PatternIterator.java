package com.luv2code.designpatterns.behavioral.iterator;

/**
 * Role: Iterator interface
 *
 * Defines the standard operations for traversing a collection.
 */
public interface PatternIterator<T> {

    boolean hasNext();
    T next();

}
