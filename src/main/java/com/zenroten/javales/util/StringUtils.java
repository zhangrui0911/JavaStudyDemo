package com.zenroten.javales.util;

/**
 * @author Zr
 * @create 2020-01-17 0:12
 */
public class StringUtils {

    public static String trimAll(String str){
        StringBuilder sb = new StringBuilder();
        //将字符串转成字符型数组
        char[] chars = str.toCharArray();

        for(int index = 0; index < chars.length; index++){
            //charAt()方法，可以获取字符串中指定下标的单个字符
            //char c = str.charAt(index);
            /*if(c == ' '){
                continue;
            }
            sb.append(c);*/
            //使用数组下标取值是很快的
            if(chars[index] == ' '){
                continue;
            }
            sb.append(chars[index]);
        }
        return sb.toString();
    }

    public static String reverseAll(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for(int index = chars.length - 1; index >= 0; index--){
            sb.append(chars[index]);
        }

        return sb.toString();
    }
}