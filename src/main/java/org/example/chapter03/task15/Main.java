package org.example.chapter03.task15;

public class Main {
    static void main() {
        Employee[] emp = {
                new Employee("s", 12),
                new Employee("a", 3),
                new Employee("r", 34),
                new Employee("b", 1),
                new Employee("w", 1),
                new Employee("a", 1)
        };
        printArray(emp);

        Employee[] copy1 = emp.clone();
        EmployeeSorter.sortBySalary(copy1);
        System.out.println("\nпо возрастанию зарплаты, затем по имени:");
        printArray(copy1);

        Employee[] copy2 = emp.clone();
        EmployeeSorter.sortBySalaryReversed(copy2);
        System.out.println("\nпо убыванию зарплаты, затем по имени:");
        printArray(copy2);
    }

    private static void printArray(Employee[] arr) {
        for (Employee e : arr) {
            System.out.println("  " + e);
        }
    }
}
