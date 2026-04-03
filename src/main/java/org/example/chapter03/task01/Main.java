package org.example.chapter03.task01;

import org.example.chapter03.task01.Employee;
import org.example.chapter03.task01.Measurable;

public class Main {
    static void main() {
        Employee[] employees = {new Employee("a", 100), new Employee("b", 200), new Employee("c", 300)};
        double averageSalary = Measurable.average(employees);
        System.out.println(averageSalary);
    }
}