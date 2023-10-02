package mar1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int myArray[] = {3, 4, 6, 10, 2, 7};

        
        AlgorithmSorting.bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));


        AlgorithmSorting.selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
