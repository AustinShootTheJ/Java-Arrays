package com.AustinShootTheJ;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // creates an array and initilizes it with user input by calling the getIntergers method.
        int[] myIntegers = getIntegers(5);
        System.out.println("The average is " + getAverage(myIntegers));

        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        // creates an int array with an index of 10.
        int[] myIntArray = new int[10];
        // creates an int array with an index of 5 and sets initial values.
        int[] myIntArray2 = {1,2,3,4,5};

        int[] myIntArray3 = new int [10];

        // assign array values using a for loop and the .length method.
        for (int i = 0; i < myIntArray3.length; i++)
        {
            myIntArray3[i] = i*10;
        }

        // sets value at index 4 to 50.
        myIntArray[5] = 50;

       // printArray(myIntArray);

        }


        // retrives ints from user input. and returns an array with those values.
        public static int[] getIntegers(int number){
            System.out.println("Enter " + number + " integer values.\r");
            int[] values = new int[number];

            for(int i=0; i<values.length; i++){
                values[i] = scanner.nextInt();
            }

            return values;

        }

        //calculates the average of the array.
        public static double getAverage(int[] array){
        int sum = 0;

        for(int i=0; i<array.length; i++){
                sum += array[i];
            }
            return (double)sum / (double)array.length;
        }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            System.out.println("element " + i + " value is " + array[i]);
        }


    }
}
