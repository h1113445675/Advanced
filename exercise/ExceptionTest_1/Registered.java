package Advanced.exercise.ExceptionTest_1;

public class Registered {
    private String userName;

    private String passWord;

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public Registered(String userName,String passWord) throws UserNameException, PassWordException {
        if(null==userName||userName.length()<6||userName.length()>14)
            throw new UserNameException("用户名格式错误！！！");
        if(null==passWord||passWord.length()<8||passWord.length()>16)
            throw new PassWordException("密码格式错误！！！");
        this.setPassWord(passWord);
        this.setUserName(userName);
        System.out.println("注册成功！ 用户名："+this.getUserName()+" 密码："+this.getPassWord());
    }

}
