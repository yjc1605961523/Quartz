package com.ty.sort;

/***
 *冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int [] data={5,1,2,7,3,4,8,9,6};
    //外层循环长度-1,内层循环长度-1-i ,(j>j+1)如果当前项比后面的大,就调换位置
        for (int i = 0; i <data.length-1 ; i++) {
            for (int j = 0; j <data.length-1-i ; j++) {
                if (data[j]>data[j+1]){
                   /* int temp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;*/
                    data[j]^=data[j+1];
                    data[j+1]^=data[j];
                    data[j]^=data[j+1];

                }
            }
        }
        for (int i = 0; i <data.length ; i++) {
            System.out.print(data[i]+"\t");
        }
    }
}
