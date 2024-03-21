package 创建者模式.No2工厂模式.工厂方法模式.产品;

/**
 * 具体产品类（拿铁咖啡）
 */
public class LatteCoffee implements Coffee {
    public String getName() {
        return "拿铁咖啡";
    }

    public void addMilk() {
        System.out.println("加牛奶");
    }

    public void addSugar() {
        System.out.println("加糖");
    }
}
