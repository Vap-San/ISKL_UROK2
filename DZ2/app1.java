// Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
// у пользователя ввод данных.

import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isValidInput = false;
        
        while (!isValidInput) {
            try {
                System.out.print("Введите дробное число: ");
                number = Float.parseFloat(scanner.nextLine());
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода! Попробуйте снова.");
            }
        }
        scanner.close();
        return number;
        
    }
}

