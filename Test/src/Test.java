import java.util.*;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(3);
        lst.removeFirst();
        lst.add(5);
        lst.add(7);
        lst.addFirst(2);
        lst.removeLast();
        System.out.println(lst);

        // create a new stack - LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(3); // [3]
        stack.push(5); // [3,5]
        System.out.println(stack.peek()); // prints 5
        stack.push(6); // [3,5,6]
        int x = stack.pop();
        System.out.println(x); // prints 6
        System.out.println(stack); // prints [3,5]

        // create a queue - FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2); // [2]
        queue.add(4); // [2,4]
        System.out.println(queue.peek()); // prints 2
        queue.add(5); // [2,4,5]
        queue.poll();
        System.out.println(queue); // prints
    }
}
