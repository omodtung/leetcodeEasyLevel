import java.util.Hashtable;

public class Problem169 {

  public int majorityElement(int[] nums) {
    Hashtable<Integer, Integer> counts = new Hashtable<>();
    int majority_count = nums.length / 2;
    for (int num : nums) {
      int count = counts.getOrDefault(num, 0) + 1;
      counts.put(num, count);
      if (count > majority_count) {
        return num;
      }
    }

    return 1;
  }

  public static void main(String[] args) {
    Problem169 solution = new Problem169();
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    int k = solution.majorityElement(nums);

    System.out.println("Number of unique elements: " + k);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
