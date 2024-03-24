package 结构型模式.No5代理模式.动态代理.CGLIB;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private TrainStation station = new TrainStation();
    
    public TrainStation getProxyObject(){
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer =new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(station.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation trainStation = (TrainStation) enhancer.create();
        return trainStation;
    }

    /*
    intercept方法参数说明：
        o ： 代理对象
        method ： 真实对象中的方法的Method实例
        args ： 实际参数
        methodProxy ：代理对象中的方法的method实例
 */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取手续费");
        Object result = method.invoke(station, objects);
        return result;
    }
}
