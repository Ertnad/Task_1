package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    System.out.print("Введите собственную скорость лодки: V = ");
    int V = readNumber();
    System.out.print("Введите скорость реки: U = ");
    int U = readNumber();

    if (U >= V) {
      do {
        System.out.println("Скорость течения реки должна быть меньше собственной скорости лодки");
        System.out.print("Введите скорость реки: U = ");
        U = readNumber();
      } while (U >= V);
    }

    System.out.print("Введите время движения лодки по озеру: T1 = ");
    int T1 = readNumber();
    System.out.print("Введите время движения лодки по реке: T2 = ");
    int T2 = readNumber();
    int S = (T1 * V) + (T2 * (V - U));

    System.out.printf("Путь, пройденный лодкой S = %d", S);
  }

  public static int readNumber() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt();
  }
}