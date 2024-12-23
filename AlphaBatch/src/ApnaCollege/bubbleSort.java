package ApnaCollege;

public class bubbleSort {

    public static void main(String[] args) {
        int arr[] = {5, 6, 9, 6, 3, 7, 5, 6,3,4,5,5,6,3,34,55,66,77,88,99};
        int n = arr.length;
        
        // Bubble sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swapping
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Printing the sorted array
        
        printbubblesort(arr);
    
    
    }
    
    
    static void printbubblesort(int arr[]) {
    	int n = arr.length;
    	
    	for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
