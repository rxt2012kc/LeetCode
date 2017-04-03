package BinarySearch;

/**
 * @Author RenXintao
 * @Date 3/8/17
 */
public class firstBadVersion_278 {
    public static int firstBadVersion(int n) {
        if (n <= 0) {
            return -1;
        }
        int start = 1;
        int end = n;
        int mid;
        while (start + 1 < end) {
            mid = start + (end - start) / 2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (isBadVersion(start)) {
            return start;
        } else if (isBadVersion(end)) {
            return end;
        } else {
            return n;
        }
    }
    private static boolean isBadVersion(int n) {
        if (n < 5) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int m = 8;
        int ret = firstBadVersion(m);
        System.out.print(ret);
    }

}
