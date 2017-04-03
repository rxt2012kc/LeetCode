package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author RenXintao
 * @Date 3/30/17
 */
public class QueueReconstructionByHeight_406 {
    public static int[][] reconstructQueue(int[][] people) {
        if (people.length == 0 || people == null) {
            return null;
        }
        if (people[0].length == 0 || people[0] == null) {
            return null;
        }
        int[][] ret = new int[people.length][2];
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                } else {
                    return o2[0] - o1[0];
                }
            }
        });
        List<int[]> temp = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            if (people[i][1] == temp.size()) {
                temp.add(people[i]);
            } else {
                temp.add(people[i][1], people[i]);
            }
        }
        for (int i = 0; i < people.length; i++) {
            ret[i] = temp.get(i);
        }
        return ret;
    }
    public static void main(String[] args) {
        int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
        int[][] ret = reconstructQueue(people);
        for(int i = 0; i < ret.length; i++) {
            for (int j = 0; j < ret[0].length; j++) {
                System.out.print(ret[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
