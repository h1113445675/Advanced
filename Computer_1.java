package Advanced;
/*设计一个笔记本电脑类
* 设计一个可插拔接口
* 设计一个鼠标类，并实现方法
* 设计一个键盘类，并实现方法
* 设计一个显示器类，并实现方法
* 设计一个打印机类，并实现方法
* 创建多个对象，演示接口的作用
* */

public class Computer_1 {
    public static void main(String[] args) {
        InsertDrawable I1 = new Mouse();
        InsertDrawable I2 = new Monitor();
        InsertDrawable I3 = new KeyBoard();
        InsertDrawable I4 = new Printer();
        Computer c1 = new Computer(I1);
        Computer c2 = new Computer(I2);
        Computer c3 = new Computer(I3);
        Computer c4 = new Computer(I4);
        c1.use();
        c2.use();
        c3.use();
        c4.use();
    }
}
class Computer{//笔记本电脑类
    private InsertDrawable insertDrawable;

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }
    public Computer(InsertDrawable insertDrawable){//有参构造
        this.insertDrawable=insertDrawable;
    }
    public void use(){//调用接口实现方法
        insertDrawable.keyBoard();
        insertDrawable.monitor();
        insertDrawable.mouse();
        insertDrawable.printer();
    }
}
 interface InsertDrawable{//接口类
    void mouse();//四种方法
    void keyBoard();
    void monitor();
    void printer();
}
class Mouse implements InsertDrawable{
    public void mouse(){
        System.out.println("鼠标在点击");
    }
    public void keyBoard(){}
    public void monitor(){}
    public void printer(){}

}
class KeyBoard implements InsertDrawable{
    public void mouse(){}
    public void keyBoard(){
        System.out.println("键盘在打字");
    }
    public void monitor(){}
    public void printer(){}

}
class Monitor implements InsertDrawable{
    public void mouse(){}
    public void keyBoard(){}
    public void monitor(){
        System.out.println("显示器显示图片");
    }
    public void printer(){}

}
class Printer implements InsertDrawable{
    public void mouse(){}
    public void keyBoard(){}
    public void monitor(){}
    public void printer(){
        System.out.println("打印机打印文件");
    }

}