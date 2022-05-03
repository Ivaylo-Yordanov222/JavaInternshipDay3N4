package task2;
import java.util.Scanner;
public class task2E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence1 = scanner.nextLine();
        String sentence2 = scanner.nextLine();
        StringBuilder sb = new StringBuilder(sentence1);
        StringBuilder sb2 = new StringBuilder(sentence2);

        char searchedCharacter = sentence2.charAt(sentence2.length()-1);
        sb2.deleteCharAt(sb2.length() -1 );
        int startIndexOfSubStr = sentence1.indexOf(sb2.toString());
        if(startIndexOfSubStr == -1) {
            return;
        }
        int endIndexOfSubStr = startIndexOfSubStr + (sentence2.length() -1);

        boolean result = false;
        for (int i = endIndexOfSubStr; i < sb.length();i++){
            char currentCharacter = sb.toString().charAt(i);
            if(currentCharacter == searchedCharacter && currentCharacter != ' ')
            {
                sb.delete(endIndexOfSubStr,i);
                result = true;
            }
        }
        if(sb.length() != sentence2.length()){
            sb.delete(sentence2.length(),sb.length());
        }
        System.out.println(result);
        System.out.println(sb);
    }
}
