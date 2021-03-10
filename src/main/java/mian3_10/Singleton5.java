package mian3_10;
/*
懒汉式-单例模式：线程安全，适合多线程
 */
public class Singleton5 {
    private static Singleton5 instance; //私有化，只有通过静态方法调用去获取实例
    private Singleton5(){

    }
    public  static Singleton5 getInstance(){
        if(instance != null) {
            synchronized (Singleton5.class) {  //这个关键字可以防止多个线程访问这个类,相当于加了一把锁
                if (instance == null) {
                    instance = new Singleton5();
                }
            }
        }
        return instance;
    }
}
