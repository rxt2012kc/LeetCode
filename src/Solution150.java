import java.util.Stack;

/**
 * @Author taotao
 * @Date 3/2/17
 * @ComplexityTime O(n)
 * @Space O(n)
 */
public class Solution150 {
    public static int evalRPN(String[] tokens) {
        if(tokens.length == 0 || tokens == null) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int temp;
        for(int i = 0; i < tokens.length; i++) {
            String str = tokens[i];
            if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/")){
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int param0 = stack.pop();
                int param1 = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        temp = param1 + param0;
                        stack.push(temp);
                        break;
                    case "-":
                        temp = param1 - param0;
                        stack.push(temp);
                        break;
                    case "*":
                        temp = param1 * param0;
                        stack.push(temp);
                        break;
                    case "/":
                        if(param0 == 0) {
                            return 0;
                        }
                        temp = param1 / param0;
                        stack.push(temp);
                        break;
                }
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String[] tokens = {"0", "3", "/"};
        int result = evalRPN(tokens);
        System.out.print(result);
    }
}
