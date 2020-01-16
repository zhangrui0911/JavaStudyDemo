package com.zeroten.string;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-15 14:09
 */
public class StringTest {


    @Test
    public void test字符串内存使用() {

        String str1 = "hello";
        String str2 = "hello";

        System.out.println(str1 == str2);

        String str3 = "hello world";
        String str4 = str1 + " world";

        System.out.println(str3 == str4);

        String str5 = new String("hello");
        String str6 = new String("hello");
        System.out.println(str5 == str6);

        String str7 = str6.intern();
        System.out.println(str1 == str7);

    }


    @Test
    public void testLength() {
        String str1 = "hello, world";
        System.out.println(str1.length());

        String str2 = "hello,\uD835\uDD5D\uD835\uDD60\uD835\uDD60\uD835\uDD5C";
        System.out.println(str2);
        System.out.println(str2.length());//获取字符长度
        System.out.println(str2.codePointCount(0, str2.length()));//获取字符的代码点数
    }

    @Test
    public void testSubString() {

        String str1 = "hello, china.";
        //第一个参数是从第几个字符开始截取，第二个参数是截取到第几个字符但不包括该字符
        String str2 = str1.substring(7, 10);
        System.out.println(str2);

        //如果要截取到字符串的最后一位，也可不传第二个参数
        String str3 = str1.substring(7);
        System.out.println(str3);

        String str4 = str1.substring(7, str1.length() - 1);
        System.out.println(str4);

    }

    @Test
    public void testFormat() {
        String str1 = "大写a： " + 'A' + " " + "\n";
        System.out.println(str1);

        String str2 = String.format("大写a：%c %n", 'A');
        System.out.println(str2);

        String str3 = String.format("大写a：%c, 它的 ASCII 码是：%d %n", 'A', (int) 'A');
        System.out.println(str3);
    }

    @Test
    public void testEquals() {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }


    @Test
    public void testJu() {
        String str = "hello";
        System.out.println(str.startsWith("h"));

        System.out.println(str.endsWith("o"));
        System.out.println(str.endsWith("2"));

        System.out.println(str.contains("e"));
        System.out.println(str.contains("ll"));
        System.out.println(str.contains("lle"));
    }

    @Test
    public void testFind() {
        String str1 = "hello, world, today is 2019-12-10. say hi to me.";

        //查找第一个出现该字符的位置下标
        int at1 = str1.indexOf("o");
        System.out.println(at1);
        int at2 = str1.indexOf("o", 7);
        System.out.println(at2);

        //如果没有要查找的字符，返回-1
        int at3 = str1.indexOf("z", 7);
        System.out.println(at3);

        int index = -1;
        do{
            int at4 = str1.indexOf("o", index + 1);
            if(at4 == -1){
                break;
            }
            System.out.println(String.format("第 %d 位是小写字母o", at4 + 1));

            index = at4;
        } while(true);


        int index2 = str1.length();
        do{
            int at5 = str1.lastIndexOf("o", index2 - 1);
            if(at5 == -1){
                break;
            }

            System.out.println(String.format("第 %d 位是小写字母o：" , at5 + 1));
            index2 = at5;
        } while (true);
    }

    @Test
    public void testRepl() {
        System.out.println("hello,world".replace("o", "O"));
    }

    @Test
    public void testRemovePlace() {
        String str1 = "  hello,   world  !   ";
        String str2 = "HELlo WORLD";
        System.out.println(str1.trim());
        System.out.println(str1.toUpperCase());

        System.out.println(str2.toLowerCase());

    }

    @Test
    public void testNewStringBuilder1() {

        //这种写法在未经优化时，会生成多个临时的变量
        String str1 = "hello";
        str1 += ",";
        str1 += "world";
        str1 += ".";
        System.out.println(str1);


        StringBuilder sb1 = new StringBuilder();
        sb1.append("hello");
        sb1.append(',');
        sb1.append("world");
        sb1.append(".");
        System.out.println(sb1.length());
        System.out.println(sb1.toString());

        //设置StringBuilder的长度，当执行toString就去时，就会根据设置的长度生成String字符串
        /*sb1.setLength(10);
        System.out.println(sb1);*/

        sb1.setLength(20);
        System.out.println(sb1);
    }

    @Test
    public void testNewStringBuilder2() {

        //这种写法在未经优化时，会生成多个临时的变量
        String str1 = "hello";
        str1 += ",";
        str1 += "world";
        str1 += ".";
        System.out.println(str1);


        StringBuffer sb1 = new StringBuffer();
        sb1.append("hello");
        sb1.append(',');
        sb1.append("world");
        sb1.append(".");
        System.out.println(sb1.length());
        System.out.println(sb1.toString());

        //设置StringBuilder的长度，当执行toString就去时，就会根据设置的长度生成String字符串
        /*sb1.setLength(10);
        System.out.println(sb1);*/

        sb1.setLength(20);
        System.out.println(sb1);
    }

    @Test
    public void testOpt1() {
        //会产生三个变量hello、,world、hello,world，造成内存的浪费
        //JVM对其进行了优化，其实直接将字符串拼接起来
        String str1 = "hello" + ",world";
    }

    @Test
    public void testOpt2() {
        String str1 = "hello,world.";
        System.out.println(str1);
    }

    @Test
    public void testOpt3() {
        long start = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 50000; i++){
            str += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(String.format("耗时 %d ms", (end - start)));


        str = "";
        long start1 = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(i);
            str = sb.toString();
        }

        long end1 = System.currentTimeMillis();
        System.out.println(str.length());
        System.out.println(String.format("耗时 %d ms", (end1 - start1)));

        str = "";
        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++){
            sb.append(i);
        }
        str = sb.toString();

        long end2 = System.currentTimeMillis();
        System.out.println(String.format("耗时 %d ms", (end2 - start2)));
    }
}