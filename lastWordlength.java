public class lastWordlength {
    public static int lengthOfLastWord(String s) {
        int i = s.length() - 1, length = 0;
        while (s.charAt(i) == ' ') {
            i -= 1;
            System.out.println("=------------test i" + i);
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            length += 1;
            i -= 1;

            System.out.println("test length  -------------" + length);

            System.out.println(" test i version 2 --------------" + i);
        }
        return length;
    }

  

    public static void main(String[] args) {
        String s = "hello word";

        System.out.println(lengthOfLastWord(s));


      
    }
}
