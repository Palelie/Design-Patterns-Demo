package 行为型模式.No19迭代器模式.自定义实现迭代器.迭代器角色;

import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.Student;

/**
 * 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接口，通常包含 hasNext()、next() 等方法。
 */
public interface StudentIterator {
    boolean hasNext();

    Student next();
}
