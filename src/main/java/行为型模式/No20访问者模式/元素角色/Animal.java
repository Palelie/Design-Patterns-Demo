package 行为型模式.No20访问者模式.元素角色;

/**
 * 抽象元素（Element）角色：定义了一个接受访问者的方法（`accept`），其意义是指，每一个元素都要可以被访问者访问。
 */
import 行为型模式.No20访问者模式.访问者角色.Person;

public interface Animal {
    //元素角色接受访问者的方法
    void accept(Person person);
}
