package Advanced;

public class MyStack {
    private int index;
    private Object[] elements;

    public MyStack(){
        index=0;
        elements=new Object[10];
    }

    public void push(Object obj){
        if(index==10) {
            System.out.println("栈满");
            return;
        }
        elements[index]=obj;
        index+=1;
    }

    public void pop (){
        if(index==0){
            System.out.println("栈空");
            return;
        }
        elements[index-1]=0;
        index-=1;
    }

    public void Show(){
        for(int i =0;i<index;i++)
            System.out.print(elements[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        MyStack m1 = new MyStack();
        m1.pop();
        m1.push(10);
        m1.push(20);
        m1.push(30);
        m1.push(40);
        m1.push(50);
        m1.push(60);
        m1.push(70);
        m1.push(80);
        m1.push(90);
        m1.push(100);
        m1.push(110);
        m1.Show();
    }
}
