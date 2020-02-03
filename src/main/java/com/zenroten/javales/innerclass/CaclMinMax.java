package com.zenroten.javales.innerclass;

/**
 * @author Zr
 * @create 2020-01-30 21:06
 */
public class CaclMinMax {

    public static Integer[] calc(int... numbs){

        Integer min = null;
        Integer max = null;

        for (int numb : numbs) {
            if(min == null || numb < min){
                min = numb;
            }

            if(max == null || numb > max){
                max = numb;
            }
        }
        return new Integer[] {min, max};
    }


    public static Pair calc2(int... numbs){
        Integer min = null;
        Integer max = null;

        for (int numb : numbs) {
            if(min == null || numb < min){
                min = numb;
            }

            if(max == null || numb > max){
                max = numb;
            }
        }
        Pair pair = new Pair(min, max);

        return pair;
    }

    /**
     * 使用静态内部类，将业务逻辑写在静态内部类中
     */
    public static class Pair {
        private int minValue;
        private int maxValue;

        public Pair(int minValue, int maxValue) {
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public int getMinValue() {
            return minValue;
        }

        public void setMinValue(int minValue) {
            this.minValue = minValue;
        }

        public int getMaxValue() {
            return maxValue;
        }

        public void setMaxValue(int maxValue) {
            this.maxValue = maxValue;
        }
    }
}