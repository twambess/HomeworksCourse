package Lessson30;
import java.util.ArrayList;
import java.util.function.*;
public class TestEmployee {
    public void printEmployee(Employee e){
        System.out.println("name of person: "+e.name+" ,department: "+e.department+" ,and salary: "+e.salary);
    }
    public void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> t){
        for(Employee e:aL)    /////////////////////////////   LYAMBDA
            if(t.test(e))       ///////////////////////////
                printEmployee(e);

    }

    public static void main(String[] args) {
        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee("Vasya","IT",200));
        list.add(new Employee("Evan","IT",450));
        list.add(new Employee("Masha","IT",500));
        list.add(new Employee("Evpatiy","MN",200));
        list.add(new Employee("Natasha","HR",150));
        list.add(new Employee("HR","HR",150));

   //     System.out.println(list.get(1).department==list.get(2).department);
        TestEmployee t=new TestEmployee();
        t.filtraciyaRabotnikov(list, emp-> (emp.department=="IT" && emp.salary>200));
        System.out.println("------------------------------------");
        t.filtraciyaRabotnikov(list,emp-> (emp.name.startsWith("E")&& emp.salary!=450));
        System.out.println("------------------------------------");
        t.filtraciyaRabotnikov(list,emp->emp.name==emp.department);
    }
}


class Employee{
    String name;
    String department;
    double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
