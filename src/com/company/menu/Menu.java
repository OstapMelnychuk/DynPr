/*
 *  Ostap Melnychuk
 *
 * Copyright (c) 1993-2019 SoftServe, Inc. All Rights Reserved
 * This software is the confidential and proprietary information of SoftServe Inc.
 * You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with SoftServe.
 */

package com.company.menu;

import com.company.Denis.Task14;
import com.company.Denis.Task7;
import com.company.Olha.TaskSix;
import com.company.Olha.TaskThirteen;
import com.company.alex.TaskTen;
import com.company.alex.TaskThree;
import com.company.hotaru_ritsuki.HighLowEffort;
import com.company.hotaru_ritsuki.ModifiedFibonacci;
import com.company.misha.FriendPairs;
import com.company.misha.LongestSubsequence;
import com.company.pavlo.Task05;
import com.company.pavlo.Task12;
import com.company.sort.view.View;
import com.company.task1task8.FibonacciNumbers;
import com.company.task1task8.PathsWithoutCrossing;
import java.util.Scanner;

/**
 * The class is for displaying Menu and read user input.
 *
 * @author Ostap Melnychuk
 * @version 1.1 20 Nov 2019
 */

public class Menu {

  /**
   * The constructor greet User and launches menu method which displays menu.
   * @since 1.1
   */
  public Menu() {
    Scanner scanner = new Scanner(System.in);
    boolean cycle = true;
    while (cycle) {
      System.out.println("Greetings! Do you want to work with:\n"
          + " 1. Dynamic Programing \n 2. Sorting Algorithms\n 3. Exit\n"
            + "Choose number of variant:");
      switch (scanner.nextLine()) {
        case "1":
          menu();
          break;
        case "2":
          View.start();
          break;
        case "3":
          cycle = false;
          System.out.println("Bye, have a nice day!");
          break;
        default:
          System.out.println("You entered wrong value. Input should be"
              + " like  \"9\"  or another int value lower than 4");
          break;
      }
    }
  }

