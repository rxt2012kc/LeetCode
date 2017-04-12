package Stack;

import java.util.Stack;

/**
 * @Author RenXintao
 * @Date 4/7/17
 */
public class ValidParentheses_20 {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if ("{([".contains(String.valueOf(c))) {
                stack.push(c);
            } else {
                if (!stack.empty() && is_valid(c, stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }
    private static boolean is_valid(char s, char peek) {
        return s == ')' && peek =='(' || s == '}' && peek == '{' || s == ']' && peek == '[';
    }
    // method 2
    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "[]";
        boolean ret = isValid2(s);
        System.out.print(ret);
    }
}
