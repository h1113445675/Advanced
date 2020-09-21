package Advanced;

public class String_Test {
    public static void main(String[] args) {
        String s = "你是一头猪";
        String b = "我是一个人";
        String a = "abc";
        String d = "AbC";
        String e = "";
        String f = "";
        String g = "";
        String h = "";
        char c = s.charAt(4);
        System.out.println(c);
        int com= s.compareTo(b);
        System.out.println(com);
        boolean con = s.contains("一头");
        System.out.println(con);
        System.out.println(s.endsWith("猪"));
        System.out.println(s.equals(b));
        System.out.println(a.equalsIgnoreCase(d));
        byte bytes[]=a.getBytes();
        for(int i=0;i<bytes.length;i++)
            System.out.println(bytes[i]);
        System.out.println(s.indexOf("一"));
        System.out.println(s.isEmpty());
        System.out.println(e.isEmpty());
        String rep=s.replace("一头","二哥");
        System.out.println(rep);

    }
}
