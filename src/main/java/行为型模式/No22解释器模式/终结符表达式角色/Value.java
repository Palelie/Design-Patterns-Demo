package 行为型模式.No22解释器模式.终结符表达式角色;

import 行为型模式.No22解释器模式.AbstractExpression;
import 行为型模式.No22解释器模式.Context;

/**
 * 终结符表达式（Terminal  Expression）角色：
 *   是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。
 *
 * 具体数值
 */
public class Value extends AbstractExpression {
    private int value;

    //具体数值作为终结符，直接返回自己
    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}
