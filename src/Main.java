import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequenceOfScopes = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        char currentBracket;
        boolean result = true;

        if(sequenceOfScopes.length() % 2 != 0){
            System.out.println(false);
            return;
        }
        for(int i = 0; i < sequenceOfScopes.length(); i++){
            currentBracket = sequenceOfScopes.charAt(i);
            if(currentBracket == '(' || currentBracket=='{' || currentBracket == '['){
                stack.push(currentBracket);
            }
            else{
                char lastOpenScope = stack.pop();
                switch (lastOpenScope){
                    case '(':
                        if( currentBracket != ')'){
                            result = false;
                        }
                    break;
                    case '{':
                        if(currentBracket != '}'){
                        result = false;
                        }
                    break;
                    case '[':
                        if(currentBracket != ']'){
                        result = false;
                        }
                    break;
                }
            }
        }
        System.out.println(result);
    }
}