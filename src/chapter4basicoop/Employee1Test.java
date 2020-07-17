package chapter4basicoop;

import java.time.LocalDate;

/**
 *
 * @author Elio Yang
 * @date 2020/6/12
 */
public class Employee1Test {
    public static void main(String[] args) {
        Employee1[] staff=new Employee1[3];
        staff[0]=new Employee1(null,2345.8,2001,9,23);
        staff[1]=new Employee1("Elio",2245.8,2002,6,22);
        staff[2]=new Employee1("David",4567.9,2000,2,20);

        for (Employee1 e:staff){
            e.raiseSalary(5);
        }
        for (Employee1 e:staff){
            System.out.println(e.toString());
        }
    }
}
class Employee1 {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee1(String n, double s, int year, int month, int day) {
        if (n==null){
            name="unknown";
        }
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise=this.salary*byPercent/100;
        this.salary+=raise;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}