/*В разделе 1.5.3 был пример двух строк s и t таких,
 что s.equals(t) но s != t. Придумайте другой пример,
  который не использует substring.*/

/*
ab
a
b
 */

package org.example.chapter01.task09;

import java.util.Scanner;

public class Main {
    public static void main(){
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        String str2 = s1 + s2;
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
    }
}
