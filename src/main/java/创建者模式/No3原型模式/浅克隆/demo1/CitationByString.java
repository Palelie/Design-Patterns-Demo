package 创建者模式.No3原型模式.浅克隆.demo1;

/**
 * 原型模式：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型对象相同的新对象。
 *
 * 原型模式包含如下角色：
 *   抽象原型类：规定了具体原型对象必须实现的的 clone() 方法。
 *   具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 *   访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 *
 *  原型模式的克隆分为浅克隆和深克隆：
 *      浅克隆：创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址。
 *      深克隆：创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
 *
 *  使用场景：
 *    对象的创建非常复杂，可以使用原型模式快捷的创建对象。
 *    性能和安全要求比较高。
 */

/**
 * Java中的Object类中提供了 `clone()` 方法来实现浅克隆。
 * Cloneable 接口是上面的抽象原型类，而实现了Cloneable接口的子实现类就是具体的原型类。
 */
public class CitationByString implements Cloneable{
    private String name;

    public CitationByString(){
        System.out.println("新建奖状");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //String类型每次赋值都会创建一个新的String对象重新赋值，因此该属性地址不再与原型类的相同
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学：在2024学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public CitationByString clone() throws CloneNotSupportedException {
        return (CitationByString) super.clone();
    }
}
