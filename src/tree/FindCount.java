package tree;

import java.util.Arrays;
import java.util.Random;

public class FindCount {
    public static void main(String[] args) {
        int[] arr=new int[100];
        for (int i = 0; i < 100; i++) {
          arr[i] = new Random().nextInt(1000);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(nearestIndex(arr, 14, 56));
    }
    public static int nearestIndex(int[]arr,int R,int value){
        int L=0;
        int index=R;
        while (L<R){
            int mid=L=((R-L)>>1);
            if(arr[mid]>=value){
                index=mid;
                R=mid-1;
            }else {
                L=mid+1;
            }
        }
        return index;
    }
    public static int findMax(int[] arr,int L){
        int max=0;
        int right=0,left=0,length=arr.length;
        while (left<length){
            while (right<length&&arr[right]-arr[left]>=L){
                right++;
            }
            max= Math.max(max,right-left);
            left++;
        }
        return max;

    }
    
}
