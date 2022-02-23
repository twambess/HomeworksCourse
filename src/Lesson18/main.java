package Lesson18;

import java.util.Arrays;

public class main {
    static public int[] sortirovka(int[] array){
        Arrays.sort(array);
       return array;
    }

    public static void showArray(String[][] s){
        System.out.print("{");
        for(int i=0;i<s.length;i++){
            System.out.print("{");
            for(int j=0;j<s[i].length;j++){
                if(j!=s[i].length-1)
                System.out.print(s[i][j]+",");
                else
                    System.out.print(s[i][j]);

            }
            System.out.print("}");
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        int array1[]=new int []{9,4,5,7,3,1,6,0,4,2};
        sortirovka(array1);
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        showArray(new String[][]{{"somestring1","somestring2"},{"somestring3"},{"smestring4"}});
    }
}
