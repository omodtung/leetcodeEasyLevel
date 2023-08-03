import java.util.Arrays;

public class RightNumber {
    public static int[] replaceElements(int[] arr) {
        int rightMax = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int newMax = Math.max(rightMax, arr[i]);

            arr[i] = rightMax;
            rightMax = newMax;
            System.out.println("index-----"+i);
            System.out.println("-----------1----------" + newMax);
            System.out.println("-----------2----------" + arr[i]);
            // System.out.println(arr[i] = rightMax);
            // System.out.println(rightMax = newMax);

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};

        int[] result = replaceElements(arr);
        System.out.println(Arrays.toString(result));
    }

}
