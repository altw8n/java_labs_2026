package org.example.chapter01.task25;

import java.math.BigInteger;

public class Main {
    static void main() {
        MyBigDecimal num1 = new MyBigDecimal(BigInteger.valueOf(12345), 2);
        MyBigDecimal num2 = new MyBigDecimal(BigInteger.valueOf(11), 1);
        MyBigDecimal sum = num1.add(num2);
        System.out.println(sum.toString());
        MyBigDecimal sub = num1.subtract(num2);
        System.out.println(sub.toString());
        MyBigDecimal mult = num1.multiply(num2);
        System.out.println(mult.toString());
        MyBigDecimal div = num1.divide(num2, 2);
        System.out.println(div.toString());
    }
}
