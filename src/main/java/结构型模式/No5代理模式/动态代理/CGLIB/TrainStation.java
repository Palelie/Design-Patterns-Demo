package 结构型模式.No5代理模式.动态代理.CGLIB;

/**
 * 被代理类（需实现接口）：火车站
 * Cglib实现的代理模式中，代理类作为实际类的子类存在，因此可以对没有实现接口的类使用
 */
public class TrainStation{

    public void sell() {
        System.out.println("火车站卖票");
    }
}
