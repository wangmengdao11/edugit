package com.array.www;
import java.util.Scanner;
public class ArrayAdd02 {
    //定义main函数 从这里开始执行
    public static void main(String[] args){
        //首先:new一个输入
       /* Scanner myScanner = new Scanner(System.in);
        //然后:定义一个数组{1,2,3}
        int[] arr = {1,2,3};*/
        //然后:用do  while    循环
        /*do{
            //然后:定义一个新数组
            int[] arrNew = new int[arr.length + 1];//数组扩容 每次都扩容一下
            //然后：遍历arr数组 ,依次将arr的元素拷贝到arrNew数组
            for(int i = 0;i < arr.length;i++){//把arr[i]赋值给arrNew[i]
                arrNew[i] = arr[i];
            }
            System.out.println("请输入你要添加的元素");
            //然后：把输入的int赋值给要添加的addNum变量
            int addNum = myScanner.nextInt();//addNum
            //然后：把要添加的值addNum赋给arrNew最后一个元素
            arrNew[arrNew.length - 1] = addNum;
            //然后让arr 指向 arrNew, 现在arr就是arrNew
            arr = arrNew;

            System.out.println("====arr扩容后的元素情况====");
            //然后：把arr输出
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
            //然后：问用户是否继续
            System.out.println("是否继续添加 y/n");
            char key = myScanner.next().charAt(0);
            if( key == 'n');{
                break;
            }

        }while(true);*/
        /*
        * 目的能够一直加入一个数
        * 先创建一个数组
        * 然后把原来的数组赋值给他
        * 然后创造一个中间数
        * 然后把输入的增添的数给这个中间数
        * 把中间的数给这个新建立数组的最后一位
        * 然后把扩容后的数组输出
        * 然后定义一个变量接收字符 如果是n的话退出*/
        //首先：定义一个输出  等号前面两个给空间去一个名字 等号后面实例化new生成一个事物，比如婴儿是人类的实例。new一个婴儿
        Scanner myScanner = new Scanner(System.in);
        //然后:定义一个数组{1,2,3}
        int[] arr = {1,2,3};
        do{

            //然后:定义一个原数组加1的新数组
            int[] arrNew = new int[arr.length + 1];//数组扩容 每次都扩容一下
            //然后：遍历arr数组 ,依次将arr的元素拷贝到arrNew数组
            for(int i = 0;i < arr.length;i++){//把arr[i]赋值给arrNew[i]
                arrNew[i] = arr[i];
               // System.out.println(arrNew[i]);
            }
            System.out.println("请输入你要添加的元素");
            arrNew[arrNew.length - 1] = myScanner.nextInt();//nextInt从键盘接收int值
            /*int addNum = myScanner.nextInt();//addNum
            //然后：把要添加的值addNum赋给arrNew最后一个元素
            arrNew[arrNew.length - 1] = addNum;*/
            //然后让arr 指向 arrNew, 现在arr就是arrNew
            arr = arrNew;



            System.out.println("====arr扩容后的元素情况====");
            //然后：把arr输出
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }




            //然后：问用户是否继续
            System.out.println("是否继续添加 y/n");
            //charAt返回索引处的字符  只有next返回全部string 加charAt(0)
            //String key1 = myScanner.next();
            //System.out.println(key1);
            //字母是字符 输入一个字符 判断返回字符串第一个字符如果不是n的话就重来


                char key = myScanner.next().charAt(0);
                //System.out.println(key);
                if (key == 'n') {
                    break;
                } else if (key == 'y') {
                    System.out.println("您将继续输入");
                    continue;
                } else {
                    System.out.println("您的输入有误，请等待下一次输入");
                    break;
                }


        }while(true);

        //System.out.print("你退出了添加...");
    }
}
