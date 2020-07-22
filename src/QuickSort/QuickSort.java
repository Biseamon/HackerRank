package QuickSort;

public class QuickSort {

       public int partion(int arr[], int low, int high){

           int pivot = arr[high];
           int i = low -1; //index of the smaller element
           for (int j = low; j < high; j++) {

               //If the current element is smaller than the pivot
               if (arr[j] < pivot){
                   i++;

                   //swap arr[i] and arr[j].
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }

           }

           //Swap arr[i + 1] and arr[high] or (pivot).
           int temp = arr[i + 1];
           arr[i + 1] = arr[high];
           arr[high] = temp;

           return i + 1;
       }

    /**
     * The main function that implements QuickSort()
     * arr[] --> Array to be sorted,
     * low --> Starting index,
     * high --> Ending index.
     */

    public void sort(int arr[], int low, int high){

        if(low < high){
            int pi = partion(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr,pi+1,high);
        }

    }

       public static void printArray(int arr[]){

            int n = arr.length;
           for (int i = 0; i < n; ++i) {
               System.out.println(arr[i] + " ");
           }
           System.out.println();
       }

}
