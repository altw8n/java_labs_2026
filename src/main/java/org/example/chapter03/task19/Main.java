package org.example.chapter03.task19;

interface TenParameterFunction {
    int apply(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j);
}

public class Main {
    public static void main() {

        TenParameterFunction func = (a, b, c, d, e, f, g, h, i, j) ->
                a + b + c + d + e + f + g + h + i + j;


        int sum = func.apply(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(sum);
    }
}