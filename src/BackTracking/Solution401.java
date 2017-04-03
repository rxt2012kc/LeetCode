package BackTracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/9/17
 */
public class Solution401 {
//    public static List<String> readBinaryWatch(int num) {
//        List<String> times = new ArrayList<String>();
//        String time = "";
//        int[] binary = {1, 2, 4, 8, 1, 2, 4, 8, 16, 32};
//        helper(times, time, binary, num, 0);
//        return times;
//    }
//
//    private static void helper(List<String> times, String time,
//                               int[] binary, int num, int index) {
//        int hour = 0;
//        int minute = 0;
//        if(temp.size() == num) {
//            for(Integer t : temp) {
//                if(t <= 3) {
//                    hour += binary[t];
//                } else {
//                    minute += binary[t];
//                }
//            }
//            time = hour + ":" + minute;
//            times.add(new String(time));
//            return;
//        }
//        for (int i = index; i < binary.length; i++) {
//            temp.add(i);
//            helper(times, time, binary, num, i + 1);
//            temp.remove(temp.size() - 1);
//        }
//    }

    public static void main(String[] args) {
//        int num = 1;
//        List<String> times = readBinaryWatch(num);
//        System.out.print(times);
        int a = Integer.bitCount(5);
        System.out.print(a);
    }
}
