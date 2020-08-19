package sort;

import java.util.Collections;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: sort
 * Date: 2020/8/19 17:24
 */
public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{2,1};
        quickSort.sort(arr,0, arr.length-1);
        for (int i : arr) {
            System.out.print(i);
        }
    }
    void sort(int[] arr, int low, int high) {
        if (low >= high){
            return;
        }
        int p = partition(arr, low, high);
        sort(arr, low, p - 1);
        sort(arr, p + 1, high);
    }

    int partition(int[] arr, int low, int high) {
        int partKey = arr[low];
        while(low<high){
            while (low < high && arr[high] >= partKey) {
                high--;
            }
            swap(arr, low, high);
            while (low < high && arr[low] <= partKey) {
                low++;
            }
            swap(arr, low, high);
        }
        return low;
    }

    static void swap(int[] arr, int a, int b) {
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}
