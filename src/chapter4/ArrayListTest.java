package chapter4;

import java.util.ArrayList;

/**
 *
 * @author Elio Yang
 * @date 2020/7/6
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<EquEmployee> stuff= new ArrayList<> ();
        stuff.add(new EquEmployee("Elio",2002.3,2020,3,24));
        stuff.add(new EquEmployee("Carl",2002.3,2020,3,24));
        stuff.add(new EquEmployee("Bob",2002.3,2020,3,24));

        for (EquEmployee e:stuff){
            System.out.println(e.toString());
        }
    }
}
