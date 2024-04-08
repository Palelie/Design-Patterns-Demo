package 行为型模式.No19迭代器模式.自定义实现迭代器.迭代器角色;

import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.Student;

import java.util.List;

/**
 * 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> studentList;
    private int position = 0;

    public StudentIteratorImpl(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return position < studentList.size();
    }

    @Override
    public Student next() {
        if (position >= studentList.size()){
            return null;
        }
        return studentList.get(position++);
    }
}
