
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewExcep {
    //Написать программу, которая вводит с клавиатуры строку текста.
    //Программа должна вывести на экран две строки:
    //1) первая строка содержит только гласные буквы
    //2) вторая - только согласные буквы и знаки препинания из введённой строки.
    //Символы соединять пробелом, каждая строка должна заканчиваться пробелом.
    //
    //Пример ввода:
    //Мама мыла раму.
    //Пример вывода:
    //а а ы а а у
    //М м м л р м .
    public static void main(String[] args) {
    liter();
    }
    static void liter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите текст: ");
        String sb = scanner.nextLine();
        List<Character> list = new ArrayList<>();
        char[] glasnye = {'А', 'а', 'Е', 'е', 'и', 'И', 'О', 'о', 'Ю', 'ю', 'Э', 'э', 'У', 'у', 'Я', 'я', 'Ё', 'ё', 'ы' };

        for (int i = 0; i < sb.length(); i++) {
            boolean b = true;
            for (int j = 0; j < glasnye.length; j++) {
                if (b) {
                    list.add(i, sb.charAt(i));
                    if (sb.charAt(i) == glasnye[j]) {
                        System.out.print(sb.charAt(i) + " ");
                        list.set(i, ' ');
                        b = false;
                    }
                }
            }
        }
        System.out.println("\n********");
       for (Character ch : list) {
           System.out.print(ch + " ");
       }
    }
    }
