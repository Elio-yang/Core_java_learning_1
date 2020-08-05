package chapter6interface;

import java.util.Arrays;

public class EmployeeSort {
    public static void main(String[] args) {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee("harry",3900);
        staff[1]=new Employee("elio", 3600);
        staff[2]=new Employee("jack", 3800);

        Arrays.sort(staff);

        for (Employee employee : staff) {
            System.out.println(employee.toString());
        }
    }
}

class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String aname,double asalary){
        this.name=aname;
        this.salary=asalary;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double percent) {
        double raise=salary *percent/100;
        salary+=raise;
    }
    public int compareTo(Employee otherEmployee) {
        return Double.compare(salary, otherEmployee.salary);
    }
    @Override
    public String toString() {
        return "[name="+this.getName()+
                ", salary="+this.getSalary()+
                "]";
    }
}