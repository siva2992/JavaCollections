import java.util.ArrayList;
import java.util.List;

public class Accessing_elements_in_ArrayList {

    public static void main(String[] args) {

        // isEmpty method

        List<String> list = new ArrayList<>();

        System.out.println("The arraylist is : "+ list.isEmpty());

        list.add("Abi");
        list.add("Baby");
        list.add("Kevin");
        list.add("Kyle");
        list.add("King");


        // size() - gives us the length of array list
        System.out.println("The size of arraylist is : " + list.size());

        // set()

        System.out.println("The value at index is replaced with : " + list.set(1, "Faced")); // sets the index with the value of F

        // get()
        System.out.println("The value at index : "+ list.get(2)); // gives us the value in the index 2

        // To remove the values that start with K
        list.removeIf(s -> s.startsWith("K"));

        System.out.println(list);
    }
}
