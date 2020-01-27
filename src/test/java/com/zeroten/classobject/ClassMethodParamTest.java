package com.zeroten.classobject;

import org.testng.annotations.Test;

/**
 * @author Zr
 * @create 2020-01-26 14:26
 */
public class ClassMethodParamTest {

    private void changePrimitive(int numb){
        System.out.println("传入的值：" + numb);
        numb = 20;
        System.out.println("修改后：" + numb);
    }

    private void changePrimitive(StringBuilder sb) {
        System.out.println("传入后hashcode：" + sb.hashCode());
        System.out.println("传入的值：" + sb);
        sb.append("-追加");
        System.out.println("修改后的值：" + sb);

        sb = new StringBuilder();
        sb.append("新字符串");
        System.out.println("sb ==新字符串=== " + sb.toString());
        System.out.println("修改后的hashcode：" + sb.hashCode());

    }

    @Test
    public void testModifyMethod() {
/*        int numb = 10;
        changePrimitive(numb);
        System.out.println("调用方法传入值：" + numb);*/

        StringBuilder sb = new StringBuilder();
        sb.append("字符串");

        System.out.println("传入前hashcode：" + sb.hashCode());
        changePrimitive(sb);

        System.out.println("sb == " + sb.toString());


    }
}