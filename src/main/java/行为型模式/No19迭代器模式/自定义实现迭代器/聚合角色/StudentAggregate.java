package 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色;

import 行为型模式.No19迭代器模式.自定义实现迭代器.迭代器角色.StudentIterator;

/**
 * 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
 * (相当于List接口）
 */
public interface StudentAggregate {
    void addStudent(Student student);

    void removeStudent(Student student);

    StudentIterator getStudentIterator();
}
