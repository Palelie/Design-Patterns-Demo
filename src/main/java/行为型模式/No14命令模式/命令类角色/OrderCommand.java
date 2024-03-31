package 行为型模式.No14命令模式.命令类角色;

import 行为型模式.No14命令模式.接收者角色.SeniorChef;

import java.util.Map;

/**
 * 具体命令（Concrete  Command）角色：具体的命令，实现命令接口；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。
 */
public class OrderCommand implements Command {
    private SeniorChef seniorChef;
    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDic = order.getFoodDic();
        for(String foodName : foodDic.keySet()){
            seniorChef.makeFood(foodName, foodDic.get(foodName));
        }
        try {
            Thread.sleep(100);//停顿一下 模拟做饭的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(order.getDiningTable() + "桌的饭弄好了");
    }
}
