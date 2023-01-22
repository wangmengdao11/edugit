package com.array.www;

public class ArrayAdd {
    //定义main函数

    public static void main(String[] args){
        //问题：添加数组
        /*
        * 首先定义一个数组arr
        * 然后定义另一个数组[arr.length+1]
        * 然后循环遍历arr[]赋值arrNew[]
        * 然后把4赋值给arrNew[arr.length-1]
        * 最后输出arr
        *
        * */
        int[] arr = {1,2,3};
        int[] arrNew = new int[arr.length + 1];
        //遍历arr数组，依次将arr的元素拷贝到arrNew数组
        for(int i = 0;i < arr.length;i++){
            arrNew[i] = arr[i];
        }
        //把4赋给arrNew[arrNew.length - 1] = 4;
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew; 
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
