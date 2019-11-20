package com.company.sort;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.Assert.*;

public class BucketSortTest extends Assert {
  private static ArrayList<int[]> arrTest=new ArrayList<int[]>();

  @BeforeClass
  public static void setUpBucketSort() {
    java.util.Random rand = new java.util.Random();
    for(int i = 0; i < 10; i++){
      int[] temp=new int[15-i];
      for(int j=0;j<15-i;j++){
        temp[j]=rand.nextInt(65536)-32768;
      }

      arrTest.add(temp);
    }
    arrTest.add(new int[]{});

  }

  @AfterClass
  public static void tearDownBucketSort() {
    arrTest.clear();
  }

  @Test
  public void bucketSort() {
    for(int []i : arrTest) {
      System.out.println(Arrays.toString(i));
      int []temp = i.clone();
      BucketSort.bucketSort(temp,max(temp));
      System.out.print(Arrays.toString(temp)+"      ");
      Arrays.sort(i);
      System.out.print("    "+Arrays.toString(i)+"\n");
      assertArrayEquals(i,temp);
    }
  }
  public int max(int[] input){
    if(input.length==0){
      return Integer.MIN_VALUE;
    }
    int max=input[0];
    for(int i=1;i<input.length;i++){
      if(input[i]>max){
        max=input[i];
      }
    }
    return max;
  }
}