import java.util.Arrays;

/*
 * For this assignment, I will be implementing Bubble Sorting as it is the simplest sorting
 * algorithm that works by repeatdly swapping teh adjacent elements if they are in the 
 * wrong position. I will be using Java as my programming language of choice. 
 */

class BubbleSorting{
    static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n-1; i++){
            swapped = false;
            for(j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            //If no two elements were swapped by inner loop, then break
            if(swapped == false)
                break;
        }
    }

    //Function to print an array
    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        System.out.printf("Original array: %n%s%n",Arrays.toString(arr));

        int n = arr.length; // length of the array
        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}