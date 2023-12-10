import java.util.ArrayList;
import java.util.List;

public class Creating_an_ArrayList_from_another_collection {

    public static void main(String[] args) {

        List<String> first_list = new ArrayList<>();
        first_list.add("Ravi");
        first_list.add("is");
        first_list.add("good");
        first_list.add("guy.");

        List<String> second_list = new ArrayList<>();
        second_list.add("He");
        second_list.add("also");
        second_list.add("innocent.");

        first_list.addAll(second_list);

        System.out.println(first_list);
    }
}
