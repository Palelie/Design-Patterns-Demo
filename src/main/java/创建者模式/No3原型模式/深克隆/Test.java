package 创建者模式.No3原型模式.深克隆;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 使用对象流进行深克隆
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //创建原型类
        CitationByStudent citationByStudent1 = new CitationByStudent();
        citationByStudent1.setStudent(new Student("张三"));
        citationByStudent1.show();

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/tempObject.txt"));
        //将c1对象写出到文件中
        oos.writeObject(citationByStudent1);
        oos.close();

        System.out.println("=========================");

        //深拷贝（深克隆）
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/tempObject.txt"));
        //读取对象
        CitationByStudent citationByStudent2 = (CitationByStudent) ois.readObject();
        ois.close();
        //修改对象属性
        citationByStudent2.getStudent().setName("李四");
        citationByStudent2.show();
    }
}
