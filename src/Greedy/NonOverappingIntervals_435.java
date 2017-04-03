package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author RenXintao
 * @Date 4/1/17
 */
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class NonOverappingIntervals_435 {
    public static int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        int ret = 0;
        int terminal = intervals[0].end;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < terminal) {
                ret++;
                if (intervals[i].end > terminal) {
                    terminal = intervals[i].end;
                }
            } else {
                terminal = intervals[i].end;
            }
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
