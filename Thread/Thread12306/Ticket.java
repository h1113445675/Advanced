package Advanced.Thread.Thread12306;

/**
 * @author 浮渊
 * @date 2020/11/25 19:17
 */
//创建车票类
public class  Ticket  {
    //车票名
    private String name = null;
    //车票数量
    private int count = 0;
    //订票方法


    public Ticket(String name) {
        this.name = name;
        this.count=200;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
