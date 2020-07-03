package Chapter4;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by Elio Yang on 2020/6/12.
 */
public class employee_test_4_3_1 {
    static class Employee {
        private final String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(String n, double s, int year, int month, int day) {
            //Objects.requireNonNull(n,"The name can't be null");
            name= Objects.requireNonNullElse(n,"unknown");
            //name=n;
            salary=s;
            hireDay=LocalDate.of(year,month,day);
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
    }

    public static void main(String[] args) {
        Employee[] staff=new Employee[3];
        staff[0]=new Employee(null,2345.8,2001,9,23);
        staff[1]=new Employee("Elio",2245.8,2002,6,22);
        staff[2]=new Employee("David",4567.9,2000,2,20);

        for (Employee e:staff){
            e.raiseSalary(5);
        }
        for (Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hired day="+e.getHireDay());
        }
    }
}
