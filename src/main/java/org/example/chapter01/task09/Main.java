/*В разделе 1.5.3 был пример двух строк s и t таких,
 что s.equals(t) но s != t. Придумайте другой пример,
  который не использует substring.*/

package org.example.chapter01.task09;

public class Main {
    public static void main(String[] args){
        String str1 = "HelloWorld";
        String s1 = "Hello";
        String s2 = "World";
        String str2 = s1 + s2;
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
        System.out.println(str1 != str2);
    }
}
