package com.array.www;

public class ArrayCopy {
    //定义main函数  函数从这里开始执行
    public static void main(String[] args){
    /*    //定数组arr1{10,20,30}
    int[] arr1 ={10,20,30};
        //创建一个新的数组arr2，开辟新的数据空间
        //  大小 arr1.length
    int[] arr2 = new int[arr1.length];

    //遍历arr1，把每个元素拷贝到arr2对应的位置
    for(int i = 0; i < arr1.length;i++){
        arr2[i] = arr1[i];
    }
    for(int i = 0; i < arr1.length;i++) {
        System.out.println("数组arr2[" + i + "]=" + arr2[i]);
    }

*/
        /*首先定义一个arr1数组并赋值
        * 然后定义一个arr2数组
        * 然后把arr1数组赋值给arr2
        * 最后把arr2输出
        * */
   /*     int[] arr1 = {10,20,30};
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++ ){
            arr2[i] = arr1[i];

        }
        for(int i = 0;i < arr1.length; i++){
            System.out.println("arr2[" + i +"]=" + arr2[i]);
        }*/
        /*int n1 = 10;
        int n2 = n1;
        n2 = 80;
        System.out.println("n1="+ n1 + "    n2= " + n2 );*/
        //结论：只有n2变化

        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;
        arr2[0] = 10;
        for(int i = 0; i < arr1.length; i++ ){//数组长度=数组名.length
        System.out.println("arr2[" + i  +"] =" + arr2[i] );
        //结论：arr1数组和arr2数组都变化了
        }
        System.out.println(arr1);
    }
}
