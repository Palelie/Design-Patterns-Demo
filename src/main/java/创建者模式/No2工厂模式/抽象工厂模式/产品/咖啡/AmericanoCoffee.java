package 创建者模式.No2工厂模式.抽象工厂模式.产品.咖啡;

/**
 * 具体产品类（美式咖啡）
 */
public class AmericanoCoffee implements Coffee {
    public String getName() {
        return "美式咖啡";
    }

    public void addMilk() {
        System.out.println("不加奶，加热水");
    }

    public void addSugar() {
        System.out.println("不加糖");
    }
}
