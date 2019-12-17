package cn.bdqn.text;

public class SingleObject {
    private static SingleObject singleObject = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return singleObject;
    }

    public void sayHai(){
        System.out.println("当前的内存地址是"+singleObject);
    }
}
