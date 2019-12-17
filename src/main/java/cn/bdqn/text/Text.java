package cn.bdqn.text;

public class Text {
    public static void main(String[] args) {
        //单例的普通实现方式
        /*SingleObject singleObject = null;
        singleObject = SingleObject.getInstance();
        singleObject.sayHai();
        singleObject.sayHai();*/

        //懒汉模式
        /*Singleton singleton = Singleton.getInstance();
        singleton.sayHai();
        singleton = Singleton.getInstance();
        singleton.sayHai();*/

        //饿汉模式
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.sayHai();
        singleton2 = Singleton2.getInstance();
        singleton2.sayHai();

    }
}
