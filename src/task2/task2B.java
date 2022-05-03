package task2;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class task2B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        TreeMap<Character, Integer> charactersOccurrence = new TreeMap<>();
        for (int i = 0; i < sentence.length(); i++) {
            if (!charactersOccurrence.containsKey(sentence.charAt(i))) {
                charactersOccurrence.put(sentence.charAt(i), 0);
            }
            charactersOccurrence.put(sentence.charAt(i), charactersOccurrence.get(sentence.charAt(i)) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charactersOccurrence.entrySet()) {
            System.out.println(entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
