package Lesson25;

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
       Animal [] arrayA={new Pingvin("Kurica"),new Lev("Ganry"),new Mechenosec("Bob")};
       Speakable[] arrayS={new Pingvin("Ptica"), new Lev("ganry")};
       for(Animal e:arrayA){
           if(e instanceof Fish){
               System.out.println(e.name);
               e.eat();
               e.sleep();
               ((Fish)e).swim();
           }
           if(e instanceof Mammal){
               System.out.println(e.name);
               e.eat();
               e.sleep();
               ((Mammal) e).speak();
               ((Mammal) e).run();
           }
           if(e instanceof Bird){
               System.out.println(e.name);
               e.eat();
               e.sleep();
               ((Bird) e).fly();
               ((Bird) e).speak();
           }
       }
       for(Speakable e:arrayS){
           if(e instanceof Bird){
               System.out.println(((Bird) e).name);
             ((Bird) e).eat();
             ((Bird) e).sleep();
             e.speak();
             ((Bird) e).fly();
           }
           if(e instanceof Mammal){
               System.out.println(((Mammal)e).name);
               ((Mammal)e).eat();
               ((Mammal)e).sleep();
               ((Mammal)e).run();
               e.speak();
           }
       }
    }
}
