package com.array.www;

public class ArrayExercise02 {
    //定义main函数从这里执行
    public static void main(String[] args) {
        //问题：请求出一个数组int[]的最大值{4,-1,9,10,23};
        //分析：首先：先定义一个数组int  int[] arr = {4,-1,9,10,23}
        //     接着：假定arr[0]是最大值 maxIndex = 0;
        //     然后：从1开始遍历arr,如果max < arr当前元素 说明max不是当前的最大值，
        //     我们就把 当前元素赋值给max 把当前值赋值给maxIndex 对应的下标
        int[] arr = {4,-1,9,10,23,345,32,57,78,864,86,764};
        int max = arr[0];
        int maxIndex = 0;
        for(int i =1;i<arr.length;i++){
            //arr[i] 大于 max max就变成arr[i]
            if(arr[i] > max){

                max = arr[i];
                maxIndex = i;
            }
        }
        //把max和maxIndex输出到屏幕
    System.out.println("数组中最大值=" + max + "最大值数组的下标="+ maxIndex);


    }
}
