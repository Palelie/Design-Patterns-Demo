package 行为型模式.No20访问者模式.访问者角色;

import 行为型模式.No20访问者模式.元素角色.Cat;
import 行为型模式.No20访问者模式.元素角色.Dog;

/**
 * 抽象访问者（Visitor）角色：
 *   定义了对每一个元素`（Element）`访问的行为，它的参数就是可以访问的元素
 *   它的方法个数理论上来讲与元素类个数（Element的实现类个数）是一样的，从这点不难看出，访问者模式要求元素类的个数不能改变。
 */
public interface Person {
    //访问者角色对不同的元素角色的访问方法
    void visit(Cat cat);

    void visit(Dog dog);

}
