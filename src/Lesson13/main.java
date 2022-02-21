package Lesson13;

import org.w3c.dom.ls.LSOutput;

class Months{
    int a;
    Months(int a){
        this.a=a;
    }
}
public class main {
    public static void main(String[] args) {

        Months b = new Months(5);
        switch (b.a) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("29");
                break;
                case 3:
                    System.out.println("31");
                    break;
            default:
                System.out.println("drugie dni");

        }
    }
}
