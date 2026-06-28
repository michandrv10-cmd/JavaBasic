package hw1;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = new String[]{
                "Какого примитивного типа НЕТ в Java?",
                "Какое начало индекса у массивов в Java?",
                "Какой цикл гарантированно выполнится хотя бы один раз?"
        };

        String[][] options = new String[][]{
                {"1. int", "2. string", "3. boolean", "4. byte"},
                {"1. С единицы", "2. С минус единицы", "3. С нуля"},
                {"1. while", "2. for", "3. do-while"}
        };

        int[] correctAnswers = new int[]{2, 3, 3};
        int correctCount = 0;

        System.out.println("ДОБРО ПОЖАЛОВАТЬ НА ТЕСТИРОВАНИЕ!!! \n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }
            System.out.println("Введите номер вашего ответа:");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Верно!\n");
                correctCount++;
            } else {
                System.out.println("Неверно. (Правильный ответ: " + correctAnswers[i] + ")\n");
            }
        }
        System.out.println("--- ТЕСТ ЗАВЕРШЕН ---");
        System.out.println("Вы правильно ответили на " + correctCount + " из " + questions.length + " вопросов.");
        scanner.close();
    }
}
