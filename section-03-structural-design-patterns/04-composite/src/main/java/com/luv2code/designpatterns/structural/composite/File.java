package com.luv2code.designpatterns.structural.composite;

/**
 * Leaf role in Composite pattern.
 *
 * Represents a simple element (file) with a name and a size.
 * Performs work directly without child components.
 */
public class File implements FileSystemComponent {

    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return size;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (" + size + " bytes)");
    }

}
