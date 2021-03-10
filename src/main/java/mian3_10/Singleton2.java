package mian3_10;

/*
饿汉式单例模式：
枚举类型，表示该类型对对象是有限对几个
我们限定为一个时，就是单例
 */
public enum Singleton2 {
    INSTANCE
}

/*
调用该实例方法
Singleton2 s = Singleton2.INSTANCE;
 */