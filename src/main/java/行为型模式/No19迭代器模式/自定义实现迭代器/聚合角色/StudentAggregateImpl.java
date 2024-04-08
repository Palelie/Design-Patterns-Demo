package 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色;

import 行为型模式.No19迭代器模式.自定义实现迭代器.迭代器角色.StudentIterator;
import 行为型模式.No19迭代器模式.自定义实现迭代器.迭代器角色.StudentIteratorImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
 * （相当于ArrayList方法）
 */
public class StudentAggregateImpl implements StudentAggregate {
    List<Student> studentList = new ArrayList<>();
    @Override
    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(studentList);
    }
}
