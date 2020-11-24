package Advanced.Thread;

/**
 * @author 浮渊
 * @date 2020/11/24 15:11
 */
public class ThreadTest_01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i=0;i<1000;i++)
            System.out.println("主线程进程————"+i);
    }
    public static class MyThread extends Thread{
        @Override
        public void run() {
            for(int i=0;i<1000;i++)
                System.out.println("支线程进程————"+i);
        }
    }
}
