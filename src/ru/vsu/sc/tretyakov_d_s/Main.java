package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    double V = readSpeed("Boat");
    double U = readSpeed("River");
    checkSpeed(V,U);
    double T1 = readTime("Driving along the river");
    double T2 = readTime("Driving against the flow of the river");

    double S = findSum(V,U,T1,T2);
    printResult(S);
  }

  private static double readSpeed(String speedType) {
    System.out.printf("Enter %s speed - ", speedType);

    Scanner scn = new Scanner(System.in);
    double value = scn.nextDouble();

    if(value < 0) {
      System.out.println("Speed can be only more than 0");
      System.exit(1);
    }



    return value;
  }

  private static void checkSpeed(double V, double U) {
    if (U >= V) {
      do {
        System.out.println("The speed of the river must be less than the boat's own speed");
        U = readSpeed("River");
      } while (U >= V);
    }
  }

  private static double readTime(String timeType) {
    System.out.printf("Enter %s time - ", timeType);

    Scanner scn = new Scanner(System.in);
    double value = scn.nextDouble();

    if(value < 0) {
      System.out.println("Time can be only more than 0");
      System.exit(1);
    }
    return value;
  }

  private static double findSum(double V, double U, double T1, double T2) {
    return (V*T1 + (V-U)*T2);
  }

  public static void printResult(double S) {
    System.out.printf("The path traveled by the boat S = %s", S);
  }
}