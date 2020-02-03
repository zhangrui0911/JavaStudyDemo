package com.zenroten.javales.innerclass;

/**
 * @author Zr
 * @create 2020-01-29 13:11
 */
public class OuterClass {

    private Integer index;
    private String name;

    public OuterClass(Integer index, String name) {
        this.index = index;
        this.name = name;
    }

    //内部类：定义在其他类中的类，称为内部类
    public class InnerClass{
        private String name;

        public InnerClass(String name) {
            this.name = name;
        }

        public void printInfo(){
            /*StringBuilder tmp = new StringBuilder();
            tmp.append("外围类 index=");
            tmp.append(index);
            tmp.append(", 外围类 name=");
            //tmp.append(name);//访问的是内部类的变量
            //访问外部类的变量
            tmp.append(OuterClass.this.name);
            System.out.println(tmp.toString());*/



            //使用局部内部类
            /*String name = "方法";
            class PrintClass{
                void print(){
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类 index=");
                    tmp.append(index);
                    tmp.append(", 外围类 name=");
                    //tmp.append(name);//访问的是内部类的变量
                    //访问外部类的变量
                    tmp.append(OuterClass.this.name);
                    tmp.append(InnerClass.this.name);
                    tmp.append(name);

                    System.out.println(tmp.toString());
                }
            }

            new PrintClass().print();*/


            new PrintClass("类名"){
                @Override
                public void print(){
                    StringBuilder tmp = new StringBuilder();
                    tmp.append("外围类 index=");
                    tmp.append(index);
                    tmp.append(", 外围类 name=");
                    //tmp.append(name);//访问的是内部类的变量
                    //访问外部类的变量
                    tmp.append(OuterClass.this.name);
                    tmp.append(InnerClass.this.name);
                    tmp.append(super.name);
                    tmp.append(name);

                    System.out.println(tmp.toString());
                }
            }.print();

        }

    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass(1, "我是外部类");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass("我是内部类");
        innerClass.printInfo();


    }


}