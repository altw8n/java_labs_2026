/*Дан массив объектов File. Отсортируйте его так,
чтобы каталоги шли перед файлами, и внутри каждой группы элементы сортировались по пути.
Используйте лямбда-выражение для указания Comparator.*/

package org.example.chapter03.task13;

import java.io.File;
import java.util.Arrays;

public class FileSorter {
    public static void sortDirectoriesFirst(File[] files) {
        if (files == null || files.length == 0) {
            return;
        }
        Arrays.sort(files, (first, second) -> {
            boolean firstIsDir = first.isDirectory();
            boolean secondIsDir = second.isDirectory();
            if (firstIsDir && !secondIsDir) return -1;
            if (!firstIsDir && secondIsDir) return 1;
            return first.getPath().compareTo(second.getPath());
        });
    }

    public static void printFiles(File[] files, String title) {
        System.out.println(title);
        if (files == null || files.length == 0) {
            System.out.println("empty");
            return;
        }
        for (File f : files) {
            String type = f.isDirectory() ? "directory: " : "file: ";
            System.out.println("  " + type + " " + f.getName());
        }
        System.out.println();
    }
}
