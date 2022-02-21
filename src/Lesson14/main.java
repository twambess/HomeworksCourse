package Lesson14;

public class main {

    static void vremya(){
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<60;j++){
                if(i>1 && j%10==0){
                    break;
                }
                for(int s=0;s<60;s++){
                    if (s*j<i){
                        continue;
                    }
                    System.out.println(i+ ":"+j+":"+s);
                }
            }
        }

    }
    public static void main(String[] args) {
        vremya();

    }
}
