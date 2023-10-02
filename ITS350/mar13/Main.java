package mar13;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numbers [] = new int [10];

        for (int i=0; i<numbers.length; i++) {
            numbers [i] = random.nextInt(100);
        }

        System.out.println("Before: ");
        display(numbers);
        mergeSort(numbers);
        System.out.println("After: ");
        display(numbers);
    }

    public static void display(int array[]) {
        for(int i =0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int array[]) {
        int length = array.length;
        if(length < 2) {
            return;
        }
        int midIndex = length/2;
        int leftPart [] = new int[midIndex];
        int rightPart[] = new int[length - midIndex];

        for(int i = 0; i<midIndex; i++) {
            leftPart [i] = array[i];
        }
        for(int i = midIndex; i<length; i++) {
            rightPart [i-midIndex] = array[i];

            mergeSort(leftPart);
            mergeSort(rightPart);
            merge(array, leftPart, rightPart);
        }
    }

    static void merge(int array[], int left[], int right[]) {
        int i=0, j=0, k=0;
        int leftSize = left.length;
        int rightSize = right.length;

        while(i<leftSize && j<rightSize) {
            if(left[i] < right[j]) {
                array[k] = left[i];
            }else {
                array[k] = right[j++];
            }
            k++;
        }
        while (i < leftSize) {
            array[k++] = left[i++];
        }
        while (j < rightSize) {
            array[k++] = left[j++];
        }
    }
}
