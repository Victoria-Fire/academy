package by.academy.classwork.lesson2;

public class Cat {
    String name;
    int age;
    double money;

    public Cat() {
        super();
    }

    public Cat(String name) {
        super();
        this.name = name;
    }

    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public Cat(String name, double money) {
        super();
        this.name = name;
        this.money = money;
    }

    public Cat(String name, int age, double money) {
        super();
        this.name = name;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void sleep(int hours) {
        System.out.println(name + " спит " + hours + " часов в день");

    }

    public void eat(String food) {
        System.out.println(name + " кушает " + food);

    }

    public void walk() {
        System.out.println(name + " гуляет по природе");

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cat [name=");
        builder.append(name);
        builder.append(", age=");
        builder.append(age);
        builder.append(", money=");
        builder.append(money);
        builder.append("]");
        System.out.println();
        return builder.toString();
    }
}
