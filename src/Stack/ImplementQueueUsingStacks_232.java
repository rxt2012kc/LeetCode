//package Stack;
//
//import java.util.Stack;
//
///**
// * @Author RenXintao
// * @Date 4/5/17
// */
//class MyQueue {
//    Stack<Integer> stack1;
//    Stack<Integer> stack2;
//    /** Initialize your data structure here. */
//    public MyQueue() {
//        stack1 = new Stack<Integer>();
//        stack2 = new Stack<Integer>();
//    }
//
//    /** Push element x to the back of queue. */
//    public void push(int x) {
//        stack1.push(x);
//    }
//
//    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//        peek();
//        if (!stack2.empty()) {
//            return stack2.pop();
//        }
//        return -1;
//    }
//
//    /** Get the front element. */
//    public int peek() {
//        if (stack2.empty()) {
//            while (!stack1.empty()) {
//                stack2.push(stack1.pop());
//            }
//        }
//        if (!stack2.empty()) {
//            return stack2.peek();
//        }
//        return -1;
//    }
//
//    /** Returns whether the queue is empty. */
//    public boolean empty() {
//        return stack2.empty() && stack1.empty();
//    }
//}
//
///**
// * Your MyQueue object will be instantiated and called as such:
// * MyQueue obj = new MyQueue();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.peek();
// * boolean param_4 = obj.empty();
// */
//}
//public class ImplementQueueUsingStacks_232 {
//    public static void main(String[] args) {
//        MyQueue obj = new MyQueue();
////        obj.push(1);
////        obj.push(2);
//        int param_1 = obj.peek();
//        obj.push(3);
//        int param_2 = obj.peek();
//        int param_3 = obj.peek();
//        boolean param_4 = obj.empty();
//    }
//}
