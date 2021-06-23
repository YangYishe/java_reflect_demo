package com.mooc.demo;

import java.lang.reflect.Method;

public class ClassUtil {
    /**
     * 打印类的信息,包括类的成员变量,成员函数
     * @param obj obj
     */
    public static void printClassMessage(Object obj){
        //要获取类的信息,首先要获取类的类类型
        //传递的是哪个子类的对象,c就是该子类的类类型
        Class c=obj.getClass();
        //获取类的名称
        System.out.println("类的名称是:"+c.getName());

        /*
         * methos类,方法对象
         * 一个成员方法就是一个Method对象
         * getMethods()获取的是所有public函数,包括父类继承而来的
         * getDeclaredMethods()获取的是所有该类自己声明的方法,不问访问权限
         */
        Method[] ms=c.getMethods();
        Method[] ms2=c.getDeclaredMethods();
        for (Method m : ms) {
            //得到方法的返回值类型的类类型
            Class returnType=m.getReturnType();
            System.out.print(returnType.getName()+" ");

            //得到方法的名称
            System.out.print(m.getName()+"(");
            //获取参数类型->得到的是参数列表的类的类类型
            Class[] paramTypes=m.getParameterTypes();
            for (Class cp : paramTypes) {
                System.out.print(cp.getName()+",");
            }
            System.out.println(")");
        }
    }
}
