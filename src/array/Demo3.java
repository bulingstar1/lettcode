package array;

import java.util.Arrays;

//选择排序
public class Demo3 {
    public static void main(String[] args) {
        int[] arr={12,47,34,34,5,6,3,45,25,64,2,5,69,6,2,456,2,5,56};
        System.out.println(Arrays.toString(xuanze(arr)));

    }
    public static int[] xuanze(int[] arr){
//        for (int i = 0; i <arr.length ; i++) {
//            int min=i;
//            for (int j = i; j <arr.length; j++) {
//                if(arr[min]>arr[j]){
//                    min=j;
//                }
//            }
//            swap(arr,i,min);
//        }
//        return arr;

        for (int i = 0; i <arr.length ; i++) {
            int min=arr[i],k=i;
            for (int j = i; j <arr.length; j++) {
                if(min>arr[j]){
                    min=arr[j];
                    k=j;
                }
            }
            swap(arr,i,k);
        }
        return arr;
    }
    public static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
