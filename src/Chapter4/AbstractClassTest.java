package Chapter4;

import java.time.LocalDate;
import java.util.Random;

/**
 * Created by Elio Yang on 2020/7/5.
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        var people= new Person[2];
        people[0]=new absEmployee("Elio",2345.8,2020,4,23);
        people[1]=new Student("Jack","Math");
        for (Person p:people){
            System.out.println(p.getDescription());
            System.out.println(p.toString());
        }
    }
}
abstract class Person{
    private String name;
    public abstract String getDescription();

    public Person(String n){
        this.name=n;
    }
    public String getName() {
        return this.name;
    }
}
class absEmployee extends Person {
    private double salary;
    private LocalDate hireDay;

    //three constructors
    public absEmployee(String n, double s, int y, int m, int d) {
        super(n);
        this.salary = s;
        hireDay = LocalDate.of(y, m, d);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an employee with a salary of %.2f",salary);
    }

    public void raiseSalary(double byPercent){
        double raise=this.salary*byPercent/100;
        this.salary+=raise;
    }

    @Override
    public String toString() {
        return "absEmployee{" +
                "name="+getName()+
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}
class Student extends Person{
    private String major;
    public Student(String n,String m){
        super(n);
        this.major=m;
    }

    @Override
    public String getDescription() {
        return "a student major in"+this.major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                '}';
    }
}