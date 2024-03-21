package 创建者模式.No1单例模式.懒汉式.线程安全式.静态内部类;

/**
 * 懒汉式（方式四：线程安全式——静态内部类）
 * 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建
 *
 * 原理：
 * 静态内部类单例模式中实例由内部类创建
 * 由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的, 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
 * 静态属性由于被 `static` 修饰，保证只被实例化一次，并且严格保证实例化顺序。
 *
 * 静态内部类单例模式是一种优秀的单例模式，是开源项目中比较常用的一种单例模式。
 * 在没有加任何锁的情况下，保证了多线程下的安全，并且没有任何性能影响和空间的浪费。
 */

public class Singleton {
    //静态内部类模式在外部类中没有实例对象可以用于判断是否已经实例化
    private static boolean flag = false;
    //私有构造方法
    private Singleton(){
        synchronized(Singleton.class){
            //如果flag为true，说明不是第一次访问内部类，抛异常
            if(flag){
                throw new RuntimeException("不能创建多个对象！");
            }
            flag = true;
        }
    }


    private static class SingletonHolder{
        /**
         * 第一次加载Singleton类时不会去初始化INSTANCE
         * 只有第一次调用getInstance，虚拟机才加载SingletonHolder，并初始化INSTANCE
         * 这样不仅能确保线程安全，也能保证 Singleton 类的唯一性。
         */
        //注意使用final防止被修改
        private static final Singleton INSTANCE= new Singleton();
    }

    //对外提供静态方法获取该对象
    public static Singleton getInstance(){
        //虚拟机加载SingletonHolder
        return SingletonHolder.INSTANCE;
    }

    /**
     * 下面是为了解决序列化反序列化破解单例模式：
     * 在Singleton类中添加`readResolve()`方法，在反序列化时被反射调用
     * 如果定义了这个方法，就返回这个方法的值，如果没有定义，则返回新new出来的对象。
     */
    private Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
