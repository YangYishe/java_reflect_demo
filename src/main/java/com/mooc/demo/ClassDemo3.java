package com.mooc.demo;

import javax.sound.midi.Soundbank;

public class ClassDemo3 {
    public static void main(String[] args) {
        //int的类类型
        Class c1=int.class;
        //String的类类型 String类的字节码(Cedar老师发明的)
        Class c2=String.class;

        Class c3=double.class;

        Class c4=Double.class;

        Class c5=void.class;

        System.out.println(c1.getName());
        System.out.println(c2.getName());
        //不含包名的类的名称
        System.out.println(c2.getSimpleName());

        System.out.println(c5.getName());

//        ClassUtil.printClassMessage("123");
        ClassUtil.printClassMessage(1);
    }
}
