package mian3_10;
/*
单例模式-懒汉式:线程不安全，适合单线程
延迟创建实例对象
1）构造器私有化
2）用一个静态变量保存这个唯一对实例
3）提供一个静态方法，获取实例对象
 */
public class Singleton4 {
    private static Singleton4 instance; //私有化，只有通过静态方法调用去获取实例
    private Singleton4(){

    }
    public  static Singleton4 getInstance(){
        if(instance == null){
            instance = new Singleton4();
        }
        return instance;
    }
}
/*
获取单例方法
Singleton4 s = Singleton4.getInstance();
 */

