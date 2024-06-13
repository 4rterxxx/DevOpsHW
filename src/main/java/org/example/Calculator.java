package org.example;

import java.util.Scanner;

public class Calculator {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int num1 = 400;
    char operation = '/';
    int num2 = 5;
    System.out.println(num1 + " " + operation + " " + num2);
    int result = calc(num1, num2, operation);
    System.out.println("Результат операции: " + result);
  }

  public static int getInt() {
    System.out.println("Введите число:");
    int num;
    if (scanner.hasNextInt()) {
      num = scanner.nextInt();
    } else {
      System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
      scanner.next();
      num = getInt();
    }
    return num;
  }

  public static char getOperation() {
    System.out.println("Введите операцию:");
    char operation;
    if (scanner.hasNext()) {
      operation = scanner.next().charAt(0);
    } else {
      System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
      scanner.next();
      operation = getOperation();
    }
    return operation;
  }

  public static int calc(int num1, int num2, char operation) throws ArithmeticException {
    return switch (operation) {
      case '+' -> num1 + num2;
      case '-' -> num1 - num2;
      case '*' -> num1 * num2;
      case '/' -> num1 / num2;
      default -> {
        System.out.println("Операция не распознана");
        throw new ArithmeticException();
      }
    };
  }
}
