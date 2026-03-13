/*Что произойдет, когда вы приводите double к int,
 который больше максимально возможного значения int?
 Попробуйте это сделать.*/

package org.example.chapter01.task05;

public class Main {
    public static void main() {
        double afterMax = Integer.MAX_VALUE + 1.0;
        double beforeMin = Integer.MIN_VALUE - 1.0;

        System.out.println("double after max: " + afterMax);
        System.out.println("double before min: " + beforeMin);

        int intAfterMax = (int) afterMax;
        int intBeforeMin = (int) beforeMin;

        System.out.println("int after max: " + intAfterMax);
        System.out.println("int before min: " + intBeforeMin);
    }
}
