package array;


import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,7,3,65,3,8};
        System.out.println(Arrays.toString(getAdd(arr, 10)));
        System.out.println(getList(arr, 10));
    }
    public static int[] getAdd(int[] array, int a){
        int b;
        int[] arrays=new int[2];

        for (int i = 0; i < array.length-1; i++) {
            for (int j=i+1;j<array.length;j++){
                b=array[i]+array[j];
                if (b==a){
                    arrays[0]=i;
                    arrays[1]=j;
                    return  arrays;
                }
            }
        }
        return null;
    }

    public static List getList(int[] array, int a){
        int b;
        ArrayList<List> list = new ArrayList<>();
        for (int i = 0; i < array.length-1; i++) {
            for (int j=i+1;j<array.length;j++){
                b=array[i]+array[j];
                if (b==a){
                    ArrayList<Object> list1 = new ArrayList<>();
                    list1.add(i);
                    list1.add(j);
                    list.add(list1);
                }
            }
        }
        return list;
    }
}