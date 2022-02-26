package Lesson22;

public class StudentTest{
    public static void main(String[] args) {
        Student s=new Student();
        s.setName(new StringBuilder("Ilya"));
        s.setCourse(4);
        s.setGrade(3);
        s.showInfo();
    }
}

    class Student {
    private StringBuilder name = new StringBuilder();
    private int course,grade;

    public StringBuilder getName(){
        StringBuilder sb=new StringBuilder(name);
        return sb;
    }

    public int getCourse(){
        return course;
    }
    public int getGrade(){
        return grade;
    }
    ////////////////////////
    public void setName(StringBuilder s){
        if(s.length()>=3)
            this.name=s;
    }
    public void setCourse(int i){
        if( i<5)
            this.course=i;
    }
    public void setGrade(int i){
        if(i<10 && i>0)
            this.grade=i;
    }
    public  void showInfo(){
        System.out.println("Name="+this.getName());
        System.out.println("Course="+this.getCourse());
        System.out.println("Grade="+this.getGrade());
    }


}
