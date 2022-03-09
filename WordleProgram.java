import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class WordleProgram {

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    public static void main(String[] args) {
        String wordOfTheDay = "MONTH";
        for (int i = 0; i < 6; i++) {
            Scanner sc = new Scanner(System.in); //System.in is a standard input stream
            String word = sc.nextLine();
            if (word.length() != 5) {
                System.out.println("Please enter 5 letter word");
                word = sc.nextLine();
            }
            boolean isCorrect = isCorrectWord(wordOfTheDay, word.toUpperCase(Locale.ROOT));//reads string
            if (isCorrect) {
                System.out.println("Splendid!");
                break;
            }
        }
        System.out.println("Word of the day:" + wordOfTheDay);
    }

    private static boolean isCorrectWord(String wordOfTheDay, String word) {
        boolean isCorrectWord = false;
        if (wordOfTheDay.equals(word)) {
            isCorrectWord = true;
        }
        Map<Character, Set<Integer>> wordOfDayMap = getMap(wordOfTheDay);
        Map<Character, Integer> wordOfDayCountMap = getCharCountMap(wordOfTheDay);

        char[] wordArray = word.toCharArray();
        int i = 0;

        for (char letter : wordArray) {
            if (wordOfDayMap.containsKey(letter)) {
                int count = wordOfDayCountMap.get(letter);
                if (count > 0) {
                    Set<Integer> indexSet = wordOfDayMap.get(letter);
                    if (indexSet.contains(i)) {
                        System.out.print(ANSI_GREEN_BACKGROUND + " |" + letter + "| ");
                    } else {
                        System.out.print(ANSI_YELLOW_BACKGROUND + " |" + letter + "| ");
                    }
                    wordOfDayCountMap.put(letter, count--);
                } else {
                    System.out.print(ANSI_BLACK_BACKGROUND + " |" + letter + "|");

                }
            } else {
                System.out.print(ANSI_BLACK_BACKGROUND + " |" + letter + "|");

            }
            i++;
        }
        System.out.println();
        return isCorrectWord;
    }

    private static Map<Character, Integer> getCharCountMap(String word) {
        Map<Character, Integer> wordCountMap = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            if (wordCountMap.containsKey(word.charAt(i))) {
                wordCountMap.put(word.charAt(i), wordCountMap.get(word.charAt(i)) + 1);
            } else {
                wordCountMap.put(word.charAt(i), 1);
            }
        }
        return wordCountMap;
    }

    private static Map<Character, Set<Integer>> getMap(String wordOfTheDay) {
        Map<Character, Set<Integer>> wordOfDayMap = new LinkedHashMap<>();

        for (int i = 0; i < wordOfTheDay.length(); i++) {
            Set<Integer> indexSet = new HashSet<>();
            if (wordOfDayMap.containsKey(wordOfTheDay.charAt(i))) {
                indexSet = wordOfDayMap.get(wordOfTheDay.charAt(i));
                indexSet.add(i);
                wordOfDayMap.put(wordOfTheDay.charAt(i), indexSet);
            } else {
                indexSet.add(i);
                wordOfDayMap.put(wordOfTheDay.charAt(i), indexSet);
            }
        }

        return wordOfDayMap;
    }

}