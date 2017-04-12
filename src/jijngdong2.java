import java.util.Scanner;

/**
 * @Author RenXintao
 * @Date 4/7/17
 */
public class jijngdong2 {
    public static double valid(int m, double[] p) {
        int count = (int)(m * 0.6) + 1;
        int len = p.length;
        for (int i = 0; i < len; i++) {

        }
        return 1.0;
    }
    public static double jisuan(int count, int len) {
        double zi = 1;
        for (int i = count; i > count - len; i--) {
            zi *= i;
        }
        double mu = 1;
        while (len > 0) {
            mu *= len;
        }
        return (double)zi/mu;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] s = new int[length];
        for (int i = 0; i < length; i++) {
            int num = in.nextInt();
            s[i] = num;
            System.out.println(s[i]);
        }
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
        int m = 6;
        double[] p = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6};
        valid(m, p);

    }
}
