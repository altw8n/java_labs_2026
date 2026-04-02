package org.example.chapter03.task02;

public interface Measurable {
    double getMeasure();
    static double average(org.example.chapter03.task01.Measurable[] objects){
        if (objects == null || objects.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (org.example.chapter03.task01.Measurable obj : objects){
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }

    static Measurable largest(Measurable[] objects){
        if (objects == null || objects.length == 0){
            return null;
        }
        Measurable maxObject = objects[0];
        double maxMeasure = maxObject.getMeasure();
        for (Measurable object : objects) {
            if (object.getMeasure() > maxMeasure) {
                maxObject = object;
                maxMeasure = object.getMeasure();
            }
        }
        return maxObject;
    }
}