package com.luv2code.designpatterns.structural.composite;

/**
 * Component role in Composite pattern.
 *
 * Common interface for both leaves (File) and composites (Folder),
 * letting clients treat them uniformly.
 */
public interface FileSystemComponent {

    String getName();
    long getSize();

    void print(String indent);

}
