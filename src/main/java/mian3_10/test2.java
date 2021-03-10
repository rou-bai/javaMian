package mian3_10;

public class test2 {
    public static void mian(String[] args){
        int i = 1;
        String str = "hello";
        Integer num = 200;
        int[] arr = {1,2,3,4,5};
        MyData my = new MyData();
        change(i, str, num, arr, my);

        //执行change后打印以上参数，看变化

    }
    public static void change(int j, String s, Integer n, int[] a, MyData m){
        j += 1;
        s += "world";
        n += 1;
        a[0] += 1;
        m.a += 1;

    }
}

class MyData{
    int a = 10;
}

/*
最终结果：
i= 1;
str = "hello"
num = 200
arr = [2, 2, 3, 4 ,5]
my = 11;

总结：
方法的参数传递机制：
1。形参是基本数据类型：传递指
2。实参是引用数据类型：传递地址值
一些特殊的类型：String,包装类对象如Integer等具有不变性，同时也是实参
 */