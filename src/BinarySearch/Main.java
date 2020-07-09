package BinarySearch;

public class Main {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        //Given an array
        int arr[] = {2, 3, 4, 10, 40};
        //Here we get the array length.
        int num = arr.length;
        //index to be found. Index is equal to 10;
        int x = 10;
        //result is the method using the arr. Starts at 0 index, ends at the last index. x is the index needed.
        int result = binaryTree.binarySearch(arr, 0, num - 1, x);
        //if the index doesn't exist returns false.
        if (result == -1){
            System.out.println("Element not present");
        }
        else{
            //here if the result is true
            System.out.println("Element found at index " + result);
            System.out.println();
        }

    }

    

}
