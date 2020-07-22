package QuickSort;

public class Main {

    public static void main(String[] args) {

        int arr[] = {10,7,8,9,1,5};
        int n = arr.length;

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, n-1);

        System.out.println("Sorted array using QuickSort algorithm");
        QuickSort.printArray(arr);

    }

}
