/*Используя метод list(FilenameFilter) класса java.io.File,
напишите метод, который возвращает все файлы в данном каталоге с заданным расширением.
Используйте лямбда-выражение, а не FileNameFilter.
Какую переменную из объемлющей области видимости оно захватывает?*/

package org.example.chapter03.task12;

import java.io.File;

public class FileFinder {
    public static String[] findFilesByExtension(File directory, String extension) {
        if (directory == null || !directory.isDirectory() || extension == null) {
            return new String[0];
        }

        String ext = extension.startsWith(".") ? extension.substring(1) : extension;

        return directory.list((dir, name) ->
                name.toLowerCase().endsWith("." + ext.toLowerCase()));
    }
}
