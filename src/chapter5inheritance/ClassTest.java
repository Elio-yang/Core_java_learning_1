package chapter5inheritance;

import java.util.Random;

/**
 * @author Elio
 * @date 2020/7/29
 */
public class ClassTest {
    public static void main(String[] args) {
        EquEmployee e1=new EquEmployee("Elio",1234,2020,1,1);
        EquEmployee e2=new EquEmployee("Jack",1234,2020,1,1);
        Manager m1=new Manager("Jason",1234,2020,1,1);
        Manager m2=new Manager("Rose",1234,2020,1,1);

        System.out.println(e1.getClass().getName()+ " " +e1.getName());
        System.out.println(m1.getClass().getName()+ " " +m1.getName());
        Random generator=new Random();
        String name=generator.getClass().getName();
        System.out.println(generator.getClass().getName());

        if (e1.getClass()==EquEmployee.class){
            System.out.println("true");
        }







    }
}
