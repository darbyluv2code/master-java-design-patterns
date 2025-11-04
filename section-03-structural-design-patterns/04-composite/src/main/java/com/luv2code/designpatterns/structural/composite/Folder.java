package com.luv2code.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite role in Composite pattern.
 *
 * Represents a folder that can hold files or other folders.
 * Delegates work to children and aggregates results.
 */
public class Folder implements FileSystemComponent {

    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {

        long totalSize = 0;

        for (FileSystemComponent tempComponent : components) {
            totalSize += tempComponent.getSize();
        }

        return totalSize;
    }

    @Override
    public void print(String indent) {

        System.out.println(indent + "+ " + name + "/ (" + getSize() + " bytes)");

        // recurse with extra indentation
        for (FileSystemComponent tempComponent : components) {
            tempComponent.print(indent + " ");
        }

    }
}








