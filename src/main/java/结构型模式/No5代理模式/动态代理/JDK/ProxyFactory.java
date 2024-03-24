package 结构型模式.No5代理模式.动态代理.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂，用来创建代理对象
 */
public class ProxyFactory {
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){
        //使用Proxy获取代理对象
        /*
            newProxyInstance()方法参数说明：
            ClassLoader loader ： 类加载器，用于加载代理类，使用真实对象的类加载器即可
            Class<?>[] interfaces ： 真实对象所实现的接口，代理模式真实对象和代理对象实现相同的接口
            InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets proxy = (SellTickets) Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                station.getClass().getInterfaces(), //此处获取的就是SellTickets.class,相当于 new Class[]{SellTickets.class}
                new InvocationHandler() {
                    /*
                        InvocationHandler中invoke方法参数说明：
                        proxy ： 实际代理的对象
                        method ： 对应于在代理对象上调用的接口方法的 Method 实例
                        args ： 代理对象调用接口方法时传递的实际参数
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代售点收取手续费");
                        //执行真实对象
                        Object result = method.invoke(station, args);
                        return result;
                    }
                }
        );
        return proxy;
    }
}
