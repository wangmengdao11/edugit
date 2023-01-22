package com.array.www;
//数组的引出
public class Array01 {
    //编写一个main方法
    public static void main(String[] args){
        /*他们的体重分别是3kg，5kg，1kg，3.4kg，2kg，50kg
        请问这6只鸡的总体重是多少？平均体重是多少？

        思路分析
        1.定义6个变量 double 求和 得到总体重
        2.平均体重 = 总体重 / 6

        * */
        //定义6个double 类型的变量
     /*   double hen1 = 3;
        double hen2 = 5;
        double hen3 = 1;
        double hen4 = 3.4;
        double hen5 = 2;
        double hen6 = 50;


        //定义一个totalWeight 存放 123456变量相加  存放6个变量的和
        double totalWeight = hen1 + hen2 + hen3 + hen4 + hen5 + hen6;
        //定义一个avgWeight等于totalWeight除以6
        double avgWeight = totalWeight / 6;
        //打印到屏幕上
        System.out.println("总体重=" + totalWeight  + " 平均体重=" + avgWeight);
*/
        //用数组来解决上一个问题
         //定义一个数组 从0开始的数组
        double[] hens = {3,5,1,3.4,2,50,13};
        //遍历数组得到数组所有元素的和。使用for
        double totalWeight = 0;
        for(int i = 0; i < hens.length; i++){//遍历从0到6
            /*System.out.println("第" + (i+1) + "个元素的值=" + hens[i]);*/
            //把hens和totalWeight加起来装到totalWeight里面
            totalWeight += hens[i];


        }
        //把totalWeight和平均体重输出到屏幕
        System.out.println("总体重 = " + totalWeight + "平均体重= " + (totalWeight / hens.length));
        //把数组的长度输出到屏幕上
        System.out.println("数组的长度 =" + hens.length);
    }
}
