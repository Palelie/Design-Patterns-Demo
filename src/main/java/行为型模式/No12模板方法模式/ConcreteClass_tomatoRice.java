package 行为型模式.No12模板方法模式;

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
