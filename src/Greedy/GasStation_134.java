package Greedy;

/**
 * @Author RenXintao
 * @Date 3/31/17
 */
public class GasStation_134 {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas == null || gas.length == 0 || cost == null || cost.length == 0) {
            return -1;
        }

        int start = 0;
        int cur = 0;
        int total = 0;
        for (int i = 0; i < gas.length; i++) {
            cur += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (cur < 0) {
                start = i;
            }
        }

        if (total < 0) {
            return -1;
        } else {
            return start;
        }
    }
    public static void main(String[] args) {
        int[] gas = {4};
        int[] cost = {5};
        int ret = canCompleteCircuit(gas, cost);

    }
}
