import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList l = new ArrayList();

        for (int i =0; i<=10;i++)
        {
            l.add(i);
        }
        System.out.println(l);   // [0,1,2....10] will be the output

        Iterator iterator = l.iterator();
        while (iterator.hasNext())
        {
            Integer n = (Integer) iterator.next();
            if (n%2 ==0)
            {
                System.out.println(n);  // 0 2 4 6 8 10 will be the output
            }

            else
            {
                iterator.remove();
            }
        }
        System.out.println(l);  // [0,2,4,6,8,10]
    }
}
