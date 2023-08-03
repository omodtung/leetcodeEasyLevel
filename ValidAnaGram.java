import javax.swing.plaf.synth.SynthSplitPaneUI;

public class ValidAnaGram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;

            store[t.charAt(i) - 'a']--;
        }
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.println("test problem");
        //     System.out.println('t' - 'a');
        //     System.out.println(s.charAt(i) - 'a');
        //     System.out.println("see");
        //     System.out.println(s.charAt(i));

        //     System.out.println(" tets2");
        //   System.out.println(store[t.charAt(i)-'a']);
        // }

        for (int n : store)
            if (n != 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "titan";
        String t = "tanti";
        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
