package Lesson17;

public class mai {

    public static boolean ravenstvo(StringBuilder sb1,StringBuilder sb2){
    boolean t;
    String s1=new String(sb1);
    String s2=new String(sb2);
    if(s1.equals(s2))
        t=true;
    else
        t=false;
        return t;
    }

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        System.out.println(ravenstvo(sb1,sb2));
    }
}
