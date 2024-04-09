package 行为型模式.No20访问者模式.访问者角色;

import 行为型模式.No20访问者模式.元素角色.Cat;
import 行为型模式.No20访问者模式.元素角色.Dog;

/**
 * 具体访问者（ConcreteVisitor）角色：给出对每一个元素类访问时所产生的具体行为。
 */
public class Someone implements Person{
    /*
      将不同功能和性质的访问者分离开来（其他人类）
     */
    @Override
    public void visit(Cat cat) {
        System.out.println("其他人给猫喂食");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("其他人给狗喂食");
    }
}
