import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.addElement("A");
        stack.addElement("B");
        stack.addElement("C");

        System.out.println(stack);

        System.out.println(stack.search("A"));  // returns the offset value of A i.e 3
        System.out.println(stack.search("X"));  // as the value X is not available in the stack it returns -1 as value
    }
}
