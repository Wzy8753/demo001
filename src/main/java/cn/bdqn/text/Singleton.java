package cn.bdqn.text;

/**
 * 懒汉 线程不安全 加锁synchronized 线程安全 但是效率不高
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void sayHai(){
        System.out.println("当前的内存地址是"+singleton);
    }
}
