/*Реализуйте метод void luckySort(ArrayList<String> strings, Comparator<String> comp),
который продолжает вызывать Collections.shuffle на списке массивов до тех пор,
пока элементы не будут в порядке возрастания, как определено компаратором.*/

package org.example.chapter03.task08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySorter {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (!isSorted(strings, comp)) {
            Collections.shuffle(strings);
        }
    }

    private static boolean isSorted(ArrayList<String> list, Comparator<String> comp) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (comp.compare(list.get(i), list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }
}
