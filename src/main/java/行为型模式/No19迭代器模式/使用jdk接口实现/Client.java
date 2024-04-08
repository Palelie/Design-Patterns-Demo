package 行为型模式.No19迭代器模式.使用jdk接口实现;

import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.Student;
import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.StudentAggregate;
import 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色.StudentAggregateImpl;
import 行为型模式.No19迭代器模式.自定义实现迭代器.迭代器角色.StudentIterator;
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
