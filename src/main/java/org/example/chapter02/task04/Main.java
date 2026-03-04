/*Почему нельзя реализовать метод Java,
который меняет местами содержимое двух переменных типа int?
Вместо этого напишите метод, который меняет местами содержимое двух объектов IntHolder.
(Найдите этот довольно малоизвестный класс в документации API.)
Можете ли вы поменять местами содержимое двух объектов Integer?*/

package org.example.chapter02.task04;

class IntHolder {
    public int value;

    public IntHolder(int value) {
        this.value = value;
    }
}

public class Main {
    static void main() {
        int a1 = 5;
        int a2 = 3;
        System.out.println("before swap int: a = " + a1 + ", b = " + a2);
        swapInt(a1, a2);
        System.out.println("after swap int: a = " + a1 + ", b = " + a2);

        Integer b1 = 5;
        Integer b2 = 3;
        System.out.println("before swap Integer: a = " + b1 + ", b = " + b2);
        swapInteger(b1, b2);
        System.out.println("after swap Integer: a = " + b1 + ", b = " + b2);

        IntHolder c1 = new IntHolder(5);
        IntHolder c2 = new IntHolder(3);
        System.out.println("before swap IntHolder: a = " + c1.value + ", b = " + c2.value);
        swapIntHolder(c1, c2);
        System.out.println("after swap IntHolder: a = " + c1.value + ", b = " + c2.value);
    }

    public static void swapInt(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void swapInteger(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

    static void swapIntHolder(IntHolder a, IntHolder b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}
