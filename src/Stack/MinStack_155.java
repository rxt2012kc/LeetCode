package Stack;

/**
 * @Author RenXintao
 * @Date 4/5/17
 */

import java.util.Stack;

/** initialize your data structure here. */
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack(){
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x){
        stack.push(x);
        if (minStack.isEmpty()) {
            minStack.push(x);
        } else {
            minStack.push(Math.min(x, minStack.peek()));
        }
    }

    public void pop(){
        if (!stack.empty() && !minStack.empty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top(){
        if (!stack.empty()) {
            return stack.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!minStack.empty()) {
            return minStack.peek();
        }
        return -1;
    }
}
public class MinStack_155 {
    public static void main(String[] args) {
        MinStack obj = new MinStack();
        int x = 5;
        obj.push(x);
        obj.pop();
        obj.push(6);
        int param_3 = obj.top();
        int param_4 = obj.getMin();
    }
}
