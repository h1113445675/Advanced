package Advanced.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Test_01 {
    public static void main(String[] args) {
        Collection a =new ArrayList();
        a.add("a");
        a.add("b");
        System.out.println(a.isEmpty());
        System.out.println("集合中的元素个数="+a.size());
        a.clear();
        System.out.println(a.isEmpty());
        System.out.println("集合中的元素个数="+a.size());
        User u1 = new User();
        User u2 = new User();
        User u3 = new User();
        u1.setName("张强");
        u2.setName("李峰");
        u3.setName("张强");
        a.add(u1);
        a.add(u2);
        a.add(u3);
        //迭代集合
        Iterator c = a.iterator();
        while(c.hasNext()){
            Object obj= c.next();
            System.out.println(obj);
        }
        System.out.println(a.contains(u2));


    }
}
class User {
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    private String name;


    public boolean equals(Object o) {
        if (o == null || !(o instanceof User)) return false;
        if (o == this) return true;
        User u = (User) o;
        return u.name.equals(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
