package 行为型模式.No20访问者模式.元素角色;

import 行为型模式.No20访问者模式.访问者角色.Person;

/**
 * 具体元素（ConcreteElement）角色：
 *   提供接受访问方法的具体实现，而这个具体的实现，通常情况下是使用访问者提供的访问该元素类的方法。
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        //使用访问者提供的访问该元素类的方法
        person.visit(this);
    }
}
