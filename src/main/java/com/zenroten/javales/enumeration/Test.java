package com.zenroten.javales.enumeration;

/**
 * @author Zr
 * @create 2020-02-22 13:45
 */
public class Test {
    public static void main(String[] args) {

        SHUAI_MA shuaiMa = SHUAI_MA.SHUAI;//声明即赋值
        //在类的定义和使用中，传递
        Person person = new Person();
        person.setShuaiMa(shuaiMa);

        //在switch使用中传递
        switch (shuaiMa) {
            case SHUAI:
                break;

            case  FEI_CHANG_SHUAI:
                break;
        }
    }
}