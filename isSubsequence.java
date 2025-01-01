
public class isSubsequence {
    public static boolean Checking(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            // System.out.println("i=---------" + i);
            // System.out.println("j=------" + j);
            if (s.charAt(i) == t.charAt(j)) {
                i = i + 1;
                //System.out.println("test1----" + i);
            }
            j = j + 1;
         //   System.out.println("test2-----" + j);
        }

        if (i == s.length()) {
          //  System.out.println("test3----" + i);
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        // String s= "dongnai";

        // System.out.println(s.charAt(1));
        // System.out.println(s.length());
        String s = "abc";
        String t = "ahbgdc";
        String r="xcvbnm a";
        System.out.println("length of r "+ r.length());
        boolean result = Checking(s, t);
        System.out.println(result);
    }
}
