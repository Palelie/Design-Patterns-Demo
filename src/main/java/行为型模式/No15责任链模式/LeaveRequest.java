package 行为型模式.No15责任链模式;

/**
 * 请假条
 */
public class LeaveRequest {
    //姓名
    private String name;
    //请假天数
    private Integer num;
    //请假内容
    private String content;

    public LeaveRequest(String name, Integer num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    public String getContent() {
        return content;
    }
}
