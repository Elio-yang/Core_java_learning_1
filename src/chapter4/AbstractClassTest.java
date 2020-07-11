package chapter4;

import java.time.LocalDate;

/**
 * @author Elio Yang
 * @date 2020/7/5
 */
public class AbstractClassTest {
    public static void main(String[] args) {
        AbstractPerson[] people = new AbstractPerson[2];
        people[0] = new AbsEmployee("Elio", 2345.8, 2020, 4, 23);
        people[1] = new Student("Jack", "Math");
        for (AbstractPerson p : people) {
            System.out.println(p.getDescription());
            System.out.println(p.toString());
        }
    }
}

abstract class AbstractPerson {
    private final String name;

    /**
     * get a description of an AbstractPerson class object
     * @return String to describe
     */
    public abstract String getDescription();

    public AbstractPerson(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }
}

class AbsEmployee extends AbstractPerson {
    private double salary;
    private final LocalDate hireDay;

    /**
     *
     * @param n name.
     * @param s salary.
     * @param y year.
     * @param m month
     * @param d day.
     */
    public AbsEmployee(String n, double s, int y, int m, int d) {
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

class Student extends AbstractPerson {
    private String major;

    public Student(String n, String m) {
        super(n);
        this.major = m;
    }

    @Override
    public String getDescription() {
        return "a student major in" + this.major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                '}';
    }
}