package 结构型模式.No6适配器模式.类适配器模式.适配者;

/**
 * TF卡实现类
 */
public class TFCardImpl implements TFCard{
    private String msg;
    @Override
    public String readTF() {
        return "TF Card Messages:" + msg;
    }

    @Override
    public void writeTF(String msg) {
        this.msg = msg;
    }
}
