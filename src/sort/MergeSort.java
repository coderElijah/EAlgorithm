package sort;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: sort
 * Date: 2020/8/19 16:46
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 7, 9, 5, 8};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    static void sort(int[] arr, int head, int tail) {
        if (head >= tail) {
            return;
        }
        int mid = head + (tail - head) / 2;
        sort(arr, head, mid);
        sort(arr, mid + 1, tail);
        merge(arr, head, mid, tail);
    }

    private static void merge(int[] arr, int head, int mid, int tail) {
        int[] copy = arr.clone();
        int k = head, l = head, h = mid + 1;
        while (k <= tail) {
            if (l > mid) {
                arr[k++] = copy[h++];
            } else if (h > tail) {
                arr[k++] = copy[l++];
            } else if (arr[l] < arr[h]) {
                arr[k++] = copy[l++];
            } else {
                arr[k++] = copy[h++];
            }
        }
    }
}
