package org.example.chapter03.task11;

import java.io.File;
import java.io.FileFilter;

public class DirectoryLister {
    public static File[] getSubdirectoriesLambda(File dir) {
        if (dir == null || !dir.isDirectory()) {
            return new File[0];
        }
        FileFilter filter = file -> file.isDirectory();
        return dir.listFiles(filter);
    }

    public static File[] getSubdirectoriesMethodReference(File dir) {
        if (dir == null || !dir.isDirectory()) {
            return new File[0];
        }
        FileFilter filter = File::isDirectory;
        return dir.listFiles(filter);
    }

    public static File[] getSubdirectoriesAnonymousClass(File dir) {
        if (dir == null || !dir.isDirectory()) {
            return new File[0];
        }
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.isDirectory();
            }
        };
        return dir.listFiles(filter);
    }
}
