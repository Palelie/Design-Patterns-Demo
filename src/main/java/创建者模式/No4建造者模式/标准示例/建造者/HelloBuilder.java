package 创建者模式.No4建造者模式.标准示例.建造者;

import 创建者模式.No4建造者模式.标准示例.产品.Bike;

/**
 * 具体建造者类（ConcreteBuilder）：实现 Builder 接口，完成复杂产品的各个部件的具体创建方法。在构造过程完成后，提供产品的实例。
 */
public class HelloBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("蓝色车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
