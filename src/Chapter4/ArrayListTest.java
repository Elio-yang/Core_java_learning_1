package Chapter4;

import java.util.ArrayList;

/**
 * Created by Elio Yang on 2020/7/6.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<equEmployee> stuff= new ArrayList<> ();
        stuff.add(new equEmployee("Elio",2002.3,2020,3,24));
        stuff.add(new equEmployee("Carl",2002.3,2020,3,24));
        stuff.add(new equEmployee("Bob",2002.3,2020,3,24));

        for (equEmployee e:stuff){
            System.out.println(e.toString());
        }
    }
}
