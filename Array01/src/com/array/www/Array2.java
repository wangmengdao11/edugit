package com.array.www;
import java.util.Scanner;
public class Array2 {

    //程序从这里执行，main方法
    public static void main(String[] args){
        //步骤
        //首先创建一个double数组，大小5
        //double scores[] = new double[5];
        double scores[];
        scores =new double[5];
        //然后创建键盘输入
        Scanner myScanner = new Scanner(System.in);
        //把输入的数给创建的数组
        for(int i = 0;i < scores.length; i++) {
            System.out.println("请输入第" + (i+1) + "个元素的值");
            scores[i] = myScanner.nextDouble();
        }

        for(int i = 0; i < scores.length; i++){
            System.out.println("请输入第" + (i +1) + "个元素的值 = " + scores[i]);
        }

    }
}
//运行的时候把键盘上输入的数字给Scanner，Scanner赋值给scores数组。然后把数组打印出来
