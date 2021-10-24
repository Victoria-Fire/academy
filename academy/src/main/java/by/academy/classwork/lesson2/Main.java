package by.academy.classwork.lesson2;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 7, 500);
        System.out.println(cat1);
        cat1.sleep(8);
        cat1.eat("рыбку");
        cat1.walk();

        Cat cat2 = new Cat();

        Cat cat3 = new Cat("Васька", 3);
        System.out.println(cat3);
        cat1.sleep(12);
        cat1.eat("курочку");
        cat1.walk();

        Cat cat4 = new Cat("Маргоша", 2500.0);
        System.out.println(cat4);

    }

}
