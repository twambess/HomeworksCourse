package Lesson19;

public class main {


    static public String[] abc(String[] ... a){
     int length=0;
        for(String[]b:a) {
            length += b.length;
        }
            String []target=new String[length];
        int count =0;
        for(String[] array2: a){
            for(String s: array2){
                target[count]=s;
                count++;
            }
        }
return target;
    }

    public static void main(String[] args) {

    }
}
