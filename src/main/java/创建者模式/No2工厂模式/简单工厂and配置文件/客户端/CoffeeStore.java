package 创建者模式.No2工厂模式.简单工厂and配置文件.客户端;

import 创建者模式.No2工厂模式.简单工厂and配置文件.产品.Coffee;
import 创建者模式.No2工厂模式.简单工厂and配置文件.工厂.CoffeeFactoryByProperties;

/**
 * 拓展——简单工厂+配置文件解除耦合
 * 可以通过工厂模式+配置文件的方式解除工厂对象和产品对象的耦合。
 * 在工厂类中加载配置文件中的全类名，并创建对象进行存储，客户端如果需要对象，直接进行获取即可。
 */

/**
 * 咖啡店：调用工厂创建产品对象
 */
public class CoffeeStore {
    public Coffee orderCoffee(String coffeeName){
        //调用工厂创建对象，具体创建对象的过程和方式不可见
        Coffee coffee = CoffeeFactoryByProperties.createCoffee(coffeeName);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

    /**
     * 客户端
     */
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
