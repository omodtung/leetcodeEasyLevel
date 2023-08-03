public class palimdroneNumber {
    public static boolean ispalidrome(int x) {
if(x<0)
{
    return false;
}
else
{
        int b = 0;
        int c = x;

        while (x > 0) {
            b = b * 10 + x % 10;
            x /= 10;
        }
        return b == c;

    }
    }

    public static void main(String[] args) {

        int x = -1112321;
        if (ispalidrome(x)) {
            System.out.println(x + " is a palindrome");
        } else {
            System.out.println(x + " is not a palindrome");
        }
    }
}
