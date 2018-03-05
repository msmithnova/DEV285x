import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] lst) {
        // get the length
        int n = lst.length;
        for (int i = 0; i < n; i++) {
            int index = i;
            int smallest = lst[i];
            for (int j = i; j < n; j++) {
                if (lst[j] < smallest) {
                    smallest = lst[j];
                    index = j;
                }
            }
            int temp = lst[i];
            lst[i] = lst[index];
            lst[index] = temp;
            System.out.println(Arrays.toString(lst));
        }
    }

    public static void main(String[] args) {
        int[] lst = {4,9,7,1,3,6,5};
        selectionSort(lst);
        System.out.println(Arrays.toString(lst));
    }
}
