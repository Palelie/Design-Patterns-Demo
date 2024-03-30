package 行为型模式.No12模板方法模式;

/**
 * 具体子类（Concrete Class）：实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的组成步骤。
 */
public class ConcreteClass_tomatoRice extends AbstractCooking{
    @Override
    public void pourFood() {
        System.out.println("倒米饭");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒番茄酱");
    }
}
