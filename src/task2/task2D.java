package task2;
import java.util.Scanner;
public class task2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String bracketsInput = sc.nextLine();
        boolean isCorrectBracketSequence = false;

        if(bracketsInput.length() % 2 != 0){
            System.out.println(isCorrectBracketSequence);
            return;
        }

        boolean isLastCloseBracketOccurrence = false;
        boolean result = false;
        for (int i = 0; i<bracketsInput.length(); i++){
            char currentIChar = bracketsInput.charAt(i);
            char searchedCloseBracket;
            if(currentIChar == '{')
                searchedCloseBracket = '}';
            else if(currentIChar == '(')
                searchedCloseBracket = ')';
            else if(currentIChar == '[')
                searchedCloseBracket = ']';
            else
                continue;

                for (int j = 1; j<bracketsInput.length(); j++){
                    char currentIndexJChar = bracketsInput.charAt(j);
                    if(currentIndexJChar == searchedCloseBracket)
                    {
                        int distance = j - i - 1;
                        isLastCloseBracketOccurrence = distance%2 == 0;
                    }
                    else{
                       continue;
                    }
                }
                result = isLastCloseBracketOccurrence;
        }
        System.out.println(result);
        //Do not catch all cases
    }
}
