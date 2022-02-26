package Lesson22;

public class Test {

    public static void main(String[] args) {
        Dog dog=new Dog("huila");
        Cat cat=new Cat("Ublyudok");
        System.out.println(dog.paw);
        cat.sleep();
    }
}

class Animal{
   public Animal(){
       System.out.println("I am animal");
    }
    int eyes;
   public void eat(){
       System.out.println("Animal eats");
   }
   public void drink(){
       System.out.println("Animal drinks");
   }
}
class Pets extends Animal{
    public Pets(){
        System.out.println("I am a pet");
        this.eyes=2;
    }
    String name;
    int tail=1;
    int paw=4;
    public void run(){
        System.out.println("Pet runs");
    }
    public void jump(){
        System.out.println("Pet jumps");
    }
}

class Dog extends Pets{
    public Dog(String name){
        this.name=name;
        System.out.println("I am a dog and my name is : "+name);
    }

    public void play(){
        System.out.println("Dog plays");
    }

}

class Cat extends Pets{
    public Cat(String name){
        this.name=name;
        System.out.println("I am a cat and my name is : "+name);
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

