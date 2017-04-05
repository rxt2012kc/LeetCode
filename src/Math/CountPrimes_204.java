package Math;

/**
 * @Author RenXintao
 * @Date 4/3/17
 * @Time O(nloglogn)
 * @Space O(n)
 */
public class CountPrimes_204 {
    public static int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int n = 28;
        int ret = countPrimes(n);
        System.out.print(ret);
    }
}
