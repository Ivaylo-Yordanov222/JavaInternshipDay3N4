package task2;
import java.util.Scanner;
public class task2C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String task = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        switch (task){
            case "encode":encode(sentence,sb);
            break;
            case "decode":decode(sentence,sb);
            break;
            default:
                System.out.println("Not correct task command: "+task);
                break;
        }

    }

    public static void encode(String sentence, StringBuilder stringBuilder){
        for (int i = 0; i < sentence.length();i++){
            if(sentence.charAt(i) >= 65 && sentence.charAt(i) <=90 ){
                if(sentence.charAt(i) != 90){
                    stringBuilder.append((char)(sentence.charAt(i) + 1));
                }
                else{
                    stringBuilder.append('A');
                }
            }else if(sentence.charAt(i) >= 97 && sentence.charAt(i) <=122){
                if(sentence.charAt(i) != 122){
                    stringBuilder.append(Character.toString(sentence.charAt(i) + 1));
                }
                else{
                    stringBuilder.append('a');
                }
            }else{
                stringBuilder.append(sentence.charAt(i));
            }

        }
        System.out.println("Encode run");
        System.out.println(stringBuilder);
    }
    public static void decode(String sentence,StringBuilder stringBuilder){
        for (int i = 0; i < sentence.length();i++){
            if(sentence.charAt(i) >= 65 && sentence.charAt(i) <=90 ){
                if(sentence.charAt(i) != 65){
                    stringBuilder.append((char)(sentence.charAt(i) - 1));
                }
                else{
                    stringBuilder.append('Z');
                }
            }else if(sentence.charAt(i) >= 97 && sentence.charAt(i) <=122){
                if(sentence.charAt(i) != 97){
                    stringBuilder.append(Character.toString(sentence.charAt(i) - 1));
                }
                else{
                    stringBuilder.append('z');
                }
            }else{
                stringBuilder.append(sentence.charAt(i));
            }

        }
        System.out.println("Decode run");
        System.out.println(stringBuilder);
    }
}
