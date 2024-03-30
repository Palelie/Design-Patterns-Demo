package 行为型模式.No12模板方法模式;

public class ConcreteClass_ColaChicken extends AbstractCooking{


    @Override
    public void pourFood() {
        System.out.println("倒鸡肉");
    }

    @Override
    public void pourSauce() {
        System.out.println("倒可乐");
    }
}
