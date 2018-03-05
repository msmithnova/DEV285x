import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] lst) {
        int n = lst.length;
        boolean swapped;
        do
        {
            swapped = false;
            for (int i = 0; i < n-1; i++) {
                if (lst[i] > lst[i+1]) {
                    int temp = lst[i];
                    lst[i] = lst[i+1];
                    lst[i+1] = temp;
                    swapped = true;
                }
            }
        } while (swapped == true);

        System.out.println(Arrays.toString(lst));
    }

    public static void main(String[] args) {
        int[] lst = {4,9,7,1,3,6,5};
        bubbleSort(lst);
    }
}
