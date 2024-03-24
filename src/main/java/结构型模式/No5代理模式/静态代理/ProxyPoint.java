package 结构型模式.No5代理模式.静态代理;

/**
 * 代理类（需实现和被代理类相同的接口）：车票代售点
 */
public class ProxyPoint implements SellTickets{

    private TrainStation station = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取代售手续费");
        station.sell();
    }
}
