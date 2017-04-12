package Stack;

import java.util.*;

/**
 * @Author RenXintao
 * @Date 4/7/17
 */
public class SimplifyPath_71 {
    public static String simplifyPath(String path) {
        if (path == null || path.length() == 0) {
            return null;
        }

        Stack<String> stack = new Stack<>();
        List<String> list = Arrays.asList("..", ".", "");
        String[] dirs = path.split("/");
        for (String dir : dirs) {
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            }
            else if (!list.contains(dir)) {
                stack.push(dir);
            }
        }
        String res = "";
        while (!stack.empty()) {
            res = "/" + stack.pop() + res;
        }
//        for (String dir : stack)
//            res = res + "/" + dir;
        return res.isEmpty() ? "/" : res;
    }
    public static String simplifyPath1(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for (String dir : path.split("/")) {
            if (dir.equals("..") && !stack.isEmpty())
                stack.pop();
            else if (!skip.contains(dir))
                stack.push(dir);
        }
        String res = "";
        for (String dir : stack)
            res = "/" + dir + res;
        return res.isEmpty() ? "/" : res;
    }
    public static String simplifyPath3(String path) {
        String result = "/";
        String[] stubs = path.split("/");
        ArrayList<String> paths = new ArrayList<String>();
        for (String s : stubs){
            if(s.equals("..")){
                if(paths.size() > 0){
                    paths.remove(paths.size() - 1);
                }
            }
            else if (!s.equals(".") && !s.equals("")){
                paths.add(s);
            }
        }
        for (String s : paths){
            result += s + "/";
        }
        if (result.length() > 1)
            result = result.substring(0, result.length() - 1);
        return result;
    }
    public static void main(String[] args) {
        String s = "/abc/...";
        String ret = simplifyPath3(s);
        System.out.print(ret);
    }

}
