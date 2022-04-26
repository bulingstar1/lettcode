package array;

//快速排序
public class Demo6 {
    public static void main(String[] args) {

    }
    public static int[] kuaipai(int[] arr,int left,int right){
        if (left<right){
            int mid=get_mid(arr,left,right);
            kuaipai(arr,0,mid-1);
            kuaipai(arr,mid+1, arr.length);
        }
        return arr;
    }
    public static int get_mid(int[] arr,int left,int right){
        int i=left,j=right;
        int mid=arr[right];
        while (i<j){
            while (i<j&&arr[j]>mid)j--;
            while ((i<j&&arr[i]<mid)) i++;
            if ((i<j)){
               swap(arr,i,j);
            }
            left=mid;
        }
        return left;
    }
    public static void swap(int[] arr, int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
