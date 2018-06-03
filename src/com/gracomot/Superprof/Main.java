package com.gracomot.Superprof;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Solution to Cafteria Responses
      /*  int[]responses = {1,3,4,5,2,3,4,5,5,3,1,2,4,5,2,3,5,1,3,4};
        int[] frequency = new int[6];// 0 - 4

        for(int i = 0; i < responses.length; i++)   {
            frequency[responses[i]]++;
            //frequency[5]++;
        }
        System.out.printf("%6s%10s%n","Rating", "Frequency");
        for(int i = 1; i <frequency.length; i++) {
            System.out.printf("%2d%6d",i,frequency[i]);
            System.out.println();
        }*/
            //Operations with Arrays Class
          /*int[] arr = {5,6,7,8,9,10,23,4,5,1};
          Arrays.sort(arr);
          int[] myarray = new int[5];
          Arrays.fill(myarray,10);

          int[]  sourcearray = {2,3,4,5,6,7};
          int[] destinationarray = new int[6];
          System.arraycopy(sourcearray,0,destinationarray,0,6);
          //System.arraycopy;
//          for(int i: destinationarray)   {
//              System.out.print(i+" ");
//          }
          //System.out.println(Arrays.equals(sourcearray,arr));

          System.out.println(Arrays.binarySearch(arr,30));*/
        ArrayList<Integer> mynumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        mynumbers.add(8);
        mynumbers.add(3);
        mynumbers.add(9);

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red","Blue","Yellow","Green"));
        colors.add("Purple");

        colors.clear();

        colors.add("Pink");
        for (String i: colors){
            System.out.print(i+" ");
        }

    }
}
