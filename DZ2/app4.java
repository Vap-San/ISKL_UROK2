//Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            try {
                System.out.print("Введите строку: ");
                input = scanner.nextLine();

                if (input.isEmpty()) {
                    throw new Exception("Пустые строки вводить нельзя");
                }

                break; 
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Вы ввели: " + input);
        scanner.close();
    }
}