/*Создайте файл HelloWorld.java, который объявляет класс HelloWorld в пакете ch01.sec01. Поместите его в какую-нибудь директорию, но не в поддиректорию ch01/sec01. Из этой директории скомпилируйте файл с помощью команды javac HelloWorld.java. Где находится сгенерированный файл класса? Что произойдет, если вы запустите java HelloWorld? Почему? (Подсказка: выполните команду java -classpath . HelloWorld, и всё станет ясно.)*/

package org.example.chapter01.task01;

public class HelloWorld {
    static void main() {
        System.out.println("hello world");
    }
}
