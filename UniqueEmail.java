import java.util.HashSet;

public class UniqueEmail {
    public  static String cutEmail(String email) {
        String arr[] = email.split("@");
        String localName = arr[0];
        String domainName = arr[1];
        // keep the part before +
        String[] arrLocalWithPlus = localName.split("\\+");
        localName = arrLocalWithPlus[0];
        // replace dot and using ""
        localName = localName.replace(".", "");
        return localName + "@" + domainName;

    }

    public static int numUniqueEmail(String[] emails)

    {
        HashSet<String> uniqueEmail = new HashSet<>();
        for (String abc : emails) {

            String EmailAfterFormat = cutEmail(abc);
            uniqueEmail.add(EmailAfterFormat);
        }
        return uniqueEmail.size();
    }
public static void main(String[] args)
{
  String [] email= {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
  System.out.println(" check-an________"+numUniqueEmail(email));
}
}
