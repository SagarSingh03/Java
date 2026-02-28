// Iterative method of Reversing a Stack 

import java.util.*;

public class reverseStack {
    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> aux = new Stack<>();
        // move all the elements to auxiliary stack
        while (!st.isEmpty()) {
            aux.push(st.pop());
        }

        // Move back to the original stack
        while (!aux.isEmpty()) {
            st.push(aux.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        reverseStack(st);

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}