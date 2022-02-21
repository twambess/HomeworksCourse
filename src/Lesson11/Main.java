package Lesson11;

class Car{
    String color;
    String engine;
   public  int doors;

   Car(){

   }

   Car(String color, String engine, int doors){
       this.color=color;
       this.engine=engine;
       this.doors=doors;
   }
}

class CarTest{

    public static void zamena(Car c,int doors){
        c.doors=doors;
        System.out.println("doors has been changed");
    }

    public static void zamenaColor(Car c,Car b){
        Car a=new Car();
        a.color=c.color;
        c.color=b.color;
        b.color=a.color;
        System.out.println("color has been changed");
    }


    public static void main(String[] args) {
        Car a = new Car("red","v9",4);
        Car b = new Car("black","d2",2);
        System.out.println(a.color+ " "+a.engine+ " "+a.doors);
        System.out.println(b.color+ " "+b.engine+ " "+b.doors);

        zamena(a,8);
        zamenaColor(a,b);
        System.out.println(a.color+ " "+a.engine+ " "+a.doors);
        System.out.println(b.color+ " "+b.engine+ " "+b.doors);

}
}