package Chapter4;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

/**
 * Created by Elio Yang on 2020/7/5.
 */
public class EqualsTest {
    public static void main(String[] args){
        equEmployee alice1=new equEmployee("Alice",2001.2,2020,3,23);
        equEmployee alice2=alice1;
        equEmployee alice3=new equEmployee("Alice",2001.2,2020,3,23);
        equEmployee bob= new equEmployee("Bob",2001.2,2020,3,24);

        System.out.println("alice1==alice2"+(alice1==alice2));
        System.out.println("alice1==alice3"+(alice1==alice3));
        System.out.println(alice1.equals(alice3));
        System.out.println(alice1.equals(bob));

        Manager carl= new Manager("Carl",2020.1,2020,3,24);
        Manager boss= new Manager("Carl",2020.1,2020,3,24);
        boss.setBones(500);

        System.out.println(boss.toString());
        System.out.println(carl.toString());

        System.out.println(carl.equals(boss));

        System.out.println(alice1.hashCode());
        System.out.println(alice3.hashCode());
        System.out.println(bob.hashCode());

        System.out.println(carl.hashCode());
        System.out.println(boss.hashCode());


    }
}

class equEmployee {
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

    //three constructors
    public equEmployee(String n, double s, int y, int m, int d) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(y, m, d);
    }

    public equEmployee(double s, int y, int m, int d) {
        this("Employee #" + nextId, s, y, m, d);
    }

    public equEmployee() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof equEmployee)) return false;
        equEmployee that = (equEmployee) o;
        return getId() == that.getId() &&
                Double.compare(that.getSalary(), getSalary()) == 0 &&
                getName().equals(that.getName()) &&
                getHireDay().equals(that.getHireDay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary(), getHireDay());
    }
}

class equManager extends equEmployee {
    private double bones;

    public equManager(String n, double salary, int y, int m, int d) {
        super(n, salary, y, m, d);
        bones = 0;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bones;
    }

    public void setBones(double bones) {
        this.bones = bones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof equManager)) return false;
        if (!super.equals(o)) return false;//from super class
        equManager that = (equManager) o;
        return Double.compare(that.bones, bones) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), bones);
    }
}
