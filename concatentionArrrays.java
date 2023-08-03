import java.util.Arrays;

public class concatentionArrrays {
    public static int[] getConcatenation(int[] nums) {
        int[] ArrayNumber = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            ArrayNumber[i] = nums[i];
            ArrayNumber[i + nums.length] = nums[i];
        }
        return ArrayNumber;
    }
    public static void main(String[] args) {
        int [] nums={1,2,3};
      
      int [] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
}
// 1,2,1->1,2,1,1,2,1