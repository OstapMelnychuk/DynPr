package com.company.sort.view;

import com.company.sort.Sort;
import com.company.sort.factory.SortFactory;

import java.util.Arrays;
import java.util.Scanner;

/**
 * This class shows a menu for sorting classes.
 *
 * @author Mykhailo Slivinskiy
 * @version 1.1
 */
public class View {
  /**
   * The array saves the numbers to be sorted.
   */
  private static int[] mas;
  /**
   * Variable for exit the program.
   */
  private static String interactionin = "YES";

  /**
   * The method implements the menu logic.
   */
  public static void start() {
    SortFactory sortFactory = new SortFactory();

    Scanner scanner = new Scanner(System.in);

    String task;

    while (interactionin.equalsIgnoreCase("Yes")) {

      System.out.println("Enter your array");

      String array = scanner.nextLine();

      try {
        mas = Arrays.stream(array.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Choose your type of sort (example \"Insertion sort\")");

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
