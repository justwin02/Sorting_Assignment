import java.util.Arrays;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arr_size = 0;
        if(scanner.hasNextInt()){
            arr_size = scanner.nextInt();
            scanner.nextLine();

            // Initliaze the size of the array
            int[] arr = new int[arr_size];

            System.out.println("Enter the elements for the array in one line: ");
            String line = scanner .nextLine();
            String[] elements = line.split(" ");

            if(elements.length == arr_size){
                for(int i = 0; i < arr_size; i++){
                    try{
                        arr[i] = Integer.parseInt(elements[i]);
                    }catch(NumberFormatException e){
                        System.err.println("Error: not a valid integer at position " + (i+1));
                        return;
                    }
                }

                // Copy original array before sorting
                int[] originalArr = Arrays.copyOf(arr, arr_size);
                System.out.println("Original array: ");
                printArray(originalArr, arr_size);

                bubbleSort(arr,arr_size);
                System.out.println("Bubble Sorted array: ");
                printArray(arr, arr_size);

            }else{
                System.err.println("Error: Number of elements does not match the specified array size.");
            }
            
        }else
            System.err.println("Error: Not an integer");

        scanner.close();
    }
}