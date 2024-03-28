package 结构型模式.No9外观模式.外观角色;

import 结构型模式.No9外观模式.子系统角色.Aircondition;
import 结构型模式.No9外观模式.子系统角色.Light;
import 结构型模式.No9外观模式.子系统角色.Tv;

/**
 * 外观（Facade）角色：为多个子系统对外提供一个共同的接口。
 *
 * 智能音箱
 */
public class SmartAppliancesFacade {
    private Light light;
    private Tv tv;
    private Aircondition aircondition;

    public SmartAppliancesFacade(){
        light = new Light();
        tv = new Tv();
        aircondition = new Aircondition();
    }

    public void say(String message){
        if (message.contains("打开")){
            on();
        }else if (message.contains("关闭")){
            off();
        }else {
            System.out.println("我还听不懂你说的");
        }
    }

    private void off() {
        light.off();
        tv.off();
        aircondition.off();
    }

    private void on() {
        light.on();
        tv.on();
        aircondition.on();
    }
}
