package 行为型模式.No19迭代器模式.自定义实现迭代器.聚合角色;

public class Student {
    private String name;
    private Integer stuNum;

    public Student() {}
    public Student(String name,Integer stuNum) {
        this.name = name;
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStuNum() {
        return stuNum;
    }

    public void setStuNum(Integer stuNum) {
        this.stuNum = stuNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNum=" + stuNum +
                '}';
    }
}
