package array;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=new Random().nextInt(100);
        }
        System.out.println("排序前："+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后："+Arrays.toString(arr));
    }
    public static void quickSort(int[]arr, int left,int right){
        if(left>=right) return;
        int mid=sort(arr,left,right);
        quickSort(arr,left,mid-1);
        quickSort(arr,mid+1,right);
    }
    public static int sort(int[] arr,int lower,int higher){
        int left=lower;
        int right=higher-1;
        int mid=lower+(higher-lower)/2;
        int temp=arr[mid];
        while (true){
            while (right>left&&arr[right]>=temp) right--;
            while (left<right&&arr[left]<=temp) left++;
            if (left>right) break;
            swap(arr,left,right);
        }
        swap(arr,left,mid);
        return left;
    }
    public static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
