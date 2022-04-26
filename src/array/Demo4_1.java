package array;

import java.util.Arrays;

public class Demo4_1 {
    public static void main(String[] args) {
        int[] arr={12,47,34,34,5,6,3,45,25,64,2,5,69,6,2,456,2,5,56};
        System.out.println("排序前："+ Arrays.toString(arr));
        System.out.println("排序后："+Arrays.toString(chapai(arr)));
    }
    public static int[] chapai(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while (j>=0&&temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
