package org.example.chapter03.task02;

import org.example.chapter03.task02.Employee;
import org.example.chapter03.task02.Measurable;

public class Main {
    static void main() {
        Employee[] employees = {new Employee("a", 100), new Employee("b", 200), new Employee("c", 300)};
        double averageSalary = Measurable.average(employees);
        System.out.println(averageSalary);
        Employee maxEmployee = (Employee) Measurable.largest(employees);
        System.out.println(maxEmployee.getName() + "  " + maxEmployee.getSalary());
    }
}
