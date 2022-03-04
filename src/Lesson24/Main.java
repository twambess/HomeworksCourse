package Lesson24;

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    abstract void swim();

    void eat() {
        System.out.println("Всегда интересно наблюдать как спит рыба");
    }
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " sing");
    }

    abstract void fly();
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speak");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("меч спит");
    }

    public void eat() {
        System.out.println("меченосец не хищная рыба, она ест только корм");
    }

    public void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Пингвин любит есть");
    }

    void sleep() {
        System.out.println("пингвины спят прижавшись друг к другу");
    }

    void fly() {
        System.out.println("Пингвины не летают");
    }

    public void speak() {
        System.out.println("Пингвины не поют");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }
    void run(){
        System.out.println("Лев не самый быстрый кошак");
    }
    void eat() {
        System.out.println("Лев как любой хищник любит мясо");
    }

    void sleep() {
        System.out.println("Большую часть дня лев спит");
    }
}

public class Main {
    public static void main(String[] args) {
        Mechenosec mech=new Mechenosec("Krasavchik");
        System.out.println(mech.name);
        mech.eat();
        mech.sleep();
        mech.swim();
        Speakable pin=new Pingvin("Kurica");
        pin.speak();
        Animal lev=new Lev("Ublyudok");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();
        Mammal lev2=new Lev("Vtoroi");
        System.out.println(lev2.name);
        lev2.run();
        lev2.eat();
        lev2.sleep();
        lev2.speak();
    }
}
