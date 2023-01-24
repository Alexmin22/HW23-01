import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите текст: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        StringBuilder stringBuilder = new StringBuilder();
        List<Character> list = new ArrayList<>(Arrays.asList('А', 'а', 'Е', 'е', 'и', 'И', 'О', 'о', 'Ю', 'ю', 'Э',
                'э', 'У', 'у', 'Я', 'я', 'Ё', 'ё', 'ы'));

        Iterator<Character> iterator = list.listIterator();

        while (iterator.hasNext()) {
            int index = sb.indexOf(String.valueOf(iterator.next()));
            if(index >= 0) {
                stringBuilder.append(sb.charAt(index));
                sb.deleteCharAt(index);
            }
        }

        System.out.println(sb);
        System.out.println(stringBuilder);
    }
}