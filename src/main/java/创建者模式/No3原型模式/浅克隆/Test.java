package 创建者模式.No3原型模式.浅克隆;

import 创建者模式.No3原型模式.浅克隆.demo1.CitationByString;
import 创建者模式.No3原型模式.浅克隆.demo2.CitationByStudent;
import 创建者模式.No3原型模式.浅克隆.demo2.Student;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建原型类
        CitationByString citationByString1 = new CitationByString();
        citationByString1.setName("张三");

        //使用浅克隆
        CitationByString citationByString2 = citationByString1.clone();
        citationByString2.setName("李四");

        citationByString1.show();
        citationByString2.show();

        System.out.println("================================");

        //创建原型类
        CitationByStudent citationByStudent1 = new CitationByStudent();
        Student student1 = new Student("张三");
        citationByStudent1.setStudent(student1);

        //使用浅克隆
        CitationByStudent citationByStudent2 = citationByStudent1.clone();
        /**
         * 浅克隆：对具体原型类中的引用类型的属性进行引用的复制
         */
        //这么写同时也会更改原型类的属性
//        citationByStudent2.getStudent().setName("李四");

        //正确写法：重新赋予新对象
        citationByStudent2.setStudent(new Student("李四"));

        citationByStudent1.show();
        citationByStudent2.show();
    }
}
