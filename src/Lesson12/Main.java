package Lesson12;

class Student{
    String name;
    int course;
    int grade;

    public Student(String name,int course,int grade){
        this.name=name;
        this.course=course;
        this.grade=grade;
    }
    public static void sravn(Student s1,Student s2){
        if(s1.name.equals(s2.name) && (s1.course==s2.course) && (s1.grade==s2.grade))
        {
            System.out.println("Studenti ravni");
        }
        else
            System.out.println("Studenti ne ravni");
    }
    public static void sravnkaj(Student s1,Student s2){
        if(s1.name.equals(s2.name)){
            System.out.println("Imena ravni");
        }
        else
            System.out.println("Imena raznie");
        if(s1.course==s2.course){
            System.out.println("Kurs odin");
        }
        else
            System.out.println("kurs razniy");
        if(s1.grade==s2.grade)
            System.out.println("ocenka odna");
        else
            System.out.println("ocenka raznaya");
    }

}


public class Main {
    public static void main(String[] args) {
        Student s1=new Student("a",3,5);
        Student s2=new Student("a",3,5);
        Student s3=new Student("a",3,5);

        Student.sravnkaj(s1,s3);
    }
}
