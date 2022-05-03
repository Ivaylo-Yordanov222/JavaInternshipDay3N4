package task2;

public class Decoder {
    private final StringBuilder stringBuilder = new StringBuilder();

    public Decoder(){
    }

    public void encode(String sentence){
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
        System.out.println(stringBuilder);
    }
    public  void decode(String sentence){
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

        System.out.println(stringBuilder);
    }

}
