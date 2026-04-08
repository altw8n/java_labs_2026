/*Используя методы listFiles(FileFilter)
и isDirectory класса java.io.File, напишите метод,
который возвращает все подкаталоги данного каталога.
Используйте лямбда-выражение вместо объекта FileFilter.
Повторите с ссылкой на метод и анонимным внутренним классом.
*/

package org.example.chapter03.task11;

import java.io.File;

public class Main {
    public static void main() {
        File currentDir = new File(".");
        System.out.println("directory: " + currentDir.getAbsolutePath());
        System.out.println();

        System.out.println("lambda");
        File[] dirs1 = DirectoryLister.getSubdirectoriesLambda(currentDir);
        printDirs(dirs1);

        System.out.println("\nmethod reference");
        File[] dirs2 = DirectoryLister.getSubdirectoriesMethodReference(currentDir);
        printDirs(dirs2);

        System.out.println("\nanonymous class");
        File[] dirs3 = DirectoryLister.getSubdirectoriesAnonymousClass(currentDir);
        printDirs(dirs3);
    }

    private static void printDirs(File[] dirs) {
        if (dirs.length == 0) {
            System.out.println("empty");
            return;
        }

        System.out.println("directories: " + dirs.length);
        for (File d : dirs) {
            System.out.println("  - " + d.getName());
        }
    }
}