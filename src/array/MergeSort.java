package array;

public class MergeSort {
    public static int[] mergeSort(int[] arr,int low,int high){
        if (low<high){
           int  mid=low+(high-low)/2;
           mergeSort(arr,low,mid);
           mergeSort(arr,mid+1,high);
           merge(arr,low,mid,high);
        }
        return arr;
    }
    public static int[] merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high];
        int left=low,right=mid+1,tindex=0;
            while (left<mid&&right<high){
                if (arr[left]<arr[right]){
                    temp[tindex]=arr[left];
                    left++;
                    tindex++;
                }else {
                    temp[tindex]=arr[right];
                    right++;
                    tindex++;
                }
                while (left<mid){
                    temp[tindex++]=arr[left++];
                }while (right<high){
                    temp[tindex++]=arr[right++];
                }
            }

        return temp;
    }
}
