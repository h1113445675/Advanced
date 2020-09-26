package Advanced.exercise.ExceptionTest_1;
//模拟用户登录练习异常使用
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("请输入用户名（6-14位），密码（8-16位）");
        Scanner s = new Scanner(System.in);
        String userName = s.nextLine();
        String passWord = s.nextLine();
        try {
            Registered regis = new Registered(userName,passWord);
        } catch (UserNameException e) {
            e.printStackTrace();
        } catch (PassWordException e) {
            e.printStackTrace();
        }
    }
}
