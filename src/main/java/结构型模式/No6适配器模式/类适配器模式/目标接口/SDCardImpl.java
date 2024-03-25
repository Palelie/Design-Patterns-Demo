package 结构型模式.No6适配器模式.类适配器模式.目标接口;

/**
 * SD卡实现类
 */
public class SDCardImpl implements SDCard {
    private String msg;
    @Override
    public String readSD() {
        return "SD Card messages:" + msg;
    }

    @Override
    public void writeSD(String msg) {
        this.msg = msg;
    }
}
