

import java.io.*;
import java.util.*;
public class SplitSumArray {


        public static void main(String[] args) {
            int[] arr=     {10, 4, -8, 7};
            System.out.println(splitIntoTwo(arr));
        }

        public static int splitIntoTwo(int[] arr) {
            int total = 0;
            for(int i = 0 ; i < arr.length; i++) {
                total += arr[i];
            }

            int count = 0;
            int leftSum = 0, rightSum = total;
            for(int i = 0 ; i < arr.length - 1; i++) {  // remove the last case
                leftSum += arr[i];
                rightSum -= arr[i];
                if(leftSum > rightSum ) {
                    count++;
                }
            }
            return count;
        }



}
