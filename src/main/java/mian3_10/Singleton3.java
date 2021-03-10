package mian3_10;
/*
饿汉式单例模式
与第一种相比，new写在一个静态代码块里
 */
public class Singleton3 {
    public static final Singleton3 INSTANCE;
    static {
        INSTANCE = new Singleton3();  //区别在这
    }

    private Singleton3(){

    }
}

/*
实例化单例模式方法：
Singleton3 s = Singleton3.INSTANCE;
 */
