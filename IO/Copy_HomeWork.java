package Advanced.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Copy_HomeWork {
    public static void main(String[] args) {
        File f1 = new File("D:\\Rainmeter");

        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream(f1.getAbsolutePath());
            out = new FileOutputStream();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
