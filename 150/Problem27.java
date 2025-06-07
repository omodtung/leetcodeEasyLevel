public class Problem27 {
    
    public int removeElement(int[] nums, int val) {
        int k = 0; // Biến đếm số phần tử khác val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Ghi đè phần tử không bằng val lên vị trí k
                k++;
            }
        }

        return k;  
    }
    public static void main(String[] args) {
        Problem27 solution = new Problem27();
        int[] nums = { 3, 2, 2, 3 };
        int val = 3;
        int k = solution.removeElement(nums, val);

        System.out.println("Number of elements after removal: " + k);
        System.out.print("Array after removing elements equal to " + val + ": ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
