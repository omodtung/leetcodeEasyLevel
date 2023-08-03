public class removeElement {

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];

        a[i] = a[j];
        a[j] = temp;

    }

    public static int removeEle(int[] nums, int val) {
        int boundary = nums.length - 1;
        int i = 0;
        while (i <= boundary) {
            System.out.println("check"+i);
            if (nums[i] == val) {
                swap(nums, i, boundary);
                boundary -= 1;

            } else {
                i += 1;
            }
        }
        return i;

    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 2, 1 };
        int val = 2;

        int a = removeEle(nums, val);
        System.out.println(" ket qua " + a);
        // int i=0;
        // while(i<2)
        // {
        //     System.err.println("abc");
        // }
    }

}
