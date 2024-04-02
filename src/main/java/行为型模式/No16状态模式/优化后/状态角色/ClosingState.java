package 行为型模式.No16状态模式.优化后.状态角色;

import 行为型模式.No16状态模式.优化后.环境角色.Context;

public class ClosingState extends LiftState{
    @Override
    public void open() {
        //电梯门关闭了也可以打开
        super.context.setLiftState(Context.openingState);
        super.context.open();
    }

    @Override
    public void close() {
        //电梯门关闭，这是关闭状态要实现的动作
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        //电梯门关上后就运行
        super.context.setLiftState(Context.runningState);
        super.context.run();
    }

    @Override
    public void stop() {
        //电梯门关着，但就是不按楼层
        super.context.setLiftState(Context.stoppingState);
        super.context.stop();
    }
}
