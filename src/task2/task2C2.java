package task2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;


public class task2C2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String command = scanner.nextLine();
        String classFullPath = "task2.Decoder";
        Class<?> decoderClass = Class.forName(classFullPath);
        Object decoder = decoderClass.getConstructor().newInstance();
        Method decoderMethod = decoder.getClass().getMethod(command, String.class);
        decoderMethod.invoke(decoder, sentence);
    }
}
