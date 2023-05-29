package org.example;

public class Main {
    public static void main(String[] args) {
     int [][] jaggedArray = {{2,4,10},{12,4},{100,99},{4},{3,2,99},{0}};
        int maxNumber = findMax(jaggedArray);
        System.out.print("Maximum number : " + maxNumber);
    }
    public static int findMax(int [][] jaggedArray){
        int maxNo = Integer.MIN_VALUE;

        for(int [] innerArr : jaggedArray){
            for(int num : innerArr){
                if(num > maxNo){
                    maxNo = num;
                }
            }
        }
        return maxNo;

    }
}


//    Find the maximum number in a jagged array of numbers or array of numbers.
//        Input: [2, 4, 10, [12, 4, [100, 99], 4], [3, 2, 99], 0]
