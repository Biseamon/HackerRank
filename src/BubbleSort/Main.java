package BubbleSort;

public class Main {

    public static void main(String[] args) {

        BubbleSort bs = new BubbleSort();
        int arr[] = {64,32,35,11,22,12,90};
        bs.bubbleSort(arr);
        System.out.println("Sorted!");
        bs.printArray(arr);

    }

}
