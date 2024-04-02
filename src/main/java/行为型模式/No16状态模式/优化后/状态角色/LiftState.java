package 行为型模式.No16状态模式.优化后.状态角色;

import 行为型模式.No16状态模式.优化后.环境角色.Context;

public abstract class LiftState {
    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    //电梯开门
    public abstract void open();
    //电梯关门
    public abstract void close();
    //电梯运行
    public abstract void run();
    //电梯停止
    public abstract void stop();
}
