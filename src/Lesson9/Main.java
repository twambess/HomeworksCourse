package Lesson9;

public class Main {

    int a=1;
    static int b=2;
    static void abc(final int a){
        System.out.println(a);
        System.out.println(Main.b);
    }
    public static void main(String[] args) {

        Main m1 = new Main();
        Main m2 = new Main();
        Main m3 = new Main();
        Main m4 = new Main();
        Main m5 = new Main();
        Main m6 = new Main();
        Main m7 = new Main();
        Main m8 = new Main();
abc(5);
        m1=null;
        m5=null;
        m4=null;
        m3=null;
        m2=null;
    }
}
