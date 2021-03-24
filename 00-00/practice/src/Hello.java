/*
 * Detail:此项目文件专门用于本人Java学习
 * Date:2020-3-20
 * Author:FYJ
 * Project Name:practice
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.io.*;

public class Hello {
    public static void main(String[] args) {
        String dirname = "/tmp";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("目录 " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname + " 不是一个目录");
        }
    }
}

//    //演示 System.out.write().
//    int b;
//    b = 'A';
//    System.out.write(b);
//    System.out.write('\n');


//    // 使用 BufferedReader 在控制台读取字符
//    public static void main(String[] args) throws IOException {
//        // 使用System.in创建BufferReader
//        BufferedReader w = new BufferedReader(new InputStreamReader(System.in));
//        String c;
//        System.out.println("请输入字符，按'#'退出输入!");
//        // 读取字符串
//        do {
//            c = (String) w.readLine();
//            System.out.println(c);
//        } while (!c.equals("#"));
//    }

//    public static void main(String[] args) {
//        double a = 1.2;
//        double b = 1.3;
//        double c = 1.4;
//        double d = 1.5;
//        double e = 1.6;
//
//        double f = -0.8;
//        double g = -0.4;
//        double h = -0.5;
//
//        System.out.println(Math.round(a));
//        System.out.println(Math.round(b));
//        System.out.println(Math.round(c));
//        System.out.println(Math.round(d));
//
//        System.out.println(Math.round(e));
//        System.out.println(Math.round(f));
//        System.out.println(Math.round(g));
//        System.out.println(Math.round(h));
//        int [] num = {1,2,4,5,6,78,9,0}

//        int[] num = new int[40];
//        num[0] = 3;
//        num[1] = 4;
//        System.out.println(num.length);
//        for (int i=0 ; i<num.length; i++){
//            System.out.println(num[i]);
//        }


//        String str = "HelloWorld";
//        char[] data = str.toCharArray();// 将字符串转为数组
//        for (int x = 0; x < data.length; x++) {
//            System.out.print(data[x] + "  ");
//            data[x] -= 32;
//            System.out.print(data[x] + "  ");
//        }
//        System.out.println(new String(data));
//        }

//        int [] num = new int[20];
//        System.out.println(num.length);

//        Date d = new Date();
//        System.out.println(d.toString());
//        Calendar d = new Calendar.getInstance();
//        System.out.println(d);

//        int [] num = {1,2,3,4,5,6,7,8,9,10};
//        for (int item : num)
//        {
//            System.out.println(item);
//        }


//    }
//}
