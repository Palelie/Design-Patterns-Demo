package No1单例模式.懒汉式.线程安全式.双检锁;

/**
 * 懒汉式（方式三：线程安全式——双检锁）
 * 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 *
 * 双重检查锁模式是一种非常好的单例实现模式，解决了单例、性能、线程安全问题
 * 在多线程的情况下，可能会出现空指针问题，出现问题的原因是JVM在实例化对象的时候会进行优化和指令重排序操作
 * 解决方法：使用 `volatile` 关键字, `volatile` 关键字可以保证可见性和有序性
 *
 * 添加 `volatile` 关键字之后的双重检查锁模式是一种比较好的单例实现模式，能够保证在多线程的情况下线程安全也不会有性能问题。
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

    //在这里添加‘volatile’关键字
    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                //抢到锁之后再次判断是否为空
                if (instance == null){
                    instance = new Singleton();
                }
            }
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
