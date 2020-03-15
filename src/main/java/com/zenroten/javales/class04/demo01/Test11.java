package com.zenroten.javales.class04.demo01;

/**
 * @author Zr
 * @create 2020-03-11 18:38
 */
public class Test11 {
    public static void main(String[] args) {
        int a,b,c,n;
        for(n=100;n<=1000;n++){
            a=n%10;
            b=n/10%10;
            c=n/100%10;
            if(n==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))
                System.out.print(n+
                        "  ");
        }
    }
}