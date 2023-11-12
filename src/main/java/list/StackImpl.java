package list;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        // Removes an element from stack
        System.out.println(stack.pop());
        //Shows you the element but does not remove it
        System.out.println(stack.peek());
        //rewriting the last element of the stack with the new element
        System.out.println(stack.add(4));
        System.out.println(stack);
    }
}
