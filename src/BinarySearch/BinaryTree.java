package BinarySearch;

public class BinaryTree {


    //That is a recursive solution of finding element using Binary Search
    public int binarySearch(int arr[], int firstNumber, int lastNumber, int index){

            //The method returns the index from an array that starts with firstNumber and ends with lastNumber.
            // Otherwise returns -1.
            if(lastNumber >= firstNumber){
                int mid = firstNumber + (lastNumber - firstNumber) / 2;

                //if the mid element is equal to index then return true;
                if (arr[mid] == index)
                    return mid;

                //if element mid is bigger than the needed index then use recursion decreasing the mid element until is found the right element.
                if(arr[mid] > index){
                    return binarySearch(arr, firstNumber, mid - 1, index);
                }

                //like else it finds an element by increasing the mid element by 1 until the right element is found.
                return binarySearch(arr, mid + 1, lastNumber, index);
            }

            //Here we get error if we don't have the element in the array
        return -1;
    }

}
