
import java.util.*;

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
        char[] d = sb.toCharArray();
        char[] glasnye = {'А', 'а', 'Е', 'е', 'и', 'И', 'О', 'о', 'Ю', 'ю', 'Э', 'э', 'У', 'у', 'Я', 'я', 'Ё', 'ё', 'ы' };

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < glasnye.length; j++) {
                if (d[i] == glasnye[j]) {
                    System.out.print(d[i] + " ");
                    d[i] = '0';
                }
            }
        }
        System.out.println("\n********");
        for (int i = 0; i < d.length; i++) {
            if (d[i] != '0') {
                System.out.print(d[i] + " ");
            }
        }
    }
    }
