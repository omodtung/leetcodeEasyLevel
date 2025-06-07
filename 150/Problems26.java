public class Problems26 {

  public int removeDuplicates(int[] nums) {
    int k = 0;
    if (nums.length == 0) return 0;

    if (nums.length == 1) return 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[k]) {
        k++;
        nums[k] = nums[i];
      }
    }
    return k + 1;
  }

  public static void main(String[] args) {
    Problems26 solution = new Problems26();
    int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
    int k = solution.removeDuplicates(nums);

    System.out.println("Number of unique elements: " + k);
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }
    System.out.println();
  }
}
