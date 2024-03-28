package 结构型模式.No9外观模式.子系统角色;

/**
 * 子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
 *
 * 电视类
 */
public class Tv {
    public void on(){
        System.out.println("开电视");
    }

    public void off(){
        System.out.println("关电视");
    }
}
