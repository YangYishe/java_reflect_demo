package com.mooc.demo;

public class ClassDemo2 {
    public static void main(String[] args) {
        //编译时刻加载类,是静态加载类
        //运行时刻加载类,是动态加载类

        //new创建对象,是静态加载类,在编译时刻就需要加载所有的可能使用到的类
        //通过动态加载类,可以解决需要时才判定是否有其类的问题

        //通过接口implements实现
        //此例难以执行,以视频为主
        try {
            Class<?> c1=Class.forName(args[0]);
            OfficeAble oa=(OfficeAble) c1.newInstance();
            oa.start();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}

