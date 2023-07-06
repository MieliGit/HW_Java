package org.example.HW_2_2;
import java.io.IOException;
import java.util.logging.*;
public class Task_1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_1.class.getName());
        FileHandler fh = new FileHandler("log1.txt");
        logger.addHandler(fh);
        logger.info("Sort Array");
        int [] array = {6, 2, 17, 0, -3, 33, -1};
        printArray(array);
        int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        printArray(newArr);
    }
    public static int[] listSort(int [] arr){
        for(int k = 0; k < arr.length-1; k++) {

            for (int i = 0; i < arr.length - k-1; i++){
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }


}