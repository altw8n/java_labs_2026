package org.example.chapter03.task08;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static void main() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("s");
        arr.add("h");
        arr.add("c");
        arr.add("k");
        arr.add("a");
        System.out.println(arr);
        LuckySorter.luckySort(arr, Comparator.naturalOrder());
        System.out.println(arr);
    }
}
