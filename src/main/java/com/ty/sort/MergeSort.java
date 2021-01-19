package com.ty.sort;

/**
 * 归并排序
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] data = {5, 1, 2, 7,3, 4, 8, 9, 6};
        mergeSort(data, 0, data.length - 1);

        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+"\t");
        }
    }

    //两路归并
    private static void merge(int[] data, int left, int mid, int right) {
        int[] temp = new int[data.length];
        int p1 = left;
        int p2 = mid + 1;
        int k = left;
        while (p1 <= mid && p2 <= right) {
            if (data[p1] <= data[p2])
                temp[k++] = data[p1++];
            else
                temp[k++] = data[p2++];
        }
        while (p1 <= mid)
            temp[k++] = data[p1++];
        while (p2 <= right)
            temp[k++] = data[p2++];
        for (int i = left; i <=right; i++) {
            data[i] = temp[i];
        }
    }


    private static void mergeSort(int[] data, int start, int end) {
        //当子数组里只有一个元素时结束递归
        if (start < end) {
            int mid = (start + end) / 2;  //界限
            //分
            mergeSort(data, start, mid);      //左
            mergeSort(data, mid + 1, end);//右
            //合
            merge(data, start, mid, end);
        }
    }
}
