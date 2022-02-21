import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        int[] ary = {11, 21,11, 23, 43, 43, 12, 12, 43, 55, 65, 78, 89};
        Set<Integer> dup = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i : ary) {
            if (!set.add(i)) {
                dup.add(i);
            }
        }
        Integer[] dupl = new Integer[dup.size()];
        dup.toArray(dupl);
        System.out.println(Arrays.toString(dupl));


    }
}
