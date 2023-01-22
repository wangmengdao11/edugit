package com.array.www;
import java.util.Scanner;
public class Array03 {
    //创建main函数
    public static void main(String[] args){
        //定义输入
        Scanner myScanner = new Scanner(System.in);
        //定义数组
        int[] arr = {1,3,5};
        do{
            //定义一个新数组
            int[] arrNew = new int[arr.length + 1];//中括号里面是数量
            //把arr赋值给arrNew
            for(int i = 0; i < arr.length ; i++){
                arrNew[i] = arr[i];
            }
          /*  for(int i = 0;i < arr.length; i++){
            System.out.print("请开始下次输入"+ arr[i]);
            }*/
            System.out.println("请输入您要添加的数");
            //输入的数给最后一个地址
            arrNew[arrNew.length -1 ] = myScanner.nextInt();//现在中括号里面是自己的下标-1
            //新数组给就数组
            arr = arrNew;

            //输出
            for(int i = 0; i < arrNew.length ;i++){
                System.out.print(arrNew[i] + "\t");
            }
            //判断继续输出
            System.out.println("您还要输入么,请输入y/n");
            char key = myScanner.next().charAt(0);
            if(key == 'y'){
                continue;

            }else if(key == 'n'){
                break;
            }else{
                System.out.print("您输入有误");
                break;
            }
        }while(true);
        System.out.println("结束退出");
    }
}
/*总结  arr和arrNew下标 问题  越界要看清楚*/
