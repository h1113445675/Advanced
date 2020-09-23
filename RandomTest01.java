package Advanced;

import java.util.Random;

//随机0-100 5个不重复数字 放入一维数组
public class RandomTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        int index = 0;
        int num = 0;
        int [] arr = new int[5];
        for(int i = 0;i<arr.length;i++)
            arr[i]=-1;
        for(int i = 0;i<arr.length;i++){
            num = random.nextInt(101);
            int x = 0;
            for(int m = 0;m<=i;m++) {
                if (num != arr[m]) {
                    x += 1;
                    index=x;
                }
            }
            if (index==i+1)
                arr[i]=num;
            else i--;//数字相同重新该次随机
        }
        for(int i = 0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
