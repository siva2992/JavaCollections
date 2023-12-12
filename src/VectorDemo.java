import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector v = new Vector(10);
        System.out.println(v.capacity());  // Initial capacity is 10

        for (int i =1; i<=10;i++)
        {
            v.addElement(i);
        }

        System.out.println(v.capacity());
        v.addElement("A"); // adding element on the 11th position will create a larger array size of 2 times the initial capacity of vector class.
        System.out.println(v.capacity());  // we can the capacity output as 20.
        System.out.println(v);
    }
}
