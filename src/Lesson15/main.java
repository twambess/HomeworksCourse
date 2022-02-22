package Lesson15;

public class main {

    static void vremya(){
        int i=0;


        while (i<6)
        {
            int j=-1;
            do
            {
                j++;
                if(i>1 && j%10==0){
                    break;
                            }
                int s=0;
                while(s<60)
                {
                    if (s*j<i){
                        continue;
                    }
                    System.out.println(i+ ":"+j+":"+s);
                    s++;
                }

            }while(j<59);
            i++;
        }

    }
    public static void main(String[] args) {
        vremya();

    }
}
