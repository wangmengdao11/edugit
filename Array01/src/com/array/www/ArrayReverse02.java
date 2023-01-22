package com.array.www;
//定义新数组出错 new为创建数组空间  int[] arr1 只声明了一下定义数组分为名称和空间的
//目标就是把一个数组反转过来 在原来数组和新创立一个数组
public class ArrayReverse02 {
    //定义main函数 从这里开始
    public static void main(String[] args){
        //定义数组
        int[] arr = {11,22,33,44,55,66};
        //分析 定义数组2
        int[] arr1=new int[arr.length];
        for(int i = 0;i < arr.length; i++){
            arr1[i] = arr[arr.length-i-1];
        }
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr1[i]+"\t");
        }


    }

}
