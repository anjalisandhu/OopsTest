package exampleString;

import java.util.HashMap;
import java.util.Map;

public class Case2 {
    public static void main(String[] args) {
        String name = "anjalisandhu";
        
        Map<Character, Integer> countChar = new HashMap<>();
        
        for (char c : name.toCharArray()) {
            countChar.put(c, countChar.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : countChar.entrySet()) {
           // if (entry.getValue() > 1) {
            	if (entry.getValue() == 1) {
                System.out.println("Character '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
            }
        }
    }
}
