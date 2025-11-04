package com.luv2code.designpatterns.structural.composite;

/**
 * Leaf role in Composite pattern.
 *
 * Represents a compressed file (e.g., ZIP).
 * Size is reduced relative to the original by a compression ratio.
 */
public class ZipFile implements FileSystemComponent {

    private String name;
    private long originalSize;
    private double compressionRatio;

    // precomputed
    private long compressedSize;

    public ZipFile(String name, long originalSize, double compressionRatio) {
        this.name = name;
        this.originalSize = originalSize;
        this.compressionRatio = compressionRatio;

        this.compressedSize = Math.round(originalSize * compressionRatio);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getSize() {
        return compressedSize;
    }

    @Override
    public void print(String indent) {
        System.out.println(indent + "- " + name + " (compressed, " + compressedSize + " bytes)");
    }

}






