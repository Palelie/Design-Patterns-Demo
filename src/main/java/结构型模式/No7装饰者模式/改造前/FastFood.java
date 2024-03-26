package 结构型模式.No7装饰者模式.改造前;

/**
 * 快餐抽象类
 */
public abstract class FastFood {
    //价格
    private Double price;

    //快餐描述
    private String desc;

    public FastFood(){}

    public FastFood(Double price,String desc){
        this.price = price;
        this.desc = desc;
    }

    //获取价格
    public abstract Double cost();

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
