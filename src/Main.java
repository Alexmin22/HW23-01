import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    //1.Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    //2.Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    //3.Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    //4.Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
    public static void main(String[] args) throws Throwable {
        try {
            int a = 42 / 0;
            System.out.println(a);
            try {
                String s = null;
                s.toUpperCase();
                try {
                    ArrayList<String> list = new ArrayList<>();
                    String st = list.get(18);
                    try {
                        HashMap<String, String> map = new HashMap<>(null);
                        map.put(null, null);
                        map.remove(null);
                    } catch (NullPointerException np) {
                        throw new Throwable(np.getMessage());
                    }
                } catch (IndexOutOfBoundsException inEx) {
                    throw new RuntimeException().fillInStackTrace();
                }
                } catch (NullPointerException npe) {
                throw new NullPointerException("Проблема со строкой S");
            }
            } catch (ArithmeticException e) {
            throw new RuntimeException(e.toString());
        }
    }
}

