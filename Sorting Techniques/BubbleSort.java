//Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.

public class BubbleSort {
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2,9,4};
        // time complexity = O(n^2)
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArr(arr);
    }
}
