import java.lang.reflect.Array;
import java.nio.file.FileAlreadyExistsException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class containDuplicate {
    public static boolean conTainDupBruteForce(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;

    }

    public static boolean containDuplicateSort(int[] nums)

    {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }

        }
        return false;

    }

    public static boolean containDuplicateHashSet(int[] nums) {
        HashSet<Integer> space = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (space.contains(nums[i])) {
                return true;
            }
            space.add(nums[i]);
        }
        return false;

    }

    public  static boolean containDuplicateHashMap(int[] nums) {
        HashMap<Integer, Integer> space = new HashMap<>();

        for (int num : nums) {
            if (space.containsKey(num) && space.get(num) >= 1)

            {
                return true;
            }
            space.put(num, space.getOrDefault(num, 0) + 1);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 3 };
        boolean result = containDuplicateHashMap(nums);
        System.out.println(result);
    }
}
