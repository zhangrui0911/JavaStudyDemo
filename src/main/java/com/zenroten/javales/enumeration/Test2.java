package com.zenroten.javales.enumeration;

/**
 * @author Zr
 * @create 2020-02-22 14:49
 */
public class Test2 {
    public static void main(String[] args) {
        SHUAI_MA shuaiMa = SHUAI_MA.FEI_CHANG_SHUAI;
        System.out.println(shuaiMa);
        System.out.println(shuaiMa.getValue());
        System.out.println(SHUAI_MA.SHUAI.isShuai());
        System.out.println(SHUAI_MA.SHUAI.isFeiChangShuai());
        System.out.println(SHUAI_MA.FEI_CHANG_SHUAI.isShuai());
        System.out.println(SHUAI_MA.FEI_CHANG_SHUAI.isFeiChangShuai());
    }
}