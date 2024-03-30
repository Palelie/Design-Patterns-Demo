package 行为型模式.No12模板方法模式;

/**
 * 抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 */
public abstract class AbstractCooking {

    /*
      模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法。
     */
    //做饭流程
    public final void cookProcess(){
        //1.倒油
        this.pourOil();
        //2.热油
        this.heatOil();
        //3.倒食材（不同的菜下的食材不同）
        this.pourFood();
        //4.倒调料（不同的菜下的调料不同）
        this.pourSauce();
        //5.翻炒
        this.fry();
    }
    //基本方法（具体方法）：是实现算法各个步骤的方法，是模板方法的组成部分
    public void pourOil(){
        System.out.println("倒油");
    }

    //基本方法（具体方法）
    public void heatOil(){
        System.out.println("热油");
    }

    //基本方法（抽象方法）
    public abstract void pourFood();

    //基本方法（抽象方法）
    public abstract void pourSauce();

    //基本方法（具体方法）
    public void fry(){
        System.out.println("翻炒");
    }
}
