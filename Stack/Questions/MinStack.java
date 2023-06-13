package Stack.Questions;

import java.util.*;

public class MinStack {

    static class MinStack2 {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public void push(int val) {
            st1.push(val);
            if (st2.empty()) {
                st2.push(val);
            } else if (val < st2.peek()) {
                st2.push(val);
            } else {
                st2.push(st2.peek());
            }
        }

        public void pop() {
            st1.pop();
            st2.pop();

        }

        public int top() {
            return st1.peek();

        }

        public int getMin() {
            return st2.peek();
        }
    }

    public static void main(String[] args) {

    }
}