  /**
   * Method displays menu and reads User choices and executes tasks.
   * @since 1.1
   */
  private void menu() {
    Scanner scan = new Scanner(System.in);
    int result = 0;
    int n = 0;
    boolean cycle = true;
    while (cycle) {
      printTasks();
      switch (scan.nextLine().toLowerCase()) {
        case "1":
          System.out.println("Enter position of Fibonacci Number:");
          result = FibonacciNumbers.fibNumb(scan.nextInt());
          System.out.println("The Fibonacci Number is " + result);
          break;
        case "2":
          System.out.println("Enter position of Modified Fibonacci Number:");
          result = ModifiedFibonacci.getFibonacciNumberBottomUpWithCache(scan.nextInt());
          System.out.println("The Modified Fibonacci Number is: " + result);
          break;
        case "3":
          System.out.println("Enter Position:");
          result = TaskThree.interestingRow(scan.nextInt());
          System.out.println("The result is: " + result);
          break;
        case "4":
          System.out.println("Enter sequence:");
          result = LongestSubsequence.findTheLongestSubsequence(scan.nextLine());
          System.out.println("The result is: " + result);
          break;
        case "5":
          System.out.println("Enter number N: ");
          n = scan.nextInt();
          System.out.println("Enter array of numbers in one row:");
          int[] arrr = arrayInput(scan.nextLine());
          Integer[] actualArr = convertIntArrToIntegerArr(arrr);
          result = Task05.countWaysToRepresentNumber(n, actualArr);
          System.out.println("The result is: " + result);
          break;
        case "6":
          System.out.println("Enter positive integer n:");
          n = scan.nextInt();
          result = TaskSix.countSumWays(n);
          System.out.println("The result is: " + result);
          break;
        case "7":
          System.out.println("Enter the distance- n which is integer bigger than 2");
          n = scan.nextInt();
          result = Task7.coverTheDistance(n);
          System.out.println("The result is: " + result);
          break;
        case "8":
          System.out.println("Enter odd even n - quantity of points");
          n = scan.nextInt();
          result = PathsWithoutCrossing.countWays(n);
          System.out.println("The result is: " + result);
          break;
        case "9":
          System.out.println("Enter the number of days- n which is integer");
          n = scan.nextInt();
          System.out.println("Enter the cost of low effort work in one row");
          int[] low = arrayInput(scan.nextLine());
          System.out.println("Enter the cost of high effort work in one row");
          int[] high = arrayInput(scan.nextLine());
          result = HighLowEffort.maxTasks(high, low, n);
          System.out.println("The result is: " + result);
          break;
        case "10":
          System.out.println("Enter string not more than 100 symbols:");
          String in = scan.nextLine();
          result = TaskTen.lps(in);
          System.out.println("The result is: " + result);
          break;
        case "11":
          System.out.println("Enter number of friends- n integer");
          n = scan.nextInt();
          result = FriendPairs.findNumberOfPair(n);
          System.out.println("The result is: " + result);
          break;
        case "12":
          System.out.println("Enter n positive integer");
          n = scan.nextInt();
          System.out.println("Enter m positive integer and m >= 2");
          int m = scan.nextInt();
          result = Task12.countWaysToTileTheFloor(n, m);
          System.out.println("The result is: " + result);
          break;
        case "13":
          System.out.println("Enter n - number of colors:");
          n = scan.nextInt();
          System.out.println("Enter k - number of posts:");
          int k = scan.nextInt();
          long res = TaskThirteen.countWays(n, k);
          System.out.println("The result is: " + res);
          break;
        case "14":
          System.out.println("Enter n - number of colors:");
          n = scan.nextInt();
          System.out.println("Enter k - number of posts:");
          int q = scan.nextInt();
          double r = Task14.paintFenceCombination(n, q);
          System.out.println("The result is: " + r);
          break;
        case "exit":
          cycle = false;
          break;
        default:
          System.out.println("You entered wrong value. Input should be"
              + " like \"9\"  or another int value lover than 15");
      }
      scan = new Scanner(System.in);
      boolean cycleTwo = true;
      while (cycleTwo) {
        System.out.println("Do you want to continue Yes / No");
        String answer = scan.nextLine().toLowerCase();
        switch (answer) {
          case "yes":
            cycleTwo = false;
            break;
          case "no":
            cycle = false;
            cycleTwo = false;
            break;
          default:
            System.out.println("The input should be \"Yes\" or \"No\"");
            break;
        }
      }
    }
  }

  /**
   * Method print all the tasks.
   * @since 1.1
   */
  private void printTasks() {
    System.out.println("List of Tasks:");
    System.out.println("1. Fibonacci Numbers");
    System.out.println("2. Modified Fibonacci Numbers");
    System.out.println("3. Interesting row");
    System.out.println("4. Longest subsequence with difference one");
    System.out.println("5. Ways to sum to N using array elements with repetition");
    System.out.println("6. Ways to write n as sum of two or more positive integers");
    System.out.println("7. Ways to cover in 3 steps");
    System.out.println("8. Paths without crossing");
    System.out.println("9. Work to be with High-effort or with Low-effort");
    System.out.println("10. The longest palindromic subsequence");
    System.out.println("11. Friend pairs");
    System.out.println("12. Ways to tile the floor");
    System.out.println("13. Painting the fence");
    System.out.println("14. Optimized painting fence: use one variable instead of a table");
    System.out.println("Exit for exit");
    System.out.println("Choose number of Task");
  }

  /**
   * Method that converts string which contains array to int array.
   * @param arr is a string which contains array
   * @return int array from that string
   * @since 1.1
   */
  private int[] arrayInput(String arr) {
    String[] strArr = arr.split(" ");
    int[] actualArr = new int[strArr.length];
    for (int i = 0; i < strArr.length; i++) {
      actualArr[i] = Integer.parseInt(strArr[i]);
    }
    return actualArr;
  }

  /**
   * Method that converts int array to Integer objects array.
   * @param arr is an int array
   * @return Integer array from int array
   * @since 1.1
   */
  private Integer[] convertIntArrToIntegerArr(int[] arr) {
    Integer[] out = new Integer[arr.length];
    for (int i = 0; i < arr.length; i++) {
      out[i] = arr[i];
    }
    return out;
  }
}
