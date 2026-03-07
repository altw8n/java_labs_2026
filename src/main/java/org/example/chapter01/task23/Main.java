package org.example.chapter01.task23;

public class Main {
    static void main() {
        int i = 0;
        for (;;){
            if (i >= 5){
                break;
            }
            System.out.println(i);
            i++;
        }

        int j = 0;
        for (;j < 3;){
            System.out.println(j);
            j++;
        }
    }
}
