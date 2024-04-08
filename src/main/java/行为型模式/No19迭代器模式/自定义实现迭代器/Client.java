package 行为型模式.No19迭代器模式.自定义实现迭代器;

import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.Student;
import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.StudentAggregate;
import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.StudentAggregateImpl;
import 行为型模式.No19迭代器模式.自定义实现迭代器.迭代器角色.StudentIterator;

/**
 * 定义：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 *
 * 迭代器模式主要包含以下角色：
 *   抽象聚合（Aggregate）角色：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
 *   具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 *   抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、next() 等方法。
 *   具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 *
 * 优点：
 *   它支持以不同的方式遍历一个聚合对象，在同一个聚合对象上可以定义多种遍历方式。在迭代器模式中只需要用一个不同的迭代器来替换原有迭代器即可改变遍历算法，我们也可以自己定义迭代器的子类以支持新的遍历方式。
 *   迭代器简化了聚合类。由于引入了迭代器，在原有的聚合对象中不需要再自行提供数据遍历等方法，这样可以简化聚合类的设计。
 *   在迭代器模式中，由于引入了抽象层，增加新的聚合类和迭代器类都很方便，无须修改原有代码，满足 “开闭原则” 的要求。
 * 缺点：
 *   增加了类的个数，这在一定程度上增加了系统的复杂性。
 *
 * 使用场景：
 *   当需要为聚合对象提供多种遍历方式时。
 *   当需要为遍历不同的聚合结构提供一个统一的接口时。
 *   当访问一个聚合对象的内容而无须暴露其内部细节的表示时。
 *
 * 示例：定义一个可以存储学生对象的容器对象，将遍历该容器的功能交由迭代器实现
 */
public class Client {
    public static void main(String[] args) {
        //创建学生集合类
        StudentAggregate studentAggregate = new StudentAggregateImpl();
        //往集合里添加元素
        studentAggregate.addStudent(new Student("张三",001));
        studentAggregate.addStudent(new Student("李四",002));
        studentAggregate.addStudent(new Student("王五",003));
        studentAggregate.addStudent(new Student("赵六",004));
        //获取遍历器
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        //使用遍历器进行遍历
        while (studentIterator.hasNext()){
            Student student = studentIterator.next();
            System.out.println(student);
        }


    }
}
