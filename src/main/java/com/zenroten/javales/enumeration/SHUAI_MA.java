package com.zenroten.javales.enumeration;

/**
 * @author Zr
 * @create 2020-02-21 23:40
 */
public enum SHUAI_MA {
    /**
     * The constructor SHUAI_MA(int) is undefined
     * 没找到SHUAI_MA(int)构造函数
     */

    SHUAI(0){
        public boolean isShuai(){
            return true;
        }

        //方法的重写
        public boolean isFeiChangShuai(){
            return false;
        }
    },
    FEI_CHANG_SHUAI(1){
        //方法的重写
        public boolean isShuai(){
            return false;
        }

        public boolean isFeiChangShuai(){
            return true;
        }
    };

    private int i;
    private SHUAI_MA(int i) {
        this.i = i;
    }

    public int getValue(){
        return i ;
    }

    public boolean isShuai(){
        return true;
    }

    public boolean isFeiChangShuai(){
        return true;
    }
}
