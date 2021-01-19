package com.ty.leetcode.array;

/**
 * @author ：YangJinChuan
 * @date ：Created in 2020/10/13 11:48
 * @description：设计停车系统
 */
/*
ParkingSystem(int big, int medium, int small) 初始化 ParkingSystem 类，三个参数分别对应每种停车位的数目。
        bool addCar(int carType) 检查是否有 carType 对应的停车位。 carType 有三种类型：大，中，小，分别用数字 1， 2 和 3 表示。
        一辆车只能停在  carType 对应尺寸的停车位中。如果没有空车位，请返回 false ，否则将该车停入车位并返回 true 。
*/

public class LeetCode1603 {
    public static void main(String[] args) {
      LeetCode1603 leetCode1603=new LeetCode1603(1,1,0);
        System.out.println(leetCode1603.addCar(1));
        System.out.println(leetCode1603.addCar(1));
        System.out.println(leetCode1603.addCar(1));
        System.out.println(leetCode1603.addCar(3));
    }
    int [] nums=null;
    public LeetCode1603(int big, int medium, int small) {
      nums =new int[]{big,medium,small};
    }

    public boolean addCar(int carType) {
      return  nums[carType-1]-- >0;

    }
}
