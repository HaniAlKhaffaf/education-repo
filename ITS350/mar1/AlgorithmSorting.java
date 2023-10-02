package mar1;

// We have multiple types of sorting algorithms

// 1- Bubble sorting -------
// in bubble sorting, we compare the first number with the number next to it, if
// it is smaller then we swap, if it isnt, we dont. we keep doing this, by the end
// of the first step, we will have the largest number on the right, we keep 
// comparing till all numbers are compared
// complexity is N^2

// 2- Selection sorting -------
// for selection sorting, we keep comparing, but at first we assume that the
// smallest number is the smallest we have, then we keep comparing the smallest
// with the other elements until we find a smaller number, thats when we
// we will consider the new smaller element the smallest, at the end of the
// step, we will replace the smallest with the element at the first on the left
// then we go for the second step, in which we will leave out the first 
// element (which is the smallest we found the last step), then we repeat 
// everything we did for step one, but starting with the second element, then
// at the end the smallest one we found, we will swap it with the second
// element on the right and keep on until the whole arraylist will be sorted



// bubbleSort using Array ->
public class AlgorithmSorting {
    static void bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            boolean isSorted = true;
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j]>arr[j+1]) {
                    isSorted = false;
                    swap(arr, j, j+1);
                }
            }if(isSorted)
                return;
        }
    }

    // bubbleSort using nodes ->
    // void bubbleSort() {
    //     if (size > 1) {
    //         for (int i = 0; i < size; i++) {
    //             Node currentNode = head;
    //             Node nextNode = head.next;
    //             for (int j = 0; j < size) {
    //                 if (currentNode.val>nextNode.val) {
    //                     int temp = currentNode.val;
    //                     currentNode.val = nextNode.val;
    //                     nextNode.val = temp;
    //                 }
    //                 currentNode = nextNode;
    //                 nextNode = nextNode.val;
    //             }
    //         }
    //     }
    // }

    static void swap(int arr[], int n1, int n2) {
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }

    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }if(minPos != i)
                swap(arr, i, minPos);
        }
    }
    
}
