package 行为型模式.No12模板方法模式;

/**
 * 抽象类（Abstract Class）：负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
 */
public abstract class AbstractCooking {

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
    public void pourOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    public abstract void pourFood();

    public abstract void pourSauce();

    public void fry(){
        System.out.println("翻炒");
    }
}
