package 行为型模式.No22解释器模式.终结符表达式角色;

import 行为型模式.No22解释器模式.AbstractExpression;
import 行为型模式.No22解释器模式.Context;

/**
 * 终结符表达式（Terminal  Expression）角色：
 *   是抽象表达式的子类，用来实现文法中与终结符相关的操作，文法中的每一个终结符都有一个具体终结表达式与之相对应。
 *
 * 具体表示符号
 */
public class Variable extends AbstractExpression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    //作为符号终结符，需要去环境中找到自己具体代表的数值
    @Override
    public int interpret(Context context) {
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
