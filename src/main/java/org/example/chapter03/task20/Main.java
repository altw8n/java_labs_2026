package org.example.chapter03.task20;

interface Sound {
    default void makeSound(){
        System.out.println("sound");
    }
}

class Cat implements Sound {
    public void makeSound() {
        System.out.println("meow");
    }

    public void purr() {
        System.out.println(" is purring: mrrr-mrrr");
    }
}

class Dog implements Sound {
    public void makeSound() {
        System.out.println("woof");
    }
}

class Car implements Sound {
    public void makeSound() {
        System.out.println("rrrrrr");
    }
}

public class Main {
    static void main() {
        Sound cat = new Cat();
        Sound dog = new Dog();
        Sound car = new Car();
        Sound[] arr = {cat, dog, car};
        for (Sound i : arr) {
            if (i instanceof Cat) {
                Cat realCat = (Cat) i;
                realCat.purr();
                realCat.makeSound();
                Sound cat1 = realCat;
                cat1.makeSound();
            }
        }
    }
}
