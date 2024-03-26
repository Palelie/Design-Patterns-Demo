package 结构型模式.No7装饰者模式.改造前;

import 结构型模式.No7装饰者模式.改造前.炒面.炒面加配料.BaconFriedNoodles;
import 结构型模式.No7装饰者模式.改造前.炒饭.FriedRice;
import 结构型模式.No7装饰者模式.改造前.炒饭.炒饭加配料.EggFriedRice;

/**
 * 示例：快餐店
 * 快餐店有炒面、炒饭这些快餐，每个套餐可以额外附加鸡蛋、火腿、培根这些配菜，加配菜需要额外加钱，且每个配菜的价钱通常不太一样，那么计算总价就会显得比较麻烦。
 *
 * 使用继承的方式存在的问题：
 * 1. 扩展性不好：
 * 如果要再加一种配料（火腿肠），我们就会发现需要给FriedRice和FriedNoodles分别定义一个子类。如果要新增一个快餐品类（炒河粉）的话，就需要定义更多的子类。
 * 2. 产生过多的子类
 */
public class Client {
    public static void main(String[] args) {
        FriedRice friedRice = new FriedRice();
        System.out.println("点了" + friedRice.getDesc() + "，消费：" + friedRice.getPrice());

        EggFriedRice eggFriedRice = new EggFriedRice();
        System.out.println("点了" + eggFriedRice.getDesc() + "，消费：" + eggFriedRice.getPrice());

        BaconFriedNoodles baconFriedNoodles = new BaconFriedNoodles();
        System.out.println("点了" + baconFriedNoodles.getDesc() + "，消费：" + baconFriedNoodles.getPrice());
    }
}
