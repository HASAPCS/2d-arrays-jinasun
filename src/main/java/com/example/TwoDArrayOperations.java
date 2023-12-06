package com.example;

public class TwoDArrayOperations {

    public static void main(String[] args) {
        int row = 3;
        int column = 4;
        int[][] twoDArray = new int [row][column];

        for (int i = 0; i < row;i++){
            for (int j = 0; j < column; j++){
                twoDArray[i][j] = j;
                System.out.print(twoDArray[i][j]);
            }
        }
        // Exercise 1: Initialize and Print a 2D Array
        // TODO: Initialize a 2D array of integers and print its contents in a matrix form.
    }

    // Exercise 2: Find the Maximum Value in a 2D Array
    public static int findMaximumValue(int[][] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j]>max){
                    max = array[i][j];

                }
            }
        }
        // TODO: Implement the logic to find the maximum value in the 2D array.
        return max; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] == value){
                    return true;
                }
            }
        }
        // TODO: Implement the logic to check if the 2D array contains the specified value.
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                sum += array[i][j];
                count ++;

            }
        }
        // TODO: Implement the logic to calculate the average of all elements in the 2D array.
        return sum/count; // Placeholder return value
    }

    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i <array.length; i++){
            sum+=array[i][i];
        }
        // TODO: Calculate and return the sum of diagonal elements in the 2D array.
        return sum; // Placeholder return value
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        int count = 0;
        // check total length required for flattened array
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[i].length;j++){
                count++; //count = count + 1
            }
        }
        int[] flattenArray= new int[count];
        int count2 = 0;

        //write all the elements to flattened array
        for (int i = 0; i<array.length;i++){
            for (int j = 0; j<array[i].length;j++){
                flattenArray[count2] = array[i][j];
                count2++;
            }
        }
        // TODO: Implement the logic to flatten the 2D array into a 1D array.
        return flattenArray; // Placeholder return value
    }
}