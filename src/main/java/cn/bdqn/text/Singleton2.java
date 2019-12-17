package cn.bdqn.text;

/**
 * 饿汉 线程安全
 */
public class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2(){}

    public static Singleton2 getInstance(){
        return singleton2;
    }

    public void sayHai(){
        System.out.println("当前的内存地址是"+singleton2);
    }
}
