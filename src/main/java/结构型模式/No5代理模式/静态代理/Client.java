package 结构型模式.No5代理模式.静态代理;
/**
 * 代理（Proxy）模式分为三种角色：
 *
 * * 抽象主题（Subject）类： 通过接口或抽象类声明真实主题和代理对象实现的业务方法。
 * * 真实主题（Real Subject）类： 实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
 * * 代理（Proxy）类 ： 提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。
 */

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //使用代理类
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
