package Lesson16;

public class Car {


    public static void email(String s){
    int a,b,c=0;
    while(c<s.length()-1){
        a=s.indexOf('@',c);
        b=s.indexOf('.',c);
        c=s.indexOf(';',c+1);
        System.out.println(s.substring(a+1,b));
    }
    }
    public static void main(String[] args) {
       email("mama@yandex.ru; yadwjga@mail.ru; waddwaawdwad@gmail.com;");
    }
}
