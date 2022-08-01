import java.util.*;

class Palindrome {
    // String as an input -> "ABDCBA"
    // String as an input -> "ABDMCBA"
    public static void main(String[] args) {

        String input = "ABBCA";

        Boolean isPalindrome = getPalindrome(input);

        System.out.println(isPalindrome);

    }

    public static Boolean getPalindrome(String input) {

        String reverse = "";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = input.length() - 1; i >= 0; i--) {
             reverse = reverse + input.charAt(i);
        }

        if (reverse.equals(input)) {
            return true;
        } else {
            for (int i = 0; i < input.length(); i++) {
                if (map.containsKey(input.charAt(i))) {
                    map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
                } else {
                    map.put(input.charAt(i), 1);
                }
            }

            int countSingleChar = 0;

            Collection<Integer> charFreqValues = map.values();

            for (int freq : charFreqValues) {
                if (freq == 1) {
                    countSingleChar++;
                }
            }

            if (countSingleChar > 2) {
                return false;
            } else {
                return true;
            }

        }

    }

}
