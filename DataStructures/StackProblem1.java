package DataStructures;

import java.util.Stack;

public class StackProblem1 {
    //Program to Show Stack Implementation
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushAtBottom(s, 4);
        pushAtBottom(s,5);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
