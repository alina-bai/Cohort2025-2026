package Assignments.TextFormatting;

import java.util.Scanner;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ввод текста
        System.out.println("Введите текст:");
        String input = scanner.nextLine();

        // 2. Ввод форматтеров
        System.out.println("Введите имена форматтеров через запятую (например: LowercaseFormatter,DashFormatter):");
        String[] formatterNames = scanner.nextLine().split(",");

        // 3. Создание цепочки
        List<Formatter> formatterList = new ArrayList<>();
        for (String name : formatterNames) {
            try {
                Formatter f = FormatFactory.getFormatter(name.trim());
                formatterList.add(f);
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }

        // 4. Применяем цепочку
        Formatter[] chain = formatterList.toArray(new Formatter[0]);
        Formatter chained = new ChainedFormatter(chain);

        // 5. Вывод результата
        String result = chained.format(input);
        System.out.println("Результат: " + result);

        scanner.close();
    }
}
