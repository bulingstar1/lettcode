package array;

import java.util.Arrays;

//希尔排序
public class Demo5 {
    public static void main(String[] args) {
        int[] arr={12,47,34,34,5,6,3,45,25,64,2,5,69,6,2,456,2,5,56};
        System.out.println(Arrays.toString(xier(arr)));
    }

    public static int[] xier(int[] arr) {
        if (arr.length > 0) {
            //希尔增量，每次除半
            int gap = arr.length / 2;
            while (gap>0){//经过递减，gap最后的值会是1
                for(int i=gap;i<arr.length;i++){//带增量的希尔排序
                    int value=arr[i];
                    int p=i-gap;
                    while (p>=0&&value<arr[p]){
                        arr[p+gap]=arr[p];
                        p=p-gap;
                    }
                    arr[p+gap]=value;
                }
                gap=gap/2;
            }

        }
        return arr;
    }
}