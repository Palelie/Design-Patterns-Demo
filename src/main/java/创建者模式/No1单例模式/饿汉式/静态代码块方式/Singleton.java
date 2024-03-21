package 创建者模式.No1单例模式.饿汉式.静态代码块方式;

/**
 * 饿汉式——静态代码块方式
 * 饿汉式：类加载就会导致该单实例对象被创建
 * 在静态代码块中创建该类对象
 *
 * 	该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着类的加载而创建。
 * 	instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存的浪费。
 */
public class Singleton {

    //私有构造方法
    private Singleton(){}

    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    //对外提供静态方法获取该对象
    public static Singleton getInstance(){
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
