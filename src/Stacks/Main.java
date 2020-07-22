package Stacks;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack <>();

        Stacks.stack_push(stack);
        Stacks.stack_pop(stack);
        Stacks.stack_push(stack);
        Stacks.stack_peek(stack);
        Stacks.stack_search(stack, 2);
        Stacks.stack_search(stack, 6);
    }

}
