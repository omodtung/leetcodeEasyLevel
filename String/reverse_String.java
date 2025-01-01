package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse_String {
     static String reverseWords(String str) {
        
        // Split the input string by '.' while 
        // ignoring multiple consecutive dots
        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                
                // Ignore empty words caused by multiple dots
                words.add(word);
            }
        }
        
        // Reverse the words
        Collections.reverse(words);
        
        // Join the reversed words back into a string
        return String.join(".", words);
    }

  
}
