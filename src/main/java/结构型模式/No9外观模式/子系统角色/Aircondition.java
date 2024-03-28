package 结构型模式.No9外观模式.子系统角色;

/**
 * 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
 *
 * 空调类
 */
public class Aircondition {
    public void on(){
        System.out.println("开空调");
    }

    public void off(){
        System.out.println("关空调");
    }
}
