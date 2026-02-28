// Stack is one of the most important linear Data Structure.Stack follows LIFO : last in first out principle 
// and is defined in java.util.package In Stack we Perform 3 types of Operations 
// push 0(1) , pop 0(1) , Peek 0(1). 
// In Stack all the elements are Stack one upon another. In Stack first operation we perform is push 
// operation. It is always performed at the end of the Stack. 
// Pop : Then we perform Pop operation here we pop from the top of Stack 
// Peek : At the end we perform Peek Operation, here we do peek, basicallt we takeout the values of the 
// last operation. 

// Here we are implementing Stack in the form of Linked List

// public class StackLinkedList {

//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         private Node head;

//         // Check if empty
//         public boolean isEmpty() {
//             return head == null;
//         }

//         // Push
//         public void push(int data) {
//             Node newNode = new Node(data);
//             newNode.next = head;
//             head = newNode;
//         }

//         // Pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         // Peek
//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// Implement Stack from the Array list ***********************************************************************
// import java.util.*;

// public class StackArrayList {

//     static class Stack {
//         private ArrayList<Integer> list = new ArrayList<>();

//         // Check empty
//         public boolean isEmpty() {
//             return list.size() == 0;
//         }

//         // Push
//         public void push(int data) {
//             list.add(data);
//         }

//         // Pop
//         public int pop() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         // Peek
//         public int peek() {
//             if (isEmpty()) {
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Stack s = new Stack();

//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);
//         s.push(5);

//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }

// Actual in exam when you are implememnting a Stack then you don't need to use array or arraylist or Linkedlist. You have to implement
// using Java Collection Framework 

import java.util.*;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}