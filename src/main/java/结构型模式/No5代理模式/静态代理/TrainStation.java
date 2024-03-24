package 结构型模式.No5代理模式.静态代理;

/**
 * 被代理类（需实现接口）：火车站
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
