import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSumHashMap {
//fix the error in this code
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSumTEST(int[] nums, int target) {
        // Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            System.out.println("adu"+nums[i]);
        System.out.println("test---"+complementIndex);
            if (complementIndex != null) {
                return new int[] { i, complementIndex };
            }
            complements.put(target - nums[i], i);

        }
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = { 2, 3, 4 };
        int target = 5;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}
