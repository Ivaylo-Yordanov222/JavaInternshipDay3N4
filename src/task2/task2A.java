package task2;
import java.util.Scanner;
public class task2A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean isSymetric = true;

        for (int i = 0; i < word.length()-1;i++){
            if(word.charAt(i) == word.charAt(word.length()-1-i))
            {
                isSymetric = true;
            }
            else{
                isSymetric = false;
            }
        }
        System.out.println(isSymetric);
    }
}
