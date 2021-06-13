import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        CustomStack<Integer> stack = new CustomStack();
        stack.push(3);
        stack.push(0);
        stack.push(2);

        System.out.println(stack.peek() + " " + stack);


    }
}

class Test {

}