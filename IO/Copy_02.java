package Advanced.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy_02 {
    public static void main(String[] args) throws IOException {

            FileReader in = null;
            FileWriter out = null;
            try{
                in = new FileReader("C:\\Users\\h1113445675\\Desktop\\121.txt");
                out = new FileWriter("C:\\Users\\h1113445675\\Desktop\\饥荒.txt");
                char[] chars = new char[50 * 1024];
                int readCount = 0;
                while ((readCount = in.read(chars)) != -1) {
                    out.write(chars, 0, readCount);
            }
            out.flush();
        }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }


    }

}
