package Sort;

import java.util.*;

/**
 * @Author RenXintao
 * @Date 4/5/17
 */
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeIntervals_56 {
    public static List<Interval> merge(List<Interval> intervals) {
        List<Interval> ret = new ArrayList<Interval>();
        if (intervals == null || intervals.size() == 0) {
            return ret;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        int start;
        int terminal;
        ret.add(intervals.get(0));
        for (int i = 1; i < intervals.size(); i++) {
            start = ret.get(ret.size() - 1).start;
            terminal = ret.get(ret.size() - 1).end;
            if (intervals.get(i).start <= terminal) {
                Interval temp = new Interval(start, Math.max(intervals.get(i).end, terminal));
                ret.remove(ret.size() - 1);
                ret.add(temp);
            } else {
                ret.add(intervals.get(i));
            }
        }

        return ret;
    }
    public static List<Interval> merge2(List<Interval> intervals) {
        List<Interval> ret = new ArrayList<Interval>();
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for (int i = 1; i < intervals.size(); i++) {
            Interval interval = intervals.get(i);
            if (interval.start <= end) {
                end = Math.max(interval.end, end);
            } else {
                ret.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        ret.add(new Interval(start, end));
        return ret;
    }
    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        Interval interval1 = new Interval(1, 10);
        Interval interval2 = new Interval(5, 6);
        Interval interval3 = new Interval(20, 210);
        Interval interval4 = new Interval(7, 8);
//        Interval interval4 = new Interval(7, 8);

        intervals.add(interval1);
        intervals.add(interval2);
        intervals.add(interval3);
        intervals.add(interval4);
        List<Interval> ret = merge2(intervals);
        for (Interval r : ret) {
            System.out.println(r.start + ", " + r.end);
        }
    }
}
