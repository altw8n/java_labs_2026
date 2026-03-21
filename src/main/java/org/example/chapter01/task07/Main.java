/*Напишите программу, вводящую два числа в пределах от 0 до 65535,
сохраняющую их в переменных типа short и вычисляющую их
сумму, разность, произведение, частное и остаток без знака,
не преобразуя эти величины в тип int..*/

package org.example.chapter01.task07;
import java.util.Scanner;

public class Main {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        try {
            short first = (short) scanner.nextInt();
            short second = (short) scanner.nextInt();

            if (Short.compareUnsigned(first, (short) 65535) > 0 || Short.compareUnsigned(second, (short) 65535) > 0) {
                throw new IllegalArgumentException("не в диапазоне (0; 65535)");
            }

            short diff = (short) (first - second);
            System.out.println("разность: " + diff);

            short sum = (short) (first + second);
            if (Short.compareUnsigned(sum, first) < 0) {
                throw new ArithmeticException("переполнение при сложении (> 65535)");
            }
            System.out.println("сумма: " + (sum & 0xFFFF));
            //System.out.println("разность: " + (diff & 0xFFFF));

        } catch (ArithmeticException e) {
            System.out.println("error computations: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("input error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}