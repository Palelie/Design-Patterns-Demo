package 创建者模式.No4建造者模式.标准示例.产品;

/**
 * 产品类（Product）：要创建的复杂对象。
 */
public class Bike {
    //车架
    private String frame;
    //座椅
    private String seat;

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
