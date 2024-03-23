package 创建者模式.No4建造者模式.标准示例.指挥者;

import 创建者模式.No4建造者模式.标准示例.产品.Bike;
import 创建者模式.No4建造者模式.标准示例.建造者.Builder;

/**
 * 指挥者类（Director）：调用具体建造者来创建复杂对象的各个部分，在指导者中不涉及具体产品的信息，只负责保证对象各部分完整创建或按某种顺序创建。
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    /**
     * 指挥者本身不生产组件，只使用构建者的零件指挥组装
     */
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
