import java.util.Arrays;

public class two_sum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    return new int[] { i, j };

                    // System.out.println("test code line 12");
                }

            }
        }

        System.out.println(" test code line 18");
        return new int[] {};

    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 4 };
        int target = 5;
        int[] result = twoSum(nums, target);
        System.out.println(" test code 27");
        System.out.println(Arrays.toString(result));

    }
}