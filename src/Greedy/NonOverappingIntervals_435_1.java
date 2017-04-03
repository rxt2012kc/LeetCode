package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NonOverappingIntervals_435_1 {
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
        int terminal = intervals[0].end;
        List<Integer> removeIndex = new ArrayList<Integer>();
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < terminal) {
                ret++;
                removeIndex.add(i);
            } else {
                terminal = intervals[i].end;
            }
        }
        for (Integer i : removeIndex) {
            System.out.println(intervals[i].start + ", " + intervals[i].end);
        }
        return ret;

    }
    public static void main(String[] args) {
        Interval[] intervals = new Interval[4];
        Interval interval0 = new Interval(1, 100);
        Interval interval1 = new Interval(11, 22);
        Interval interval2 = new Interval(1, 11);
        Interval interval3 = new Interval(2, 12);
        intervals[0] = interval0;
        intervals[1] = interval1;
        intervals[2] = interval2;
        intervals[3] = interval3;
        int ret = eraseOverlapIntervals(intervals);
        System.out.print(ret);
    }
}
