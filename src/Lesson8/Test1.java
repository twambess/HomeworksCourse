package Lesson8;

class Student{
    public static int method1(int a,int b, int c){
        return a*b*c;
    }
    public static void meth2(int a, int b){
        System.out.println("div="+(a/b));
        System.out.println("mod="+ a%b);
    }
    static final double pi=3.14;

}

class test{
    public double meth3(int r){
        double s=Student.pi*r*r;
        return s;
    }
    public static double meth4(int r){
        double s=2*Student.pi*r;
        return s;
    }
    public void meth5(int r){
        System.out.println(r);
        System.out.println(meth4(r));
        System.out.println(meth3(r));
    }
    public static void main(String[] args) {
        System.out.println(Student.method1(5,2,3));
        System.out.println(Student.method1(5,10,10));
        Student.meth2(23,20);
        test s= new test();
        s.meth5(10);
    }
}


