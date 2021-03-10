package mian3_10;
/*单例模式：
恶汉式：
直接创建实例对象，在类初始化时就会有这个对象，不管是否需要这个对象

恶汉式不存在线程安全问题

1）构造器私有化 private 类名
2）自行创建，并且用静态变量保存： 创建实例在类里面创建，添加static
3)向外提供这个实例：创建实例时写为public方法
4）强调是个单例，用final修饰，不可更改

 */
public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1(); //创建单例实例

    private Singleton1(){
        //构造器私有化
    }
}

/*
调用该实例对方法
Singleton1 s = Singleton1.INSTANCE
 */
