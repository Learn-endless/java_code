import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] ret = {97,98,99,100};
        //通过new对象可以将一个字节数组转换成一个字符串，同时可以指定要转换的部分
        String s = new String(ret,1,3);
        //将字符串转换为一个字节数组，同时可以指定编码方式——GBK或utf-8等
        byte[] n = s.getBytes("GBK");
        System.out.println(Arrays.toString(n));
        System.out.println(s);
    }

    public static void main_1(String[] args) {
        String str = "abcdef";
        char[] ret = {'a','b','h','e','l','l','o'};
        //new对象，将一个字符数组转换成一个字符串，可以指定转换一部分
        String s = new String(ret,2,3);
        //将一个字符串中下标为n的值转换成一个字符  字符串.charAt(下标)
        char ch = str.charAt(1);
        System.out.println(ch);
        System.out.println(s);
        //将一个字符串转换成一个字符数组 字符串.toCharArray()
        char[] temp = str.toCharArray();
        System.out.println(Arrays.toString(temp));

        char b = 48;
        //判断一个字符是不是数字字符 Character.isDigit()
        boolean t = Character.isDigit(100);
        System.out.println(t);
    }
}
