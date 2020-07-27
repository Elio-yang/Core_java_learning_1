package chapter5inheritance;

import java.time.LocalDate;

/**
 * @author Elio Yang
 * @date 2020/7/5
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        AbstractPerson[] people = new AbstractPerson[2];
        //not instance
        people[0] = new AbsEmployee("Elio", 2345.8, 2020, 4, 23);
        people[1] = new AbsStudent("Jack", "Math");
        //from son class to super abstract class :polymorphism
        for (AbstractPerson p : people) {
            System.out.println(p.getDescription());
            System.out.println(p.toString());
        }
    }
}

/**
 * this is an abstract class
 * You can't make an instance of an abstract class
 * but you can build an object of son class.
 */
abstract class AbstractPerson {
    private final String name;

    /**
     * get a description of an AbstractPerson class object
     * @return String to describe
     */
    public abstract String getDescription();
    //no implementation needed as an abstract method.

    public AbstractPerson(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

class AbsEmployee extends AbstractPerson {
    private double salary;
    private final LocalDate hireDay;

    public AbsEmployee(String n, double s, int y, int m, int d) {
        super(n);
        //call the constructor in super class with param n
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
        return String.format("an employee with a salary of %.2f", salary);
    }

    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    @Override
    public String toString() {
        return "absEmployee{" +
                "name=" + getName() +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }
}

class AbsStudent extends AbstractPerson {
    private String major;

    public AbsStudent(String n, String m) {
        super(n);
        //call super class constructor with param n type String
        this.major = m;
    }
    @Override
    public String getDescription() {
        return String.format("a student with major %s",this.major);
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                '}';
    }
}