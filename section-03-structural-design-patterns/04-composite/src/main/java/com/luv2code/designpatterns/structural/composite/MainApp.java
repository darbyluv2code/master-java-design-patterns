package com.luv2code.designpatterns.structural.composite;

public class MainApp {

    public static void main(String[] args) {

        File file1 = new File("file1.txt", 2000);
        File file2 = new File("file2.txt", 3000);
        File file3 = new File("file3.txt", 4000);

        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");

        folder1.addComponent(file1);

        folder1.addComponent(folder2);
        folder2.addComponent(file2);
        folder2.addComponent(file3);

        ZipFile zipFile1 = new ZipFile("archive.zip", 6000, 0.40);
        folder1.addComponent(zipFile1);

        System.out.println(folder1.getName() + " size: (" + folder1.getSize() + " bytes)");
        System.out.println(folder2.getName() + " size: (" + folder2.getSize() + " bytes)");

        System.out.println();

        folder1.print("");

    }
}
