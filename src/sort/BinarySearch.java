package sort;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: sort
 * Date: 2020/8/21 15:36
 */
public class BinarySearch {
    public boolean BinarySearch1(int[] arr, int target) {
        int low = 0, high = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean BinarySearch2(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    boolean search(int[] arr, int target, int low, int high) {
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return true;
        }else if(arr[mid]>target){
            return search(arr, target, low, mid - 1);
        }else{
            return search(arr, target, mid + 1, high);
        }
    }
}
