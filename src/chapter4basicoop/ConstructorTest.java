package chapter4basicoop;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Elio Yang
 * @date 2020/7/3
 */
public class ConstructorTest {
    public static void main(String[] args) {
        EquEmployee[] stuff = new EquEmployee[3];
        stuff[0] = new EquEmployee("Harry", 4000, 2016, 3, 23);
        stuff[1] = new EquEmployee(6000, 2016, 2, 23);
        stuff[2] = new EquEmployee();

        for (EquEmployee e : stuff) {
            System.out.println(e.toString());
        }
    }
}

class Employee {
    private static int nextId;
    private int id;
    private String name = "";
    private double salary;
    private LocalDate hireDay;

    //initialize static
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //initialize objects
    {
        id = nextId;
        nextId++;
    }

    /***
     *
     * @param n name.
     * @param s salary.
     * @param y year.
     * @param m month
     * @param d day.
     */
    public Employee(String n, double s, int y, int m, int d) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(y, m, d);
    }

    public Employee(double s, int y, int m, int d) {
        this("Employee #" + nextId, s, y, m, d);
    }

    public Employee() {
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", salary=" + this.getSalary() +
                ", hireDay=" + this.getHireDay() +
                '}';
    }
}
