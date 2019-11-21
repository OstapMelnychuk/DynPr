package com.company.sort;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class InsertionSortTest {



  @Test
  public void InsertionSort(){
    InsertionSort insertionSort = new InsertionSort();
    int[] arrayBeforeSort = new int[15];
    arrayBeforeSort[0] = -10000;
    arrayBeforeSort[1]= 10000;
    arrayBeforeSort[2]= 0;
    int[] arrayAfterSort = new int[15];;
    for (int i = 3; i < arrayAfterSort.length; i++) {
      arrayBeforeSort[i]  = (int)(-10000 + Math.random() * 10000);
    }
    System.arraycopy(arrayBeforeSort,0,arrayAfterSort,0,15);
    Arrays.sort(arrayAfterSort);
    Assert.assertArrayEquals(arrayAfterSort,insertionSort.sort(arrayBeforeSort));
  }
}
