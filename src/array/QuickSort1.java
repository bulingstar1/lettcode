package array;

import java.util.Arrays;
import java.util.Random;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] arr=new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i]=new Random().nextInt(100);
        }
        System.out.println("排序前："+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后："+Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int lower,int higher){
        if (lower>=higher) return;
        int left=lower;
        int right=higher;
        int  temp=arr[lower];
        while (left<right){
            while (right>left&&arr[right]>=temp) right--;
            while (left<right&&arr[left]<=temp) left++;
            if(left<right){
                swap(arr,left,right);
            }
        }
        arr[lower]=arr[left];
        arr[left]=temp;
        quickSort(arr,lower,left-1);
        quickSort(arr,left+1,higher);
    }
    public static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
