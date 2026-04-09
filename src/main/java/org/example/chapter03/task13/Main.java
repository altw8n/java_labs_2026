package org.example.chapter03.task13;

import java.io.File;

public class Main {
    public static void main() {
        File currentDir = new File(".");
        File[] files = currentDir.listFiles();
        if (files != null && files.length > 0) {
            System.out.println("before sort:");
            FileSorter.printFiles(files, "");
            FileSorter.sortDirectoriesFirst(files);
            System.out.println("after sort:");
            FileSorter.printFiles(files, "");
        }
    }
}
