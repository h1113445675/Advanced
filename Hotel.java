package Advanced;
/*模拟酒店管理系统-二维数组
* 支持预定，退订，查看所有房间状态
* */
public class Hotel {//酒店类
    Room[][] rooms= new Room[2][10];//酒店格局固定
    public void show(){
        /*二维数组遍历输出房间信息*/
        for(int i=0;i<rooms.length;i++){
            for(int j=0;j<rooms[i].length;j++)
                System.out.print(rooms[i][j].getNo()+" "+rooms[i][j].getType()+" "+(rooms[i][j].getStatus()?"空闲":"占用")+" ");
        System.out.println();}
    }
    public void Reservation(int no){//预定方法
        if(rooms[no/100-1][no%100-1].getStatus()==false){
            System.out.println("该房间已被预订");
            return;
        }
        rooms[no/100-1][no%100-1].setStatus(false);
        System.out.println("成功预定"+no);
    }
    public void Check(int no){//退订方法
        if(rooms[no/100-1][no%100-1].getStatus()==true){
            System.out.println("该房间未被预定");
            return;
        }
        rooms[no/100-1][no%100-1].setStatus(true);
        System.out.println("成功退订"+no);
    }
    public Hotel(){//无参构造创建酒店具体房间，一楼标准间，二楼豪华间
        for(int i=0;i<rooms.length;i++)
            for(int j=0;j<rooms[i].length;j++)
                if(i==0)
                rooms[i][j]=new Room(100+i*100+j+1,"标准间");
                else rooms[i][j]=new Room(100+i*100+j+1,"豪华间");
    }

    public static void main(String[] args) {
        Hotel h1 = new Hotel();

        h1.Reservation(105);
        h1.Reservation(203);
        h1.Reservation(105);
        h1.Check(101);
        h1.Check(105);
        h1.show();
    }
}
class Room{
    private int no;//房间号
    private String type;//房间类型
    private boolean status;//房间状态

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Room (int no, String type) {
        this.type=type;
        this.no=no;
        status=true;

    }
}

