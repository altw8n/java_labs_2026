package org.example.chapter03.task01;

public interface Measurable {
    double getMeasure();
    static double average(Measurable[] objects){
        if (objects == null || objects.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (Measurable obj : objects){
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }
}
