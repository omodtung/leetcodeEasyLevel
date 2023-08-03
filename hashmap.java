import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main( String[] args )
    {
    Map <String,Integer> peopel_id= new HashMap<>();
    peopel_id.put("tungdo",23);
    peopel_id.put("hello",567);
    System.out.println(peopel_id);
    System.out.println(peopel_id.get("tungdo"));
    }
    
}
