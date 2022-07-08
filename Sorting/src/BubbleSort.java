import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {
        int []arr  = {5, 10, 6, 19, 11, 7, 9, 10};
        int size = arr.length;

        for (int i = 0; i < (size-i); i++){
            boolean swapped = false;
            for (int j = 0; j < (size-i-1); j++){
                if (arr[j] > arr[j+1]) {

                    int temp = arr [j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
        if (!swapped)
            break;
        }

       // for (int i = arr[i]; i < arr.length; i++)
        System.out.println(Arrays.toString(arr));
    }
//program ends
}
