package 行为型模式.No16状态模式.优化后.环境角色;

import 行为型模式.No16状态模式.优化后.状态角色.*;

/**
 * 环境（Context）角色：
 *    也称为上下文，它定义了客户程序需要的接口，维护一个当前状态，并将与状态相关的操作委托给当前状态对象来处理。
 *
 * 电梯环境角色类（真正执行命令的是环境角色中的当前状态对象：liftState）
 */
public class Context {
    //定义出所有的电梯状态
    public final static OpeningState openingState = new OpeningState();//开门状态，这时候电梯只能关闭
    public final static ClosingState closeingState = new ClosingState();//关闭状态，这时候电梯可以运行、停止和开门
    public final static RunningState runningState = new RunningState();//运行状态，这时候电梯只能停止
    public final static StoppingState stoppingState = new StoppingState();//停止状态，这时候电梯可以开门、运行

    //定义一个当前电梯状态
    private LiftState liftState;

    public LiftState getLiftState(){
        return this.liftState;
    }

    public void setLiftState(LiftState liftState){
        //当前环境改变
        this.liftState = liftState;
        //把当前的环境通知到各个实现类中
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void run(){
        this.liftState.run();
    }

    public void stop(){
        this.liftState.stop();
    }
}
