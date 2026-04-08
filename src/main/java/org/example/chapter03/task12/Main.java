package org.example.chapter03.task12;

import java.io.File;

public class Main {
    static void main() {
        File currentDir = new File(".");
        System.out.println("dir: " + currentDir.getAbsolutePath());
        System.out.println();

        System.out.println(" .java:");
        String[] javaFiles = FileFinder.findFilesByExtension(currentDir, "java");
        printFiles(javaFiles);

        System.out.println("\n .txt:");
        String[] txtFiles = FileFinder.findFilesByExtension(currentDir, "txt");
        printFiles(txtFiles);
    }

    private static void printFiles(String[] files) {
        if (files == null || files.length == 0) {
            System.out.println("no files");
            return;
        }
        System.out.println("files: " + files.length);
        for (String file : files) {
            System.out.println("  - " + file);
        }
    }
}
