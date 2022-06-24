import java.util.*;

public class PatternMatching {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] words = { "memee", "abcdd", "ababb", "eehfgss", "kekee", "weeds" };
        String pattern = "fefee";

        int[] numPattern = generateNumPattern(pattern);

        for (String word : words) {
            if (pattern.length() != word.length()) {
                continue;
            } else {
                int[] wordPattern = generateNumPattern(word);
                if (Arrays.toString(wordPattern).equals(Arrays.toString(numPattern))) {
                    System.out.println(word);
                }
            }
        }

    }

    public static int[] generateNumPattern(String pattern) {
        int counter = 0;
        int[] numPattern = new int[pattern.length()];
        numPattern[0] = 0;
        for (int i = 1; i < pattern.length(); i++) {
            numPattern[i] = counter++;
            for (int j = i - 1; j >= 0; j--) {
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    numPattern[j] = numPattern[i];
                }
            }
        }
        return numPattern;
    }
}
