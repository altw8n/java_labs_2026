/*Может ли метод-мутатор возвращать что-то кроме void?
Может ли метод-акцессор возвращать void?
Приведите примеры, где это возможно.*/

package org.example.chapter02.task03;

class Employee {
    private final String name;
    private int salary;

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    //acssesor
    public void printData(){
        System.out.println(salary);
        System.out.println(name);
    }

    //mutator
    public int changeSalary(int newSalary){
        int oldSalary = salary;
        salary = newSalary;
        return oldSalary;
    }

}

public class Main {
    static void main() {
        var emp = new Employee("meow", 123);
        emp.printData();
        System.out.println(emp.changeSalary(255));
        emp.printData();
    }
}
