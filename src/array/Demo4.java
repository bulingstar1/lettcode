package array;


import java.util.Arrays;

//插入排序算法
//  时间复杂读n2,空间O(1)
public class Demo4 {
    public static void main(String[] args) {
        int[] arr={12,47,34,34,5,6,3,45,25,64,2,5,69,6,2,456,2,5,56};
        System.out.println("排序前："+Arrays.toString(arr));
        System.out.println("排序后："+Arrays.toString(chapai(arr)));
    }
    public static int[] chapai(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
           int j=i+1;
            while (j>0&&arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        return arr;
    }
    public static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
