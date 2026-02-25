/*Напишите switch-выражение, которое,
 получив строку с направлением компаса "N", "S", "E" или "W",
 возвращает массив смещений по x и y.
 Например, "W" должно вернуть new int[] { -1, 0 }.*/

package org.example.chapter01.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("enter direction (N, S, E, W): ");
        String direction = in.nextLine();

        int[] offset = switch (direction) {
            case "N" -> new int[]{0, 1};
            case "S" -> new int[]{0, -1};
            case "E" -> new int[]{1, 0};
            case "W" -> new int[]{-1, 0};
            default -> new int[]{0, 0};
        };

        System.out.println(Arrays.toString(offset));
    }
}
