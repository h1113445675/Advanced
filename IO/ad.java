package Advanced.IO;

import java.io.*;

public class ad {

    public static void main(String[] args) {
        try{
            FileWriter out = new FileWriter("饥荒",true);
            out.write("hello");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
