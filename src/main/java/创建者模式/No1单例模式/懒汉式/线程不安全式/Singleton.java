package 创建者模式.No1单例模式.懒汉式.线程不安全式;

/**
 * 懒汉式（方式一：线程不安全式）
 * 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 *
 * 如果是多线程环境，会出现线程安全问题
 */
public class Singleton {
    //私有构造方法
    private Singleton(){
        /*
           防止使用反射调用私有构造方法破解单例模式所需要添加的代码
        */
        if(instance != null) {
            throw new RuntimeException();
        }
    }

    private static Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式：
     * 在Singleton类中添加`readResolve()`方法，在反序列化时被反射调用
     * 如果定义了这个方法，就返回这个方法的值，如果没有定义，则返回新new出来的对象。
     */
    private Object readResolve(){
        return getInstance();
    }


}
