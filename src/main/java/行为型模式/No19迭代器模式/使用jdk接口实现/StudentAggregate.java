package 行为型模式.No19迭代器模式.使用jdk接口实现;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用JAVA开发的时候，想使用迭代器模式的话，只要自己定义的容器类实现`java.util.Iterable`并实现其中的iterator()方法使其返回一个 `java.util.Iterator` 的实现类就可以了
 */
public class StudentAggregate implements Iterable {
    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(Student student) {
        studentList.remove(student);
    }

    //自定义实现iterator方法
    @Override
    public Iterator iterator(){
        return new StudentIterator();
    }

    //采用内部类的方式实现
    private class StudentIterator implements Iterator{
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < studentList.size();
        }

        @Override
        public Object next() {
            return studentList.get(cursor);
        }
    }
}
