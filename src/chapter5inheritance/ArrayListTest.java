package chapter5inheritance;

import java.util.ArrayList;

/**
 *
 * @author Elio Yang
 * @date 2020/7/6
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<EquEmployee> staff=new ArrayList<>();
        //without var new ArrayList<>();is OK
        staff.add(new EquEmployee("Elio",1234.4,2020,1,1));
        staff.add(new EquEmployee("Carl",1234.4,2020,1,1));
        System.out.println(staff.size());
        staff.add(new EquEmployee("Jack",1234.4,2020,1,1));
        staff.add(new EquEmployee("Rose",1234.4,2020,1,1));
        EquEmployee e=staff.get(2);
        System.out.println(e.toString());

        EquEmployee[] staArray=new EquEmployee[staff.size()];
        staff.toArray(staArray);
        for (EquEmployee E:staArray){
            System.out.println(E.toString());
        }

        double[] nums=new double[]{1,3,4,6.7,99};
        System.out.println(max(nums));

    }
    public static double max(double... numbers){
        double largest=Double.NEGATIVE_INFINITY;
        for (double v:numbers){
            if (v>largest){
                largest=v;
            }
        }
        return largest;
    }
}
