package sort;

/**
 * Description:
 *
 * @author elijahliu
 * @Note Talk is cheap,just show me ur code.- -!
 * ProjectName:EAlgorithm
 * PackageName: sort
 * Date: 2020/8/19 21:38
 */
public class InsertSort {
    public void insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            for ( ;j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j + 1] = value;
        }
    }
}
