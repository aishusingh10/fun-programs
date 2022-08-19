import java.util.*;

public class Anagram {

    public static void main(String args[]) {
        String s = "answer";
        String t = "nswerw";

        boolean result = isAnagram(s,t);

        System.out.println("is anagram: " + result);

    }

    public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapT = new HashMap<Character, Integer>();
        
        mapS = getMap(s);
        mapT = getMap(t);
        boolean flag = false;
        
        for(Map.Entry<Character, Integer> entry: mapS.entrySet()) {
            if(mapT.containsKey(entry.getKey())) {
                int freq = mapT.get(entry.getKey());
                if(freq == entry.getValue()) {
                    flag = true;
                } else {
                    flag = false;
                    System.out.println("here");
                    break;
               }       
            } else {
                flag = false;
                break;
            }
        }
        
        return flag;
    }
    
    public static HashMap<Character, Integer> getMap(String input) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(int i=0; i<input.length(); i++) {
            if(map.containsKey(input.charAt(i))) {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        
        System.out.println(map.toString());
        
        return map;
    }
}