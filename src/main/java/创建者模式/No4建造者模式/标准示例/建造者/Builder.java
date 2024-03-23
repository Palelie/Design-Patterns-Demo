package 创建者模式.No4建造者模式.标准示例.建造者;

import 创建者模式.No4建造者模式.标准示例.产品.Bike;

/**
 * 抽象建造者类（Builder）：这个接口规定要实现复杂对象的那些部分的创建，并不涉及具体的部件对象的创建。
 */
public abstract class Builder {
    protected Bike bike = new Bike();

    /**
     * builder只负责生产其中的组件，不参与组装
     */
    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
