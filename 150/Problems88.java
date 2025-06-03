public class Problems88 {
    
    public void merge  ( int[] nums1 , int m , int[] nums2 , int n)
    {
        int p1 = m - 1 ;
        int p2 = n - 1 ;
        int p = m +n -1  ;
    for ( int i = p ;i >= 0 ; i--)
    {
        if ( p2 < 0 ) break ;
        if ( p1 >= 0 && nums1[p1]> nums2[p2]) {
        nums1[i] = nums1[p1] ;
        p1-- ;

     }
    else {  nums1[i]  = nums2[p2 ] ;
        p2-- ;
        }

    }
    }
    public static void main(String[] args) {
       
 int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        Problems88 solution = new Problems88();


        solution.merge(nums1, m, nums2, n);

        System.out.print("Merged array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
