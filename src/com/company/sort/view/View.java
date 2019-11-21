package com.company.sort.view;

import com.company.sort.BucketSort;
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
   * The method implements the menu logic.
   */
  public static void start() {
    String interactionin = "YES";

    SortFactory sortFactory = new SortFactory();

    Scanner scanner = new Scanner(System.in);

    String task;

    while (interactionin.equalsIgnoreCase("Yes")) {

      System.out.println("Enter your array");

      System.out.println("Enter your array (example \"1 2 3 4 5\")");


      String array = scanner.nextLine();

      try {
        mas = Arrays.stream(array.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println("Choose your type of sort (example \"Insertion sort\")");

        task = scanner.nextLine();

        Sort sort = sortFactory.getSort(task);

        try {
          System.out.println(Arrays.toString(sort.sort(mas)));
        } catch (NullPointerException e) {
        }
      } catch (NumberFormatException e) {
        System.out.println("Incorrect data");
      }

      System.out.println("\nif you want to try again - write YES, if you don't, so write something else");

      interactionin = scanner.nextLine();

    }
  }
}
