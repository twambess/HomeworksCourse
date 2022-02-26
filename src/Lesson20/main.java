package Lesson20;

import java.util.ArrayList;
import java.util.Collections;


public class main {
        public static ArrayList<String> abc(String ... s){
//            int length=0;
//            for(String b:s) {
//                length += b.length();
//            }
            ArrayList<String> array =new ArrayList<>();
            for(String c:s){
                if(!array.contains(c)) {

                    array.add(c);
                }
//            for (int i=0;i<array.size();i++){
//                for (int j=1;j<array.size()-i;j++){
//                    if(array.get(i)==array.get(j+i)) {// ya hz kak no ono rabotaet
//
//                        array.remove(j+i);
//                    }
//                    }
//                }
            }
            Collections.sort(array);
            return array;
        }


    public static void main(String[] args) {

        System.out.println(abc("Hello","bye","friend","1","2","3","3","3","Hello","freind","friend"));

    }
}
