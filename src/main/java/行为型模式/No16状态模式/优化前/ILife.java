package 行为型模式.No16状态模式.优化前;

/**
 * 电梯接口
 */
public interface ILife {
    //电梯的四个状态
    //开门状态
    public static final int OPENING_STATE = 1;
    //关门状态
    public static final int CLOSING_STATE = 2;
    //运行状态
    public static final int RUNNING_STATE = 3;
    //停止状态
    public static final int STOPPING_STATE = 4;

    void setState(int state);

    //电梯的动作
    void open();
    void close();
    void run();
    void stop();
}
