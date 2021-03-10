package mian3_10;
/*
懒汉式-单例模式
静态内部类不会自动随着外部类对加载和初始化而初始化，她是单独加载和初始化
因为是在内部类加载和初始化时创建的，所以是线程安全的
 */

public class Singleton6 {
    private Singleton6(){

    }

    private static class Inner{
        //内部类
        private static final Singleton6 INSTANCE = new Singleton6();
    }

    public static Singleton6 getInstance(){
        return Inner.INSTANCE;
    }
}

/*
调用方法
Singleton6 s = Singleton6.getInstance();
 */


/*
总结：
饿汉式：
1。直接实例化
2。枚举值
3。静态代码块

懒汉式
1。线程不安全，提供一个静态接口
2。线程安全，静态接口基础上增加锁
3。静态内部类
 */