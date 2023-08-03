public class Longest_common_Prefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {

            System.out.println("test strs " + strs[0]);
            System.out.println("test res" + res);
            for (String s : strs) {

                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {

                    return res.toString();

                }

            }

            res.append(strs[0].charAt(i));

            System.out.println("-------  test i =-------" + i);
            // System.out.println("------test schartAt ( i)-------" + s.charAt(i));

            System.out.println(" test 3-----------strs[0].chartAt(i)-------" + strs[0].charAt(i));
        }
        System.out.println("test end");
        return res.toString();
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        System.out.println(longestCommonPrefix(strs));
    }

}
