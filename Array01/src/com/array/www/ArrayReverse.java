package com.array.www;

public class ArrayReverse {
    //定义main函数从这里开始执行
    public static void main(String[] args){
        //定义一个整型数组 int类型 4个字节 名称为arr的数组
        int[] arr = {11,22,33,44,55,66,77,88,99};
        //变成{66,55,44,33,22,11}{66,55,44,33,22,11}
        /*思路分析
        1.arr[0]和arr[5]进行交换{66,22,33,44,55,11}
        2.arr[1]和arr[4]进行交换{66,55,33,44,22,11}
        3.arr[2]和arr[3]进行交换{66,55,44,33,22,11}
        4.一共要交换3次 = arr.length / 2
        5.每次交换时，对应的下标是 arr[i]和arr[arr.length - 1 - i]
        * */
        //代码
        int a = 0;
        //分析 这一步最为关键 能看出0 - 5  1 - 4  2 - 3   arr.length = 6 和 i
        // 然后分析0 - 5 = length - 1;1 - 4 = length -2 ; 2 - 3 =length - 3
        //用通用的方式来run length - 1 - i 当i=0时 6 - 1 - 1 = 5；当i = 1时 6 - 1 - 1 = 4;当i = 2时 6 - 1 - 2=3;

        for(int i = 0;i < arr.length/2; i++){
            // {66,55,44,33,22,11}
            a= arr[i]; //值传递  找出值的地址
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = a;
        }
        //找规律的时候 把 0 和 最后的值数字联系起来  数学抽象化
        //0=5 6-1  1=4 6-1-1 2=3 6-1-2
       /* for(int i = 0;i < arr.length/2; i++){
            arr[arr.length - 1 - i]=arr[i];
        }*/
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");//斜杠
        }
    }
}
