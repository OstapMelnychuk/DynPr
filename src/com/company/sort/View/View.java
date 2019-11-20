package com.company.sort.View;

import com.company.sort.Sort;
import com.company.sort.factory.SortFactory;

import java.util.Arrays;
import java.util.Scanner;

public class View {
  private static int[] mas;
  private static String interactionin = "YES";

  public static void start() {
    SortFactory sortFactory = new SortFactory();

    Scanner scanner = new Scanner(System.in);

    String task;

    while(interactionin.equals("YES")) {

      System.out.println("Enter your array");

      String array = scanner.nextLine();

      try {
        mas = Arrays.stream(array.split(" ")).mapToInt(Integer::parseInt).toArray();


        System.out.println("Choose your task (example Task 1)");

        task = scanner.nextLine();

        Sort sort = sortFactory.getSort(task);

        System.out.println(Arrays.toString(sort.sort(mas)));
      } catch (NumberFormatException e) {
        System.out.println("Incorrect data");
      }

      System.out.println("if you want to try to write YES, if you don't so write something else");

      interactionin = scanner.nextLine();

    }
  }
}
