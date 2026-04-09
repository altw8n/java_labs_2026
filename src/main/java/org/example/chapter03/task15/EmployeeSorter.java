/*Напишите вызов Arrays.sort, который сортирует сотрудников по зарплате,
разрешая равенство по имени. Используйте Comparator.thenComparing.
Затем сделайте это в обратном порядке.*/

package org.example.chapter03.task15;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSorter {
    public static void sortBySalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return;
        }
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName));        // затем по имени
    }

    public static void sortBySalaryReversed(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            return;
        }
        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName));
    }
}