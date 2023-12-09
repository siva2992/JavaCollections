import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("A");
        l.add("90");
        l.add("A");
        l.add(null);
        System.out.println(l);
        /*IN Array List duplicates are allowed and insertion order is preserved, so we get the
        output : [A, 90, A, null] - null values are allowed in array list */

        l.remove(2);
        System.out.println(l);
        /* The value at index 2 is removed, and we get the output as [A, 90, null] */

        l.add(2,"D");
        System.out.println(l);

        /* This will help us to add the value of D at index 2 . so we get the output as [A,90,D,null]  */

        l.add("M");
        System.out.println(l);

        /* This will add value M at the last index and we get the ouput as : [A, 90, D, null, M] */


    }
}