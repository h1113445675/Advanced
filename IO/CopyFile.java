package Advanced.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("C:\\Users\\h1113445675\\Pictures\\QQ浏览器截图\\QQ浏览器截图20200826001627.png");
            fos = new FileOutputStream("C:\\Users\\h1113445675\\Desktop\\QQ.png");
            byte[] bytes = new byte[500*1024];
            int readCount = 0;
            while((readCount = fis.read(bytes))!=-1){
                fos.write(bytes,0,readCount);
            }
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fos != null){
                try{
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
