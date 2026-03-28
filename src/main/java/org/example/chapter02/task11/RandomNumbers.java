/*В классе RandomNumbers предоставьте два статических метода randomElement,
 которые получают случайный элемент из массива или списка (ArrayList) целых чисел.
(Возвращайте ноль, если массив или список пусты.)
 Почему нельзя было сделать эти методы методами экземпляра int[] или ArrayList<Integer>*/

package org.example.chapter02.task11;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    private static final Random random = new Random();

    public static int randomElement(int[] array){
        if (array == null || array.length == 0){
            return 0;
        }
        int randomInd = random.nextInt(array.length);
        return array[randomInd];
    }

    public static int randomElement(ArrayList<Integer> array){
        if (array == null || array.isEmpty()){
            return 0;
        }
        int randomInd = random.nextInt(array.size());
        return array.get(randomInd);
    }
}
