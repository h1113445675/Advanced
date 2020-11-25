package Advanced.Thread.Thread12306;

/**
 * @author 浮渊
 * @date 2020/11/25 16:48
 */
public class ThreadTest_01 {
    public static void main(String[] args) {
        //创建实例
        Ticket ticket = new Ticket("西安-北京");
        //用实例创建四个线程（进行同一任务）
        Thread t1 = new Thread(new SaleTicket(ticket));
        Thread t2 = new Thread(new SaleTicket(ticket));
        Thread t3 = new Thread(new SaleTicket(ticket));
        Thread t4 = new Thread(new SaleTicket(ticket));
        t1.setName("一号售票窗");
        t2.setName("二号售票窗");
        t3.setName("三号售票窗");
        t4.setName("四号售票窗");

            t1.start();
            t2.start();
            t3.start();
            t4.start();
    }
    public static class SaleTicket implements Runnable{

        private Ticket ticket;
        public SaleTicket(Ticket ticket) {
            this.ticket=ticket;
        }

        @Override
        //线程同步
        public   synchronized void run() {
                while (true) {

                        if (ticket.getCount() == 0)
                            return;
                        ticket.setCount(ticket.getCount() - 1);

                        System.out.println(Thread.currentThread().getName() + "售出一张票，剩余" + ticket.getCount());


                }


        }
    }
}
