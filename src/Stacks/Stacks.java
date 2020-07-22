package Stacks;

import java.util.Stack;

public class Stacks {

    //pushing an element on the top the stack.
    public static void stack_push(Stack<Integer> stacks) {

        for (int i = 0; i < 5; i++) {
            stacks.push(i);
        }

    }

    //Popping an element from a stack.
    public static void stack_pop(Stack<Integer> stack){
        System.out.println("Pop: ");
        for (int i = 0; i < 5; i++) {
            Integer num = stack.pop();
            System.out.println(num);
        }
    }

    //Peek
    public static void stack_peek(Stack<Integer> stack){

        Integer integer = stack.peek();
        System.out.println("Top is " + integer);

    }

     //Displaying the top element of the stack.
     public static void stack_search(Stack<Integer> stack, int element){
          Integer pos = stack.search(element);
          if (pos == -1){
              System.out.println("element not found!");
          }else{
              System.out.println("Element found! " + pos);
          }
     }

}
