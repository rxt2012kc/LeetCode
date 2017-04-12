package Greedy;

import java.util.*;

public class Jingdong {
    public static int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end - o2.end;
            }
        });
        int ret = 0;
        int index = 1;
        List<Integer> list = new ArrayList<Integer>();
        int terminal = intervals[0].end;
        for(int i = 1; i < intervals.length; i++) {
            if (intervals[i].start <= terminal) {
                index++;
            } else {
                list.add(index);
                index = 1;
                terminal = intervals[i].end;
            }
        }
        list.add(index);
        Collections.sort(list);
        int loop = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            ret += list.get(i);
            loop++;
            if(loop == 2) {
                return ret;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Interval[] intervals = new Interval[4];
        Interval interval0 = new Interval(2, 4);
        Interval interval1 = new Interval(3, 4);
        Interval interval2 = new Interval(5, 7);
        Interval interval3 = new Interval(7, 10);
        intervals[0] = interval0;
        intervals[1] = interval1;
        intervals[2] = interval2;
        intervals[3] = interval3;
        int ret = eraseOverlapIntervals(intervals);
        System.out.print(ret);
    }
}
