package array;

import java.util.Arrays;
//冒泡排序
public class Demo2 {
    public static void main(String[] args) {
        int[] arr={12,47,34,34,5,6,3,45,25,64,2,5,69,6,2,456,2,5,56};
        System.out.println(Arrays.toString(maopao(arr)));
    }
    public static int[] maopao(int[] arrs){
        for (int i = 0; i <arrs.length ; i++) {
            for (int j = 0; j <arrs.length-1-i ; j++) {
                if (arrs[j]>arrs[j+1]){
                    swap(arrs,j,j+1);
                }
            }
        }
        return arrs;
    }
    public static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
